package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import model.*;

/**
 * Single player game controller, this class is a controller class 
 * for single player game.
 * @author Dillon Sahadevan, UCID 30075927
 * 		   Joshua Fine, UCID 30011448
 * 		   Huanjun Zhao, UCID 30102350
 *
 * @version 2.0
 */
public class SingleplayerGameController {
	
	private GameApplication gameApp;
	
	boolean shipHideHere;
	private int numShips;
	private int currentShipRotate;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Label currentShipLabel;
    
    @FXML
    private GridPane boardOneGrid;
    
    @FXML
    private Label shipDirectionLabel;
    
    @FXML
    private GridPane boardTwoGrid;
    
    @FXML
    private Button rotateButton;
    
    @FXML
    private Button button25;

    @FXML
    private Button button24;

    @FXML
    private Button button27;

    @FXML
    private Button button26;

    @FXML
    private Button button21;

    @FXML
    private Button button20;

    @FXML
    private Button button23;

    @FXML
    private Button button22;

    @FXML
    private Button button29;

    @FXML
    private Button button28;

    @FXML
    private Button button14;

    @FXML
    private Button button13;

    @FXML
    private Button button16;

    @FXML
    private Button button15;

    @FXML
    private Button button10;

    @FXML
    private Button button98;

    @FXML
    private Button button97;

    @FXML
    private Button button12;

    @FXML
    private Button button11;

    @FXML
    private Button button99;

    @FXML
    private Button button18;

    @FXML
    private Button button17;

    @FXML
    private Button button19;

    @FXML
    private Button button94;

    @FXML
    private Button button93;

    @FXML
    private Button button96;

    @FXML
    private Button button95;

    @FXML
    private Button button90;

    @FXML
    private Button button92;

    @FXML
    private Button button91;

    @FXML
    private Button button03;

    @FXML
    private Button button02;

    @FXML
    private Button button05;

    @FXML
    private Button button04;

    @FXML
    private Button button87;

    @FXML
    private Button button86;

    @FXML
    private Button button01;

    @FXML
    private Button button89;

    @FXML
    private Button button00;

    @FXML
    private Button button88;

    @FXML
    private Button button07;

    @FXML
    private Button button06;

    @FXML
    private Button button09;

    @FXML
    private Button button08;

    @FXML
    private Button button83;

    @FXML
    private Button button82;

    @FXML
    private Button button85;

    @FXML
    private Button button84;

    @FXML
    private Button button81;

    @FXML
    private Button button80;

    @FXML
    private Button button79;

    @FXML
    private Button button76;

    @FXML
    private Button button75;

    @FXML
    private Button button78;

    @FXML
    private Button button77;

    @FXML
    private Button button72;

    @FXML
    private Button button71;

    @FXML
    private Button button74;

    @FXML
    private Button button73;

    @FXML
    private Button button70;

    @FXML
    private Button button69;

    @FXML
    private Button button68;

    @FXML
    private Button button65;

    @FXML
    private Button button64;

    @FXML
    private Button button67;

    @FXML
    private Button button66;

    @FXML
    private Button button61;

    @FXML
    private Button button60;

    @FXML
    private Button button63;

    @FXML
    private Button button62;

    @FXML
    private Button button58;

    @FXML
    private Button button57;

    @FXML
    private Button button59;

    @FXML
    private Button button54;

    @FXML
    private Button button53;

    @FXML
    private Button button56;

    @FXML
    private Button button55;

    @FXML
    private Button button50;

    @FXML
    private Button button52;

    @FXML
    private Button button51;

    @FXML
    private Button button47;

    @FXML
    private Button button46;

    @FXML
    private Button button49;

    @FXML
    private Button button48;

    @FXML
    private Button button43;

    @FXML
    private Button button42;

    @FXML
    private Button button45;

    @FXML
    private Button button44;

    @FXML
    private Button button41;

    @FXML
    private Button button40;

    @FXML
    private Button button36;

    @FXML
    private Button button35;

    @FXML
    private Button button38;

    @FXML
    private Button button37;

    @FXML
    private Button button32;

    @FXML
    private Button button31;

    @FXML
    private Button button34;

    @FXML
    private Button button33;

    @FXML
    private Button button39;

    @FXML
    private Button button30;
    
    //----------------------------------end of board 1 buttons

    @FXML
    private Button button119;

