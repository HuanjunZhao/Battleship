package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SingleplayerInitController {

	private GameApplication gameApp;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button continueButton;

    /**
     * Setter for the game application object
     * @param app the GameApplication object
     */
    public void setGameApp(GameApplication app) {
    	gameApp = app;
    }
    
    /**
     * Provides the game application with the entered name
     * Initializes the game through game application
     * @param event
     */
    @FXML
    void continueClicked(ActionEvent event) {
    	gameApp.initializeGame(nameTextField.getText());
    }
    
    /**
     * Initializes the fxml file
     * Checks everything was injected successfully
     */
    @FXML
    void initialize() {
        assert nameTextField != null : "fx:id=\"nameTextField\" was not injected: check your FXML file 'SingleplayerInitView.fxml'.";
        assert continueButton != null : "fx:id=\"continueButton\" was not injected: check your FXML file 'SingleplayerInitView.fxml'.";

    }
}
