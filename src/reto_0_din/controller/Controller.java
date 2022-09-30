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
 * En el metodo run declaramos el data Coje el mensaje de saludos.propierties y
 * lo mete en data Enseña el mensaje que hemos metido en data
 *
 */
public class Controller {

    public void run(View viewI, Model modelI) throws Exception {

        String data;
        data = modelI.getGreeting();
        viewI.showGreeting(data);

    }

}
