/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementation implements Model{
    
   @Override
   public String getGreeting(){
       //Cogemos el texto de hola mundo del archivo model y lo devolvemos 
      String text; 
      ResourceBundle text_data; //Resource sirve para adquirir datos de otros archivos
      text_data = ResourceBundle.getBundle("reto_0_din.model.saludo");
      text = text_data.getString("message");
      
      return text;
   }
    
}