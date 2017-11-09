/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import seriac.poo.structs.Message;
import seriac.poo.structs.PrivateMessage;

/**
 *
 * @author Alexandru
 */
public class ClientPeer {
    private final String mSender;
    private final Socket mSocket;
    private final ObjectOutputStream mObjectOutputStream;
    
    public ClientPeer(String sender, Socket communicationSocket) throws IOException{
        mSender = sender;
        mSocket = communicationSocket;
        mObjectOutputStream = new ObjectOutputStream(communicationSocket.getOutputStream());
    }
    
    void sendMessage(String message) throws IOException{
        mObjectOutputStream.writeObject(new Message(mSender, message));
    }
    
    void sendMessage(String message, String recipient)throws IOException{
        mObjectOutputStream.writeObject(new PrivateMessage(mSender, message, recipient));
    }
}
