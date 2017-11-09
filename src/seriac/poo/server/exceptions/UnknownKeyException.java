/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.server.exceptions;

/**
 *
 * @author Alexandru
 */
public class UnknownKeyException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public UnknownKeyException(String message){
        super(message);
    }
}
