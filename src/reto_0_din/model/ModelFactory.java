/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_0_din.model;

import java.util.ResourceBundle;

/**
 *
 * Recoge del tipoEjecucion el tipo de modelo
 * y dependiendo de cual haya elegido, mostrara el mensaje 
 * por BD o por fichero
 */
public class ModelFactory {

    //Declaramos las variables que vamos a utilizar
    private ResourceBundle data;
    private final String bd_tipo = "BD";
    private final String file_tipo = "FILE";

    //SELECCIONA EL TIPO DE MODELO DEPENDIENDO DEL TIPO DE ARCHIVO 
    public Model getModel() {

        Model model = null;

        String data = ResourceBundle.getBundle("reto_0_din.TipoEjecucion").getString("model_type");
        if (file_tipo.equals(data)) {
            model = new ModelFileImplementation();
        } else {
            model = new ModelBDImplementation();

        }
        return model;

    }
}
