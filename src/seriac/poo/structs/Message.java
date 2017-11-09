/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.structs;

import java.io.Serializable;

/**
 *
 * @author Alexandru
 */
public class Message implements Serializable{
    private final String mSender;
    private final String mContent;
          
    public Message(String sender, String content){
        mSender = sender;
        mContent = content;
    }
    
    @Override
   public String toString()
   {
       return mSender + ":" + mContent;
   }
}