    @FXML
    private Button button118;

    @FXML
    private Button button117;

    @FXML
    private Button button116;

    @FXML
    private Button button115;

    @FXML
    private Button button114;

    @FXML
    private Button button113;

    @FXML
    private Button button112;

    @FXML
    private Button button122;

    @FXML
    private Button button121;

    @FXML
    private Button button120;

    @FXML
    private Button button109;

    @FXML
    private Button button108;

    @FXML
    private Button button107;

    @FXML
    private Button button106;

    @FXML
    private Button button105;

    @FXML
    private Button button104;

    @FXML
    private Button button103;

    @FXML
    private Button button102;

    @FXML
    private Button button101;

    @FXML
    private Button button189;

    @FXML
    private Button button111;

    @FXML
    private Button button199;

    @FXML
    private Button button110;

    @FXML
    private Button button198;

    @FXML
    private Button button197;

    @FXML
    private Button button196;

    @FXML
    private Button button195;

    @FXML
    private Button button194;

    @FXML
    private Button button193;

    @FXML
    private Button button192;

    @FXML
    private Button button191;

    @FXML
    private Button button190;

    @FXML
    private Button button139;

    @FXML
    private Button button138;

    @FXML
    private Button button137;

    @FXML
    private Button button136;

    @FXML
    private Button button135;

    @FXML
    private Button button134;

    @FXML
    private Button button144;

    @FXML
    private Button button143;

    @FXML
    private Button button142;

    @FXML
    private Button button141;

    @FXML
    private Button button140;

    @FXML
    private Button button129;

    @FXML
    private Button button128;

    @FXML
    private Button button127;

    @FXML
    private Button button126;

    @FXML
    private Button button125;

    @FXML
    private Button button124;

    @FXML
    private Button button123;

    @FXML
    private Button button133;

    @FXML
    private Button button132;

    @FXML
    private Button button131;

    @FXML
    private Button button130;

    @FXML
    private Button button159;

    @FXML
    private Button button158;

    @FXML
    private Button button157;

    @FXML
    private Button button156;

    @FXML
    private Button button166;

    @FXML
    private Button button165;

    @FXML
    private Button button164;

    @FXML
    private Button button163;

    @FXML
    private Button button162;

    @FXML
    private Button button161;

    @FXML
    private Button button160;

    @FXML
    private Button button149;

    @FXML
    private Button button148;

    @FXML
    private Button button147;

    @FXML
    private Button button146;

    @FXML
    private Button button145;

    @FXML
    private Button button155;

    @FXML
    private Button button154;

    @FXML
    private Button button153;

    @FXML
    private Button button152;

    @FXML
    private Button button151;

    @FXML
    private Button button150;

    @FXML
    private Button button179;

    @FXML
    private Button button178;

    @FXML
    private Button button100;

    @FXML
    private Button button188;

    @FXML
    private Button button187;

    @FXML
    private Button button186;

    @FXML
    private Button button185;

    @FXML
    private Button button184;

    @FXML
    private Button button183;

    @FXML
    private Button button182;

    @FXML
    private Button button181;

    @FXML
    private Button button180;

    @FXML
    private Button button169;

    @FXML
    private Button button168;

    @FXML
    private Button button167;

    @FXML
    private Button button177;

    @FXML
    private Button button176;

    @FXML
    private Button button175;

    @FXML
    private Button button174;

    @FXML
    private Button button173;

    @FXML
    private Button button172;

    @FXML
    private Button button171;

    @FXML
    private Button button170;
    
    @FXML
    private Button randomPlacedButton;

    /**
     * Place the ship randomly for user
     * @param event the action event that triggers the function
     */
    @FXML
    void randomShipPlaced(ActionEvent event) {
    	//Get Ship type
    	ShipType type = getPresentShip();
        
        //declare boolean for the valid placement of ships, true == valid, false == invalid.
        boolean validSelection = true;
		  
        Point point = getPoint();
            
        Ship placedShip = new Ship(type, point, currentShipRotate);
        
 
        //placing ships on the correct board
        if(gameApp.getBoardOne().addShip(placedShip) == false)
        	numShips--;
        
        //generalized variable called shipLocations containing an array of every location on the board
        //currently containing a ship. 
        Point[] shipLocations = placedShip.getShipCoords(); 
    
        Button buttonToChange = null;

        //for loop determining if the placement of every segment of the points in ship is valid.
        for (Point p: shipLocations) {
            int pointX = p.getX();
            int pointY = p.getY();
            buttonToChange = getButton(pointX,pointY, boardOneGrid);
            if (buttonToChange.isDisabled()) 
                validSelection = false;
        }
        // for loop that runs when the previous for loop determines all the points are valid to place a ship.
        if (validSelection == true) {
            for (Point p: shipLocations) {
                //System.out.println("for loop 2");
                int pointX = p.getX();
                int pointY = p.getY();
                buttonToChange = getButton(pointX, pointY, boardOneGrid);
                buttonToChange.setDisable(true);
                setButtonColor(buttonToChange, "blue");
            }
            
        } 
        numShips++;
    }
    
