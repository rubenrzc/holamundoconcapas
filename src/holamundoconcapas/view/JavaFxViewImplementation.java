/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * this class is a JAVAFX implementatiion for our View interface
 * @author ruben
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View {
    
    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.view.JavaFxViewImplementation");


    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    /**
    * is a greeting
    */
    private String greeting;
    
    /**
     * the start method called after JavaFx aplication initialization
     * @param stage the stage object for the primary window
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        try {
            LOGGER.info("Starting JavaFX start method");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana.fxml"));
            Parent root = (Parent)loader.load();
            FXMLDocumentController viewController = ((FXMLDocumentController)loader.getController());
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
            LOGGER.info("Ending JavaFx start method");

        } catch(Exception e) {
            LOGGER.severe("ERROR in method start");

        }
    }

    /**
     * shows a greeting
     * @param greeting a string to be shown
     */
    @Override
    public void showGreeting(String greeting) {
       
       launch(greeting);
    }
    
    /**
     * initialization method for JavaFx aplication
     * @throws Exception 
     */
    @Override
    public void init() throws Exception {
        this.greeting=getParameters().getRaw().get(0);
    }
    
}
