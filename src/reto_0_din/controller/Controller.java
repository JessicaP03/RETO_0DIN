/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.controller;

import reto_0_din.model.Model;
import reto_0_din.view.View;

/**
 *
 * @author 2dam
 */
public class Controller {
    
    public void run(View viewI , Model modelI) throws Exception{ 
      //Declaramos el data 
      String data;
      data = modelI.getGreeting(); //Coje el mensaje de saludos.propierties y lo mete en data
      viewI.showGreeting(data); //Enseña el mensaje que hemos metido en data
        
        
    }
    
}
