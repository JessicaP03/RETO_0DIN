/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din;

import reto_0_din.controller.Controller;
import reto_0_din.model.ModelFactory;
import reto_0_din.view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class RETO_0_DIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {

        //Declaramos las factorias y el controlador.
       ViewFactory view = new ViewFactory(); 
       ModelFactory model = new ModelFactory(); 
       
       Controller controller = new Controller();
      controller.run(view.getView(),model.getModel()); //LLamamos al controlador para que pueda elegir entre modelo y vista
}
    }
