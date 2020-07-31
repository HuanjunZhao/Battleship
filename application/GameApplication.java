package application;

import model.Board;
import model.ComputerPlayer;
import model.Player;
import model.Referee;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Skeleton for Game class for battleships team battle royal
 * @author Dillon Sahadevan, UCID 30075927
 * @version 1.0
 */
public class GameApplication extends Application{
	private Board boardOne;
	private Board boardTwo;
	private Referee referee;
	private Stage primaryStage;
	
	static final int WINDOWWIDTH = 1280;
	static final int WINDOWHEIGHT = 720;
	
	/**
	 * Default constructor for game class
	 */
	public GameApplication() {
		boardOne = new Board();
		boardTwo = new Board();
		referee = new Referee();
	}
	
	/**
	 * Initializes the game by creating players
	 * and calling necessary functions in Referee.
	 */
	public void initializeGame(String name) {
		Player playerOne = new Player();
		playerOne.setName(new String(name));
		ComputerPlayer playerTwo = new ComputerPlayer();
		playerOne.setPlayerBoard(boardOne);
		playerTwo.setBoard(boardTwo);
		referee.setPlayerOne(playerOne);
		referee.setComputerPlayer(playerTwo);
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/SingleplayerGameView.fxml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		SingleplayerGameController controller = (SingleplayerGameController)loader.getController();
		controller.setGameApp(this);
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		//referee.runTheGame();
	}
	
	public void initializeGame(String name1, String name2) {
		Player playerOne = new Player();
		playerOne.setName(name1);
		Player playerTwo = new Player();
		playerTwo.setName(name2);
	}
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/GameView.fxml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		GameController controller = (GameController)loader.getController();
		controller.setGameApp(this);
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void initialiseSingleplayer() {
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/SingleplayerInitView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		SingleplayerInitController controller = (SingleplayerInitController)loader.getController();
		controller.setGameApp(this);
	}
	
	public void initialiseMultiplayer() {
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/MultiplayerInitView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		MultiplayerInitController controller = (MultiplayerInitController)loader.getController();
		controller.setGameApp(this);
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
