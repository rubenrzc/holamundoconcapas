/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * controller of our JavaFx View interface
 *
 * @author ruben
 */
public class FXMLDocumentController {

    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.view.FXMLDocumentController");

    
    @FXML
    private Label greetingLbl;
    private Button closeBtn;
    private String greeting;
    private Stage stage;

    @FXML
    public void handleButtonAction(ActionEvent e) {
        greetingLbl.setText(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void initStage(Parent root) {
        try {
            LOGGER.info("Starting init stage method");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setOnShowing(this::handleOnShowing);
            stage.show();
            LOGGER.info("Ending init stage method");

        }catch(Exception e){
            LOGGER.severe(e.getMessage());

        }
    }

    public void handleOnShowing(WindowEvent e) {
        greetingLbl.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage = stage;
    }
}
