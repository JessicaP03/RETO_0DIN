/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.view;

import java.util.ResourceBundle;
import reto_0_din.model.Model;
import reto_0_din.model.ModelBDImplementation;
import reto_0_din.model.ModelFileImplementation;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
    private ResourceBundle data;
    private final String text_type = "TEXT";
   
    

    public View getView() {
        View view_t = null;
        View view_swing = null;

       String data=ResourceBundle.getBundle("RETO_0_DIN.TipoEjecucion").getString("view_type"); //Elige el tipo de vista que quiere utilizar, file o bd.
        if (text_type.equals(view_t)){ 
            
              view_t = new  ViewFileImplementation(); 
              
        }else if (text_type.equals(view_swing)){
              view_t = (View) new  ViewSwingImplementation(); 
           
        }else {
                view_t = (View) new ViewFXImplementation();
                }
        return view_t;

}
    
    }
