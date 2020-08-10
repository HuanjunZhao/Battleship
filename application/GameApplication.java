package application;

import model.Board;
import model.ComputerPlayer;
import model.Player;
import model.PlayerSlot;
import model.Referee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
	}
	
	/**
	 * Initializes the game by creating players
	 * and calling necessary functions in Referee.
	 */
	public void initializeGame(String name) {
        Player playerOne = new Player(boardOne);
        playerOne.setName(new String(name));
        ComputerPlayer playerTwo = new ComputerPlayer(boardTwo);
        
        referee = new Referee(playerOne, playerTwo);
        
        //Sets all necessary relationships between classes
        boardOne.setPlayerOwner();
        playerOne.setOpponent(playerTwo);
        playerTwo.setOpponent(playerOne);
        referee.setPlayerOne(playerOne);
        referee.setComputerPlayer(playerTwo);
        
        //Get the controller and set relationships for controller
        BorderPane root = new BorderPane();
        FXMLLoader loader =  new FXMLLoader();
        try {
            root = (BorderPane) loader.load(new FileInputStream("src/view/SingleplayerGameView.fxml"));
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        SingleplayerGameController controller = (SingleplayerGameController)loader.getController();
        controller.setGameApp(this);
        boardOne.setSingleplayerGameController(controller);
        boardTwo.setSingleplayerGameController(controller);
        
        //Show scene
        Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
        referee.runTheGUIGame();
    }
	
	/**
	 * Initializes game for local multiplayer
	 * NOT FUNCTIONAL YET
	 * @param name1 name of first player
	 * @param name2 name of second player
	 */
	public void initializeGame(String name1, String name2) {
		Player playerOne = new Player(boardOne);
		playerOne.setName(name1);
		Player playerTwo = new Player(boardTwo);
		playerTwo.setName(name2);
	}
	
	/**
	 * Start function
	 * Initializes view with main menu
	 */
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
		
		//Set controller relationship
		GameController controller = (GameController)loader.getController();
		controller.setGameApp(this);
		//Kone - The Verkkars-EZ4ENCE £¨Bootleg£©£¨Kone remix£©
		String backgroundMusic = "resources/EZ4ENCE.mp3";
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(new File(backgroundMusic).toURI().toString()));  
        mediaPlayer.setAutoPlay(true); 
        
		//Show scene
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * Singleplayer initialisation method
	 * Gets necessary information to start a singleplayer game
	 */
	public void initialiseSingleplayer() {
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/SingleplayerInitView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Show scene
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Set controller relationship
		SingleplayerInitController controller = (SingleplayerInitController)loader.getController();
		controller.setGameApp(this);
	}
	
	/**
	 * Multiplayer initialisation method
	 * Gets necessary information to start a local multiplayer game
	 * NOT FUNCTIONAL
	 */
	public void initialiseMultiplayer() {
		BorderPane root = new BorderPane();
		FXMLLoader loader =  new FXMLLoader();
		try {
			root = (BorderPane) loader.load(new FileInputStream("src/view/MultiplayerInitView.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Show scene
		Scene scene = new Scene(root, WINDOWWIDTH, WINDOWHEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Set controller relationship
		MultiplayerInitController controller = (MultiplayerInitController)loader.getController();
		controller.setGameApp(this);
	}
	
	/**
	 * Getter for player's board
	 * @return player's board object
	 */
	public Board getBoardOne() {
		return boardOne;
	}
	
	/**
	 * Getter for computer's board
	 * @return computer's board object
	 */
	public Board getBoardTwo() {
		return boardTwo;
	}
	
	/**
	 * Getter for player object
	 * @return player object
	 */
	public PlayerSlot getPlayerOne() {
		return referee.getPlayerOne();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