    //Helper method to get a random point
    // for random ship placement
    private Point getPoint() {
    	//Random object to return random integers
    	Random random = new Random();
    	int x = 0, y = 0;
    	if (numShips == 0) {
        	x = random.nextInt(4) + 3;
            y = random.nextInt(4) + 3;
        }
        if (numShips == 1) {
        	x = random.nextInt(4) + 4;
            y = random.nextInt(4) + 4;
        }
        if (numShips == 2) {
        	x = random.nextInt(7) + 1;
            y = random.nextInt(7) + 1;
        }
        if (numShips == 3) {
        	x = random.nextInt(7) + 1;
            y = random.nextInt(7) + 1;
        }
        if (numShips == 4) {
        	x = random.nextInt(8);
            y = random.nextInt(8);
        }
    	return new Point(x, y);
    }
    
    /**
     * Makes a guess, updates the guess to the board GUI and asks the computer player to play
     * @param event the action event that triggers the function
     */
    @FXML
    void makeGuess(ActionEvent event) {
    	String buttonLoc = ((Button) event.getSource()).getId();
      	int y = Integer.parseInt(String.valueOf(buttonLoc.substring(6,8)));
      	y -= 10;
    	int x = Integer.parseInt(String.valueOf(buttonLoc.charAt(8)));
    	gameApp.getBoardTwo().checkGuess(new Point(x, y));
    	gameApp.getPlayerOne().getOpponent().play();
    	   if(gameApp.getBoardOne().checkWinner()) {
           	set("                You Loose");
           	
   		}
           
           if(gameApp.getBoardTwo().checkWinner()) {
           	set("                You Win!!");
           	
           }
    }

    /**
     * Method to rotate the next placed ship
     * @param event: when the "rotate" button clicked will add 90 to the int that determines ship rotation 
     * before placement. Displays the direction the ship is facing
     */
    @FXML
    void rotatePlacedShip(ActionEvent event) {
        currentShipRotate += 90;
        
        if (currentShipRotate == 360) {
            currentShipRotate = 0;
        }
        if (currentShipRotate == 0) {
            shipDirectionLabel.setText("Ship Direction: UP");
        }
        else if (currentShipRotate == 90) {
            shipDirectionLabel.setText("Ship Direction: LEFT");
        }
        else if (currentShipRotate == 180) {
            shipDirectionLabel.setText("Ship Direction: DOWN");
        }
        else if (currentShipRotate == 270){
            shipDirectionLabel.setText("Ship Direction: RIGHT");           
        }
    }
    
    /**
     * Method to clear buttons changed by preview
     * @param event Mouse exit trigger
     */
    @FXML
    void clearPreview(MouseEvent event) {
    	for(int i = 0; i < 10; i++) {
    		for(int j = 0; j < 10; j++) {
    			Button buttonToChange = getButton(i, j, boardOneGrid);
    			String style = buttonToChange.getStyle();
    			if(style.contains("gray"))
    				setButtonColor(buttonToChange, "white");
    		}
    	}
    }
    
