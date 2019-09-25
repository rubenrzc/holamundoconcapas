/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * a class that implemants View 
 * @author ruben
 */
public class SwingViewImplementation implements View {

    /**
     * a method that sets a jframe and show a message in a JoptionPane
     * @param greeting a string with a greeting
     */
    @Override
    public void showGreeting(String greeting) {
        JFrame frame1 = new JFrame();
        JOptionPane.showMessageDialog(frame1, greeting);
        frame1.dispose();
    }
    
}
