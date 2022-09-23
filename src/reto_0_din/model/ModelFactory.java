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
public class ModelFactory {
    
    //Declaramos las variables que vamos a utilizar
    private ResourceBundle data;
    private final String bd_tipo="BD";
    private final String file_tipo ="FILE";
    
    //SELECCIONA EL TIPO DE MODELO DEPENDIENDO DEL TIPO DE ARCHIVO 
    
    public Model getModel(){
        Model model=null;

       String data=ResourceBundle.getBundle("RETO_0_DIN.TipoEjecucion").getString("model_type"); //Elige el tipo de modelo que quiere utilizar, file o bd.
        if (file_tipo.equals(data)){ 
              model = new  ModelFileImplementation(); //Si elige file implementara la clase correspondiente
        }else{
              model = new  ModelBDImplementation(); //Si elige bd implementara la clase bd
           
        }
        return model;

}
}