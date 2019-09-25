/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author ruben
 */
public class ViewFactory {
    /**
     * gets a View
     * @return the ViewImplementation implementation.
     */
    public View getView() {
        return new JavaFxViewImplementation();
    }
    
}
