/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import java.util.ResourceBundle;

/**
 * class that implements our model interface
 * @author ruben
 */
public class FileModelImplementation implements Model {
    
    /**
     * method that returns our greeting from a properties file 
     * @return a string with our greeting
     */

    @Override
    public String getGreeting() {
       return ResourceBundle.getBundle("holamundoconcapas.model.Parameters").getString("greeting");
    }

    
}