    /**
     * Method to display a ship placement preview
     * @param event Mouse exit trigger
     */
    @FXML
    void previewShip(MouseEvent event) {
    	
    	//setting up ship type for the rest of the method to use. Iterating through based on numShips.
        ShipType type = ShipType.CARRIER;
        
        if (numShips == 1) {
            type = ShipType.BATTLESHIP;
        }
        if (numShips == 2) {
            type = ShipType.CRUISER;    
        }
        if (numShips == 3) {
             type = ShipType.SUBMARINE;
        }
        if (numShips == 4) {
             type = ShipType.DESTROYER;
        }
        if (numShips == 5) {
        	// on last ship placed will remove the rotate ship button and label
        	shipDirectionLabel.setVisible(false);
            rotateButton.setVisible(false);
            rotateButton.setDisable(true); 
            return;
        }
        
    	String buttonLoc = ((Button) event.getSource()).getId();
    	int x = Integer.parseInt(String.valueOf(buttonLoc.charAt(6)));
        int y = Integer.parseInt(String.valueOf(buttonLoc.charAt(7)));
        Ship previewShip = new Ship(type, x, y, currentShipRotate);
        
      //generalized variable called shipLocations containing an array of every location on the board
        //currently containing a ship. 
        Point[] shipLocations = previewShip.getShipCoords(); 
    
        Button buttonToChange = null;

        for (Point p: shipLocations) {
            int pointX = p.getX();
            int pointY = p.getY();
            buttonToChange = getButton(pointX, pointY, boardOneGrid);
            if(buttonToChange == null)
            	break;
            setButtonColor(buttonToChange, "darkgray");
        }
    }
    
	/**
	 * Places a ship with origin at the buttons location
	 * @param event the action event that triggered the method
	 */
    @FXML
    void putShipDown(ActionEvent event) { 
        //Get Ship type
    	ShipType type = getPresentShip();
    	
        //declare boolean for the valid placement of ships, true == valid, false == invalid.
        boolean validSelection = true;
        
        //Grabbing the index location of the pressed button, based on the character at locations
        //6 and 7 for the clicked button (correspond to the row and columns)
        String buttonLoc = ((Button) event.getSource()).getId();
        int x = Integer.parseInt(String.valueOf(buttonLoc.charAt(6)));
        int y = Integer.parseInt(String.valueOf(buttonLoc.charAt(7)));
        Ship placedShip = new Ship(type, x, y, currentShipRotate);
 
        //placing ships on the correct board
        if(gameApp.getBoardOne().addShip(placedShip) == false)
        	numShips--;
        
        //generalized variable called shipLocations containing an array of every location on the board
        //currently containing a ship. 
        Point[] shipLocations = placedShip.getShipCoords(); 
    
        Button buttonToChange = null;

        //for loop determining if the placement of every segment of the points in ship is valid.
        for (Point p: shipLocations) {
            int pointX = p.getX();
            int pointY = p.getY();
            buttonToChange = getButton(pointX,pointY, boardOneGrid);
            if (buttonToChange.isDisabled()) {
                validSelection = false;
                // Here is where the exception would be thrown I guess, we could solve it with a while loop where the
                // function is called in the Player(?) class. it also needs to move back one iteration on numShips. 
            }
            
        }
        // for loop that runs when the previous for loop determines all the points are valid to place a ship.
        if (validSelection == true) {
            for (Point p: shipLocations) {
                //System.out.println("for loop 2");
                int pointX = p.getX();
                int pointY = p.getY();
                buttonToChange = getButton(pointX,pointY, boardOneGrid);
                buttonToChange.setDisable(true);
                setButtonColor(buttonToChange, "blue");
            }
            
        }
        
        numShips++;
    }
    
    //Returns the button object in the player's grid
    private Button getButton(int x, int y, GridPane currentBoard) {
    	Button result = null;
    	ObservableList<Node> children = currentBoard.getChildren();
    	for (Node node: children) {
    		if (GridPane.getRowIndex(node) == y && GridPane.getColumnIndex(node) == x) {
    			result = (Button)node;
    			break;
    		}
    	}
    	return result;
    }
    
