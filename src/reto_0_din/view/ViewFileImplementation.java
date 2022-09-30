/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.view;

/**
 *
 * COn el metodo showGreeting enseñaremos el mensaje mediante texto
 */
public class ViewFileImplementation implements View { 
    
    @Override
    public void showGreeting(String message){
        System.out.println(message);
        
    }
    
}
