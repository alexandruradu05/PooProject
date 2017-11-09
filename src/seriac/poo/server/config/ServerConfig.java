package seriac.poo.server.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import seriac.poo.server.exceptions.InvalidFormatException;
import seriac.poo.server.exceptions.MissingKeyException;
import seriac.poo.server.exceptions.UnknownKeyException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alexandru
 */
public class ServerConfig {
    private Map<String, String> mProperties;
    private String[] mKnownProperties = {"TCP_PORT", "MAX_CLIENTS"};    
    
    public ServerConfig(String filename) throws IOException, InvalidFormatException, UnknownKeyException, MissingKeyException{
        
        mProperties = new HashMap<>();
        FileInputStream fileInputStream = new FileInputStream(filename);
        Scanner scanner = new Scanner(fileInputStream);
        
        while(scanner.hasNext())
        {
            String line = scanner.nextLine().trim();
            if(line.startsWith("#")|| line.isEmpty()){
                continue;
            }
             if (!line.matches("[a-zA-Z_][a-zA-Z0-9_]*\\s*=\\s*[0-9]+")) {
                throw new InvalidFormatException("Linia " + line + " nu se potriveste cu formatul asteptat!");
            }

        }

        for (String property : mKnownProperties) {
            if (!mProperties.containsKey(property)) {
                throw new MissingKeyException("Cheia " + property + " nu exista in fisier.");
            }
        }
    }
    
    public ServerConfig(){
        
    }
    
    public int getTcpPort(){
        return Integer.parseInt(mProperties.get("TCP_PORT"));
    }
    
    public int getMaxClients(){
        return Integer.parseInt(mProperties.get("MAX_CLIENTS"));
    }
}
