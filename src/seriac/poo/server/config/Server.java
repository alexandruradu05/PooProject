/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.server.config;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Alexandru
 */
public class Server {
   
    public static void main(String[] args) throws IOException {
        ServerConfig serverConfig = new ServerConfig();
        ServerSocket serverSocket = new ServerSocket(serverConfig.getTcpPort());
        
    }
}
