/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din;

import java.util.logging.Level;
import java.util.logging.Logger;
import reto_0_din.controller.Controller;
import reto_0_din.model.ModelFactory;
import reto_0_din.view.ViewFactory;

/**
 *
 * @author 2dam (Josu Arroyo y Jessica Para)
 * 
 */
public class RETO_0_DIN {

    /**
     * @param args the command line arguments
     * 
     *Este metodo llama a las factorias de modelo y vista.
     * Llama al controlador para que se ejecute de la manera que esta seleccionada en el TipoEjecucion.
     */
    public static void main(String[] args)   {

        //Declaramos las factorias y el controlador.
       ViewFactory view = new ViewFactory(); 
       ModelFactory model = new ModelFactory(); 
       
       Controller controller = new Controller();
        try {
            controller.run(view.getView(),model.getModel()); //LLamamos al controlador para que pueda elegir entre modelo y vista
        } catch (Exception ex) {
            Logger.getLogger(RETO_0_DIN.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }
