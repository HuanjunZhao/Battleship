package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MultiplayerInitController {

	private GameApplication gameApp;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField playerTwoTextField;

    @FXML
    private VBox playerTwoVBox;

    @FXML
    private VBox playerOneVBox;

    @FXML
    private StackPane stackPane;

    @FXML
    private TextField playerOneTextField;

    public void setGameApp(GameApplication app) {
    	gameApp = app;
    }
    
    @FXML
    void goToPlayerTwo(ActionEvent event) {
    	playerOneVBox.setVisible(false);
    	playerTwoVBox.setVisible(true);
    }

    @FXML
    void initialiseGame(ActionEvent event) {
    	gameApp.initializeGame(playerOneTextField.getText(),
    			playerTwoTextField.getText());
    }

    @FXML
    void initialize() {
        assert playerTwoTextField != null : "fx:id=\"playerTwoTextField\" was not injected: check your FXML file 'MultiplayerInitView.fxml'.";
        assert playerTwoVBox != null : "fx:id=\"playerTwoVBox\" was not injected: check your FXML file 'MultiplayerInitView.fxml'.";
        assert playerOneVBox != null : "fx:id=\"playerOneVBox\" was not injected: check your FXML file 'MultiplayerInitView.fxml'.";
        assert stackPane != null : "fx:id=\"stackPane\" was not injected: check your FXML file 'MultiplayerInitView.fxml'.";
        assert playerOneTextField != null : "fx:id=\"playerOneTextField\" was not injected: check your FXML file 'MultiplayerInitView.fxml'.";

    }
}
