/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 *
 * @author ruben
 */
public class ModelFactory {
    /**
     * get a Model
     * @return the ModelImplementation implementation.
     */
    public Model getModel() {
        return new FileModelImplementation();
    }
}
