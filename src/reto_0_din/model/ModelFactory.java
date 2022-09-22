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
    
    private ResourceBundle data;
    private final String BD_TIPO="BD";
    private final String FILE_TIPO="FILE";
    
    //SELECCIONA EL TIPO DE MODELO DEPENDIENDO DEL TIPO DE ARCHIVO 
    
    public VistaModelo getModel(){
        VistaModelo model=null;
        //aqui ahora lo que hacemos es acceder de la carpeta de aplicacion ,cogemos el tipo de ejecucionque vamos a querer hacer 
        data=ResourceBundle.getBundle("RETO_0_DIN.TipoEjecucion");
        switch(data.getString("model_type")){
          case FILE_TIPO:
              model = new  ModelFileImplementation();
              break;
              //QUITAR LOS COMENTARIOS DE ABAJO CUANDO ESTE ECHO LO DE BASES DE DATOS
          //case BD_TIPO:
            //   model = new  ModelBDImplementation();
             // break;
        }
        
        return model;
    }
}
