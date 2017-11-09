/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alexandru
 */
public class TextClient {
    private final static String HOST = "127.0.0.1";
    private final static int PORT = 9000;
    
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter username:");
        try{
            Socket communicationSocket = new Socket(HOST, PORT);
            
            String sender = keyboardScanner.nextLine();
            ClientPeer clientPeer = new ClientPeer(sender, communicationSocket);
            while(true){
                String command = keyboardScanner.nextLine();
                
                if(command.equals("/q")){
                    communicationSocket.close();
                    break;
                }
                else if(command.matches("/w\\s+\\w+\\s+.+")){
                    String[] messageParts = command.split("\\s", 3);
                    clientPeer.sendMessage(messageParts[1], messageParts[2]);
                }
                else{
                    clientPeer.sendMessage(command);
                }
            }
        }
        catch (IOException ex){
        }
    }
}