    /**
     * Initializes the controller
     * Checks that all objects were injected correctly
     * Initializes the buttons' default color
     */
    @FXML
    void initialize() {
    	assert button25 != null : "fx:id=\"button25\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button24 != null : "fx:id=\"button24\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button27 != null : "fx:id=\"button27\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button26 != null : "fx:id=\"button26\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button21 != null : "fx:id=\"button21\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button20 != null : "fx:id=\"button20\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button23 != null : "fx:id=\"button23\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button22 != null : "fx:id=\"button22\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button29 != null : "fx:id=\"button29\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button28 != null : "fx:id=\"button28\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button14 != null : "fx:id=\"button14\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button13 != null : "fx:id=\"button13\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button16 != null : "fx:id=\"button16\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button15 != null : "fx:id=\"button15\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button10 != null : "fx:id=\"button10\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button98 != null : "fx:id=\"button98\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button97 != null : "fx:id=\"button97\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button12 != null : "fx:id=\"button12\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button11 != null : "fx:id=\"button11\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button99 != null : "fx:id=\"button99\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button18 != null : "fx:id=\"button18\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button17 != null : "fx:id=\"button17\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button19 != null : "fx:id=\"button19\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button94 != null : "fx:id=\"button94\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button93 != null : "fx:id=\"button93\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button96 != null : "fx:id=\"button96\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button95 != null : "fx:id=\"button95\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button90 != null : "fx:id=\"button90\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button92 != null : "fx:id=\"button92\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button91 != null : "fx:id=\"button91\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button03 != null : "fx:id=\"button03\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button02 != null : "fx:id=\"button02\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button05 != null : "fx:id=\"button05\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button04 != null : "fx:id=\"button04\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button87 != null : "fx:id=\"button87\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button86 != null : "fx:id=\"button86\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button01 != null : "fx:id=\"button01\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button89 != null : "fx:id=\"button89\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button00 != null : "fx:id=\"button00\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button88 != null : "fx:id=\"button88\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button07 != null : "fx:id=\"button07\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button06 != null : "fx:id=\"button06\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button09 != null : "fx:id=\"button09\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button08 != null : "fx:id=\"button08\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button83 != null : "fx:id=\"button83\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button82 != null : "fx:id=\"button82\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button85 != null : "fx:id=\"button85\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button84 != null : "fx:id=\"button84\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button81 != null : "fx:id=\"button81\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button80 != null : "fx:id=\"button80\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button79 != null : "fx:id=\"button79\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button76 != null : "fx:id=\"button76\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button75 != null : "fx:id=\"button75\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button78 != null : "fx:id=\"button78\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button77 != null : "fx:id=\"button77\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button72 != null : "fx:id=\"button72\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button71 != null : "fx:id=\"button71\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button74 != null : "fx:id=\"button74\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button73 != null : "fx:id=\"button73\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button70 != null : "fx:id=\"button70\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button69 != null : "fx:id=\"button69\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button68 != null : "fx:id=\"button68\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button65 != null : "fx:id=\"button65\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button64 != null : "fx:id=\"button64\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button67 != null : "fx:id=\"button67\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button66 != null : "fx:id=\"button66\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button61 != null : "fx:id=\"button61\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button60 != null : "fx:id=\"button60\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button63 != null : "fx:id=\"button63\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button62 != null : "fx:id=\"button62\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button58 != null : "fx:id=\"button58\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button57 != null : "fx:id=\"button57\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button59 != null : "fx:id=\"button59\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button54 != null : "fx:id=\"button54\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button53 != null : "fx:id=\"button53\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button56 != null : "fx:id=\"button56\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button55 != null : "fx:id=\"button55\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button50 != null : "fx:id=\"button50\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button52 != null : "fx:id=\"button52\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button51 != null : "fx:id=\"button51\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button47 != null : "fx:id=\"button47\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button46 != null : "fx:id=\"button46\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button49 != null : "fx:id=\"button49\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button48 != null : "fx:id=\"button48\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button43 != null : "fx:id=\"button43\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button42 != null : "fx:id=\"button42\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button45 != null : "fx:id=\"button45\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button44 != null : "fx:id=\"button44\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button41 != null : "fx:id=\"button41\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button40 != null : "fx:id=\"button40\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button36 != null : "fx:id=\"button36\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button35 != null : "fx:id=\"button35\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button38 != null : "fx:id=\"button38\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button37 != null : "fx:id=\"button37\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button32 != null : "fx:id=\"button32\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button31 != null : "fx:id=\"button31\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button34 != null : "fx:id=\"button34\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button33 != null : "fx:id=\"button33\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button39 != null : "fx:id=\"button39\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button30 != null : "fx:id=\"button30\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert rotateButton != null : "fx:id=\"RotateButton\" was not injected: check your FXML file 'ShipSetupVeiwTest.fxml'.";
        //end of board 1
    	
        assert button119 != null : "fx:id=\"button119\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button118 != null : "fx:id=\"button118\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button117 != null : "fx:id=\"button117\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button116 != null : "fx:id=\"button116\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button115 != null : "fx:id=\"button115\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button114 != null : "fx:id=\"button114\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button113 != null : "fx:id=\"button113\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button112 != null : "fx:id=\"button112\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button122 != null : "fx:id=\"button122\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button121 != null : "fx:id=\"button121\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button120 != null : "fx:id=\"button120\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button109 != null : "fx:id=\"button109\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button108 != null : "fx:id=\"button108\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button107 != null : "fx:id=\"button107\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button106 != null : "fx:id=\"button106\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button105 != null : "fx:id=\"button105\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button104 != null : "fx:id=\"button104\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button103 != null : "fx:id=\"button103\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button102 != null : "fx:id=\"button102\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button101 != null : "fx:id=\"button101\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button189 != null : "fx:id=\"button189\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button111 != null : "fx:id=\"button111\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button199 != null : "fx:id=\"button199\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button110 != null : "fx:id=\"button110\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button198 != null : "fx:id=\"button198\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button197 != null : "fx:id=\"button197\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button196 != null : "fx:id=\"button196\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button195 != null : "fx:id=\"button195\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button194 != null : "fx:id=\"button194\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button193 != null : "fx:id=\"button193\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button192 != null : "fx:id=\"button192\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button191 != null : "fx:id=\"button191\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button190 != null : "fx:id=\"button190\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button139 != null : "fx:id=\"button139\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button138 != null : "fx:id=\"button138\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button137 != null : "fx:id=\"button137\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button136 != null : "fx:id=\"button136\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button135 != null : "fx:id=\"button135\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button134 != null : "fx:id=\"button134\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button144 != null : "fx:id=\"button144\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button143 != null : "fx:id=\"button143\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button142 != null : "fx:id=\"button142\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button141 != null : "fx:id=\"button141\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button140 != null : "fx:id=\"button140\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button129 != null : "fx:id=\"button129\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button128 != null : "fx:id=\"button128\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button127 != null : "fx:id=\"button127\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button126 != null : "fx:id=\"button126\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button125 != null : "fx:id=\"button125\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button124 != null : "fx:id=\"button124\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button123 != null : "fx:id=\"button123\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button133 != null : "fx:id=\"button133\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button132 != null : "fx:id=\"button132\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button131 != null : "fx:id=\"button131\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button130 != null : "fx:id=\"button130\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button159 != null : "fx:id=\"button159\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button158 != null : "fx:id=\"button158\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button157 != null : "fx:id=\"button157\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button156 != null : "fx:id=\"button156\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button166 != null : "fx:id=\"button166\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button165 != null : "fx:id=\"button165\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button164 != null : "fx:id=\"button164\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button163 != null : "fx:id=\"button163\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button162 != null : "fx:id=\"button162\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button161 != null : "fx:id=\"button161\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button160 != null : "fx:id=\"button160\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button149 != null : "fx:id=\"button149\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button148 != null : "fx:id=\"button148\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button147 != null : "fx:id=\"button147\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button146 != null : "fx:id=\"button146\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button145 != null : "fx:id=\"button145\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button155 != null : "fx:id=\"button155\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button154 != null : "fx:id=\"button154\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button153 != null : "fx:id=\"button153\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button152 != null : "fx:id=\"button152\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button151 != null : "fx:id=\"button151\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button150 != null : "fx:id=\"button150\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button179 != null : "fx:id=\"button179\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button178 != null : "fx:id=\"button178\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button100 != null : "fx:id=\"button100\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button188 != null : "fx:id=\"button188\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button187 != null : "fx:id=\"button187\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button186 != null : "fx:id=\"button186\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button185 != null : "fx:id=\"button185\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button184 != null : "fx:id=\"button184\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button183 != null : "fx:id=\"button183\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button182 != null : "fx:id=\"button182\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button181 != null : "fx:id=\"button181\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button180 != null : "fx:id=\"button180\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button169 != null : "fx:id=\"button169\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button168 != null : "fx:id=\"button168\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button167 != null : "fx:id=\"button167\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button177 != null : "fx:id=\"button177\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button176 != null : "fx:id=\"button176\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button175 != null : "fx:id=\"button175\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button174 != null : "fx:id=\"button174\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button173 != null : "fx:id=\"button173\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button172 != null : "fx:id=\"button172\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button171 != null : "fx:id=\"button171\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        assert button170 != null : "fx:id=\"button170\" was not injected: check your FXML file 'SingleplayerGameView.fxml'.";
        // End of board two
        
       
        //Default start value
        currentShipRotate = 0;
        currentShipLabel.setText("Click button on your board to place CARRIER, or click random button to place.");
        //Sets default color for the buttons
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 10; j++) {
        		Button button = getButton(i, j, boardOneGrid);
        		button.setStyle("-fx-background-radius: 0px; -fx-border-color: black");
        		setButtonColor(button, "white");
        		button = getButton(i, j, boardTwoGrid);
        		getButton(i,j, boardTwoGrid).setDisable(true);
        		button.setStyle("-fx-background-radius: 0px; -fx-border-color: black");
        		setButtonColor(button, "white");
        	}
        }
    }
    
    /**
     * Sets the color of a button on the relative grid based on whether
     * the guess was a hit or a miss
     * @param x x coordinate of button
     * @param y y coordinate of button
     * @param hit whether or not the guess was a hit or miss
     * @param player whether the guess belongs to the player or computer
     */
    public void setGuess(int x, int y, boolean hit, boolean player) {
        Button buttonToChange = getButton(x, y, boardOneGrid);
        if(!player)
            buttonToChange = getButton(x, y, boardTwoGrid);
        //help setting hit and miss icons 
        Image isHit = null;
        
            try {
                isHit = new Image(new FileInputStream("resources/hit and miss/hit.jpg"), 40, 40, false, false);
            } catch (FileNotFoundException e1) {
                System.out.println("Problem loading picture hit");
            }
         
        Image isMiss = null;
        
            try {
                isMiss = new Image(new FileInputStream("resources/hit and miss/miss.jpg"), 40, 40, false, false);
            } catch (FileNotFoundException e) {
            	System.out.println("Problem loading picture miss");
            }

        Image color = (hit ? isHit : isMiss);
        buttonToChange.setGraphic(new ImageView(color));
    }
    
    /**
     * Open a new window for win or loose massages
     * @param massage
     */
    public void set(String massage) {
    	Alert win = new Alert(Alert.AlertType.INFORMATION);
		    
		    Pane pane = new Pane();
		    pane.getChildren().add(new Label(massage));
		    win.getDialogPane().setExpandableContent(pane);
		    win.show();

    }
    
    //Helper method to set the colour of a button
    private void setButtonColor(Button buttonToChange, String color) {
    	buttonToChange.setStyle("-fx-background-radius: 0px;" + 
    				"-fx-border-color: black; -fx-background-color : " 
    				+ color +";");
    }
    
    /**
     * Determine the ship type based on current number of ships.
     * Set up board ready.
     * @return currentShipType
     */
    private ShipType getPresentShip() {
    	//setting up ship type for the rest of the method to use. Iterating through based on numShips.
    	
    	ShipType type = null;
    	if (numShips == 0) {
    		type = ShipType.CARRIER;
    		currentShipLabel.setText("Click button on your board to place BATTLESHIP, or click random button to place.");
    	}
        if (numShips == 1) {
            type = ShipType.BATTLESHIP;
            currentShipLabel.setText("Click button on your board to place CRUISER, or click random button to place.");
        }
        if (numShips == 2) {
            type = ShipType.CRUISER;    
            currentShipLabel.setText("Click button on your board to place SUBMARINE, or click random button to place.");
        }
        if (numShips == 3) {
             type = ShipType.SUBMARINE;
             currentShipLabel.setText("Click button on your board to place DESTROYER, or click random button to place.");
        }
        if (numShips == 4) {
             type = ShipType.DESTROYER;
             
             // sub-function on last ship placed will remove the rotate ship button and label
             shipDirectionLabel.setVisible(false);
             rotateButton.setVisible(false);
             rotateButton.setDisable(true);
             randomPlacedButton.setVisible(false);
             currentShipLabel.setVisible(false);
             for(int i = 0; i < 10; i++) {
            	 for(int j = 0; j < 10; j++) {
            		 Button button = getButton(i, j, boardTwoGrid);
            		 //Button button1 = getButton(i, j, boardOneGrid );
            		 //button1.setDisable(true);
            		 button.setDisable(false);
            	 }
             }
        }
        if (numShips == 5)
            return null;
		return type;
    }
    
    /**
     * Setter for game app object
     * @param app the game application object
     */
	public void setGameApp(GameApplication app) {
		gameApp = app;
	}
}
