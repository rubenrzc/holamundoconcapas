/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import holamundoconcapas.Aplication;
import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;




/**
 *
 * @author ruben
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
    
    private String greeting="Hola Mundo Ruben";
    
    public FXMLDocumentControllerIT() {
    }
    
    /**
     * test that greeting is setted
     * @param stage
     * @throws Exception 
     */
    public void start(Stage stage) throws Exception{
        JavaFxViewImplementation myapp=new JavaFxViewImplementation();
        myapp.setGreeting(greeting);
        myapp.start(stage);
    }

    /**
     * verify that greeting has text
     */
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#greetingLbl", hasText(greeting));
        //clickOn("#closeBtn");
    }
    
    /**
     * test that greeting is set on clicking the button
     */
    @Test
    public void testButtonClick(){
        clickOn("#closeBtn");
        verifyThat("#greetingLbl", hasText(greeting));
    }
    
}
