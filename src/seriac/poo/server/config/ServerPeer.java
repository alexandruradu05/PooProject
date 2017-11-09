/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.server.config;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import seriac.poo.structs.Message;

/**
 *
 * @author Alexandru
 */
public class ServerPeer {
    private final Socket mCommunicationSocket;
    
    public ServerPeer(Socket communicationSocket){
        mCommunicationSocket = communicationSocket;
    }
    
    public void run() throws IOException, ClassNotFoundException{
            ObjectInputStream stream = new ObjectInputStream(mCommunicationSocket.getInputStream());
            while(true){
                Message message = (Message) stream.readObject();
            }
       
    }
}
