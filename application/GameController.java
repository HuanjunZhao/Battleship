package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class GameController {

	private GameApplication gameApp;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button singleplayerButton;

    @FXML
    private Button multiplayerButton;

    public void setGameApp(GameApplication app) {
    	gameApp = app;
    }
    
    @FXML
    void singleplayerInitialise(ActionEvent event) {
    	gameApp.initialiseSingleplayer();
    }
    
    @FXML
    void multiplayerInitialise(ActionEvent event) {
    	gameApp.initialiseMultiplayer();
    }
    
    @FXML
    void initialize() {
        assert borderPane != null : "fx:id=\"borderPane\" was not injected: check your FXML file 'GameView.fxml'.";
        assert singleplayerButton != null : "fx:id=\"singleplayerButton\" was not injected: check your FXML file 'GameView.fxml'.";
        assert multiplayerButton != null : "fx:id=\"multiplayerButton\" was not injected: check your FXML file 'GameView.fxml'.";

    }
}
