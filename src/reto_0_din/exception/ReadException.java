/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.exception;

/**
 *
 * Excepcion de lectura
 */
public class ReadException extends Exception{
     private static final long serialVersionUID = 1L;
    
    public ReadException (String message){
        super(message);
    }
}
