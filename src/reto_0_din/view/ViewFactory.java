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
    private final String swing_type = "SWING";
    private final String FX_TYPE = "FX";
    

    public View getView() {
        View view = null;

       String data=ResourceBundle.getBundle("RETO_0_DIN.TipoEjecucion").getString("view_type"); //Elige el tipo de vista que quiere utilizar, file o bd.
        if (text_type.equals(data) ){ 
            
              view = new ViewFileImplementation(); 
              
        }else if (swing_type.equalsIgnoreCase(data)){
              view = new ViewSwingImplementation(); 
           
        }else {
             //   view =  (View) new ViewFXImplementation();
                }
        return view;

}
    
    }
