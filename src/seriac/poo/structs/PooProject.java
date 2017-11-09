/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.structs;

import seriac.poo.server.config.ServerConfig;
import seriac.poo.structs.Message;
import seriac.poo.structs.PrivateMessage;


/**
 *
 * @author Alexandru
 */
public class PooProject {
    
    public static void main(String[] args)
    {
        Message m1 = new Message("George","Salut");
        Message m2 = new Message("Mihai","Salutare");
        Message m3 = new Message("Andrei","Hehe");
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    
        PrivateMessage pm1 = new PrivateMessage("George","Ion","Salut");
        PrivateMessage pm2 = new PrivateMessage("Mihai","Gigel","Salutare");
        PrivateMessage pm3 = new PrivateMessage("Andrei","Sorin","Hehe");
        
        System.out.println(pm1);
        System.out.println("To: " + pm1.getRecipient());
        System.out.println(pm2);
        System.out.println("To: " + pm2.getRecipient());
        System.out.println(pm3);
        System.out.println("To: " + pm3.getRecipient());
        
        ServerConfig config = new ServerConfig();
        System.out.println("TCP PORT: " + config.getTcpPort());
        System.out.println("Max Clients: " + config.getMaxClients());
    }
}
