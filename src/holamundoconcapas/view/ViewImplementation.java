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
public class ViewImplementation implements View {
    /**
     * shows a greeting
     * @param greeting A String that contains a greeting.
     */
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
