/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.model;

import java.util.ResourceBundle;

/**
 *
 * Recoge el saludo con el metodo getGreeting del archivo saludo.properties
 * cuando elegimos mostrarlo por fichero en tipoEjecucion
 */
public class ModelFileImplementation implements Model{
    
   @Override
   public String getGreeting(){
      
      String text; 
      ResourceBundle text_data; //Resource sirve para adquirir datos de otros archivos
      text_data = ResourceBundle.getBundle("reto_0_din.model.saludo");
      text = text_data.getString("message");
      
      return text;
   }
    
}
