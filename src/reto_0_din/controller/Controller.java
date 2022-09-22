/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.controller;

import reto_0_din.model.VistaModelo;
import reto_0_din.view.VistaInterfaz;

/**
 *
 * @author 2dam
 */
public class Controller {
    
    public void run(VistaInterfaz view , VistaModelo model){
      String data;
      data = model.getGreeting();
      view.showGreeting(data);
        
        
    }
    
}
