/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;
import java.util.logging.Logger;

/**
 * clase controler para la aplicacion/controler class for hello world
 * @author ruben
 */
public class Controller {
    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.controller");
    /**
     * este metodo ejecuta la aplicacion logic y enseña un saludo para el model/this method executes the aplication and show greeting
     * @param view the view object.
     * @param model the model object.
     */
    public void run(View view,Model model) {
        try{
            LOGGER.info("Starting run method");
            String greeting = model.getGreeting();
            view.showGreeting(greeting);
            LOGGER.info("Ending run method");
        }
        catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
}
