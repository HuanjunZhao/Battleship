package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.*;

public class SingleplayerGameController {
	
	private GameApplication gameApp;
	

	boolean shipHideHere;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    

    private void guessOutcome(Button buttonUserChoose, Point thisPoint) {
    	//pointUserChoose = thisPoint;
    	shipHideHere = gameApp.getBoardTwo().checkGuess(thisPoint);
    	if (shipHideHere == false) {
    		buttonUserChoose.setStyle("-fx-background-color: #ff0000");
    	}
    	else {
    		buttonUserChoose.setStyle("-fx-background-color: #04ff3f");
    	}	
    	buttonUserChoose.setDisable(true);
    }

    @FXML
    void button100click(ActionEvent event) {
    	Point thisPoint = new Point(0,0);
    	guessOutcome(button100, thisPoint);	
    }

    @FXML
    void button101click(ActionEvent event) {
    	Point thisPoint = new Point(0,1);
    	guessOutcome(button101, thisPoint);	
    }

    @FXML
    void button102click(ActionEvent event) {
    	Point thisPoint = new Point(0,2);
    	guessOutcome(button102, thisPoint);	
    }

    @FXML
    void button103click(ActionEvent event) {
    	Point thisPoint = new Point(0,3);
    	guessOutcome(button103, thisPoint);	
    }

    @FXML
    void button104click(ActionEvent event) {
    	Point thisPoint = new Point(0,4);
    	guessOutcome(button104, thisPoint);	
    }

    @FXML
    void button105click(ActionEvent event) {
    	Point thisPoint = new Point(0,5);
    	guessOutcome(button105, thisPoint);	
    }

    @FXML
    void button106click(ActionEvent event) {
    	Point thisPoint = new Point(0,6);
    	guessOutcome(button106, thisPoint);	
    }

    @FXML
    void button107click(ActionEvent event) {
    	Point thisPoint = new Point(0,7);
    	guessOutcome(button107, thisPoint);	
    }

    @FXML
    void button108click(ActionEvent event) {
    	Point thisPoint = new Point(0,8);
    	guessOutcome(button108, thisPoint);	
    }

    @FXML
    void button109click(ActionEvent event) {
    	Point thisPoint = new Point(0,9);
    	guessOutcome(button109, thisPoint);	
    }

    @FXML
    void button110click(ActionEvent event) {
    	Point thisPoint = new Point(1,0);
    	guessOutcome(button110, thisPoint);	
    }

    @FXML
    void button111click(ActionEvent event) {
    	Point thisPoint = new Point(1,1);
    	guessOutcome(button111, thisPoint);	
    }

    @FXML
    void button112click(ActionEvent event) {
    	Point thisPoint = new Point(1,2);
    	guessOutcome(button112, thisPoint);	
    }

    @FXML
    void button113click(ActionEvent event) {
    	Point thisPoint = new Point(1,3);
    	guessOutcome(button113, thisPoint);	
    }

    @FXML
    void button114click(ActionEvent event) {
    	Point thisPoint = new Point(1,4);
    	guessOutcome(button114, thisPoint);	
    }

    @FXML
    void button115click(ActionEvent event) {
    	Point thisPoint = new Point(1,5);
    	guessOutcome(button115, thisPoint);	
    }

    @FXML
    void button116click(ActionEvent event) {
    	Point thisPoint = new Point(1,6);
    	guessOutcome(button116, thisPoint);	
    }

    @FXML
    void button117click(ActionEvent event) {
    	Point thisPoint = new Point(1,7);
    	guessOutcome(button117, thisPoint);	
    }

    @FXML
    void button118click(ActionEvent event) {
    	Point thisPoint = new Point(1,8);
    	guessOutcome(button118, thisPoint);	
    }

    @FXML
    void button119click(ActionEvent event) {
    	Point thisPoint = new Point(1,9);
    	guessOutcome(button119, thisPoint);	
    }

    @FXML
    void button120click(ActionEvent event) {
    	Point thisPoint = new Point(2,0);
    	guessOutcome(button120, thisPoint);	
    }

    @FXML
    void button121click(ActionEvent event) {
    	Point thisPoint = new Point(2,1);
    	guessOutcome(button121, thisPoint);	
    }

    @FXML
    void button122click(ActionEvent event) {
    	Point thisPoint = new Point(2,2);
    	guessOutcome(button122, thisPoint);	
    }

    @FXML
    void button123click(ActionEvent event) {
    	Point thisPoint = new Point(2,3);
    	guessOutcome(button123, thisPoint);	
    }

    @FXML
    void button124click(ActionEvent event) {
    	Point thisPoint = new Point(2,4);
    	guessOutcome(button124, thisPoint);	
    }

    @FXML
    void button125click(ActionEvent event) {
    	Point thisPoint = new Point(2,5);
    	guessOutcome(button125, thisPoint);	
    }

    @FXML
    void button126click(ActionEvent event) {
    	Point thisPoint = new Point(2,6);
    	guessOutcome(button126, thisPoint);	
    }

    @FXML
    void button127click(ActionEvent event) {
    	Point thisPoint = new Point(2,7);
    	guessOutcome(button127, thisPoint);	
    }

    @FXML
    void button128click(ActionEvent event) {
    	Point thisPoint = new Point(2,8);
    	guessOutcome(button128, thisPoint);	
    }

    @FXML
    void button129click(ActionEvent event) {
    	Point thisPoint = new Point(2,9);
    	guessOutcome(button129, thisPoint);	
    }

    @FXML
    void button130click(ActionEvent event) {
    	Point thisPoint = new Point(3,0);
    	guessOutcome(button130, thisPoint);	
    }

    @FXML
    void button131click(ActionEvent event) {
    	Point thisPoint = new Point(3,1);
    	guessOutcome(button131, thisPoint);	
    }

    @FXML
    void button132click(ActionEvent event) {
    	Point thisPoint = new Point(3,2);
    	guessOutcome(button132, thisPoint);	
    }

    @FXML
    void button133click(ActionEvent event) {
    	Point thisPoint = new Point(3,3);
    	guessOutcome(button133, thisPoint);	
    }

    @FXML
    void button134click(ActionEvent event) {
    	Point thisPoint = new Point(3,4);
    	guessOutcome(button134, thisPoint);	
    }

    @FXML
    void button135click(ActionEvent event) {
    	Point thisPoint = new Point(3,5);
    	guessOutcome(button135, thisPoint);	
    }

    @FXML
    void button136click(ActionEvent event) {
    	Point thisPoint = new Point(3,6);
    	guessOutcome(button136, thisPoint);	
    }

    @FXML
    void button137click(ActionEvent event) {
    	Point thisPoint = new Point(3,7);
    	guessOutcome(button137, thisPoint);	
    }

    @FXML
    void button138click(ActionEvent event) {
    	Point thisPoint = new Point(3,8);
    	guessOutcome(button138, thisPoint);	
    }

    @FXML
    void button139click(ActionEvent event) {
    	Point thisPoint = new Point(3,9);
    	guessOutcome(button139, thisPoint);	
    }

    @FXML
    void button140click(ActionEvent event) {
    	Point thisPoint = new Point(4,0);
    	guessOutcome(button140, thisPoint);	
    }

    @FXML
    void button141click(ActionEvent event) {
    	Point thisPoint = new Point(4,1);
    	guessOutcome(button141, thisPoint);	
    }

    @FXML
    void button142click(ActionEvent event) {
    	Point thisPoint = new Point(4,2);
    	guessOutcome(button142, thisPoint);	
    }

    @FXML
    void button143click(ActionEvent event) {
    	Point thisPoint = new Point(4,3);
    	guessOutcome(button143, thisPoint);	
    }

    @FXML
    void button144click(ActionEvent event) {
    	Point thisPoint = new Point(4,4);
    	guessOutcome(button144, thisPoint);	
    }

    @FXML
    void button145click(ActionEvent event) {
    	Point thisPoint = new Point(4,5);
    	guessOutcome(button145, thisPoint);	
    }

    @FXML
    void button146click(ActionEvent event) {
    	Point thisPoint = new Point(4,6);
    	guessOutcome(button146, thisPoint);	
    }

    @FXML
    void button147click(ActionEvent event) {
    	Point thisPoint = new Point(4,7);
    	guessOutcome(button147, thisPoint);	
    }

    @FXML
    void button148click(ActionEvent event) {
    	Point thisPoint = new Point(4,8);
    	guessOutcome(button148, thisPoint);	
    }

    @FXML
    void button149click(ActionEvent event) {
    	Point thisPoint = new Point(4,9);
    	guessOutcome(button149, thisPoint);	
    }

    @FXML
    void button150click(ActionEvent event) {
    	Point thisPoint = new Point(5,0);
    	guessOutcome(button150, thisPoint);	
    }

    @FXML
    void button151click(ActionEvent event) {
    	Point thisPoint = new Point(5,1);
    	guessOutcome(button151, thisPoint);	
    }

    @FXML
    void button152click(ActionEvent event) {
    	Point thisPoint = new Point(5,2);
    	guessOutcome(button152, thisPoint);	
    }

    @FXML
    void button153click(ActionEvent event) {
    	Point thisPoint = new Point(5,3);
    	guessOutcome(button153, thisPoint);	
    }

    @FXML
    void button154click(ActionEvent event) {
    	Point thisPoint = new Point(5,4);
    	guessOutcome(button154, thisPoint);	
    }

    @FXML
    void button155click(ActionEvent event) {
    	Point thisPoint = new Point(5,5);
    	guessOutcome(button155, thisPoint);	
    }

    @FXML
    void button156click(ActionEvent event) {
    	Point thisPoint = new Point(5,6);
    	guessOutcome(button156, thisPoint);	
    }

    @FXML
    void button157click(ActionEvent event) {
    	Point thisPoint = new Point(5,7);
    	guessOutcome(button157, thisPoint);	
    }

    @FXML
    void button158click(ActionEvent event) {
    	Point thisPoint = new Point(5,8);
    	guessOutcome(button158, thisPoint);	
    }

    @FXML
    void button159click(ActionEvent event) {
    	Point thisPoint = new Point(5,9);
    	guessOutcome(button159, thisPoint);	
    }

    @FXML
    void button160click(ActionEvent event) {
    	Point thisPoint = new Point(6,0);
    	guessOutcome(button160, thisPoint);	
    }

    @FXML
    void button161click(ActionEvent event) {
    	Point thisPoint = new Point(6,1);
    	guessOutcome(button161, thisPoint);	
    }

    @FXML
    void button162click(ActionEvent event) {
    	Point thisPoint = new Point(6,2);
    	guessOutcome(button162, thisPoint);	
    }

    @FXML
    void button163click(ActionEvent event) {
    	Point thisPoint = new Point(6,3);
    	guessOutcome(button163, thisPoint);	
    }

    @FXML
    void button164click(ActionEvent event) {
    	Point thisPoint = new Point(6,4);
    	guessOutcome(button164, thisPoint);	
    }

    @FXML
    void button165click(ActionEvent event) {
    	Point thisPoint = new Point(6,5);
    	guessOutcome(button165, thisPoint);	
    }

    @FXML
    void button166click(ActionEvent event) {
    	Point thisPoint = new Point(6,6);
    	guessOutcome(button166, thisPoint);	
    }

    @FXML
    void button167click(ActionEvent event) {
    	Point thisPoint = new Point(6,7);
    	guessOutcome(button167, thisPoint);	
    }

    @FXML
    void button168click(ActionEvent event) {
    	Point thisPoint = new Point(6,8);
    	guessOutcome(button168, thisPoint);	
    }

    @FXML
    void button169click(ActionEvent event) {
    	Point thisPoint = new Point(6,9);
    	guessOutcome(button169, thisPoint);	
    }

    @FXML
    void button170click(ActionEvent event) {
    	Point thisPoint = new Point(7,0);
    	guessOutcome(button170, thisPoint);	
    }

    @FXML
    void button171click(ActionEvent event) {
    	Point thisPoint = new Point(7,1);
    	guessOutcome(button171, thisPoint);	
    }

    @FXML
    void button172click(ActionEvent event) {
    	Point thisPoint = new Point(7,2);
    	guessOutcome(button172, thisPoint);	
    }

    @FXML
    void button173click(ActionEvent event) {
    	Point thisPoint = new Point(7,3);
    	guessOutcome(button173, thisPoint);	
    }

    @FXML
    void button174click(ActionEvent event) {
    	Point thisPoint = new Point(7,4);
    	guessOutcome(button174, thisPoint);	
    }

    @FXML
    void button175click(ActionEvent event) {
    	Point thisPoint = new Point(7,5);
    	guessOutcome(button175, thisPoint);	
    }

    @FXML
    void button176click(ActionEvent event) {
    	Point thisPoint = new Point(7,6);
    	guessOutcome(button176, thisPoint);	
    }

    @FXML
    void button177click(ActionEvent event) {
    	Point thisPoint = new Point(7,7);
    	guessOutcome(button177, thisPoint);	
    }

    @FXML
    void button178click(ActionEvent event) {
    	Point thisPoint = new Point(7,8);
    	guessOutcome(button178, thisPoint);	
    }

    @FXML
    void button179click(ActionEvent event) {
    	Point thisPoint = new Point(7,9);
    	guessOutcome(button179, thisPoint);	
    }

    @FXML
    void button180click(ActionEvent event) {
    	Point thisPoint = new Point(8,0);
    	guessOutcome(button180, thisPoint);	
    }

    @FXML
    void button181click(ActionEvent event) {
    	Point thisPoint = new Point(8,1);
    	guessOutcome(button181, thisPoint);	
    }

    @FXML
    void button182click(ActionEvent event) {
    	Point thisPoint = new Point(8,2);
    	guessOutcome(button182, thisPoint);	
    }

    @FXML
    void button183click(ActionEvent event) {
    	Point thisPoint = new Point(8,3);
    	guessOutcome(button183, thisPoint);	
    }

    @FXML
    void button184click(ActionEvent event) {
    	Point thisPoint = new Point(8,4);
    	guessOutcome(button184, thisPoint);	
    }

    @FXML
    void button185click(ActionEvent event) {
    	Point thisPoint = new Point(8,5);
    	guessOutcome(button185, thisPoint);	
    }

    @FXML
    void button186click(ActionEvent event) {
    	Point thisPoint = new Point(8,6);
    	guessOutcome(button186, thisPoint);	
    }

    @FXML
    void button187click(ActionEvent event) {
    	Point thisPoint = new Point(8,7);
    	guessOutcome(button187, thisPoint);	
    }

    @FXML
    void button188click(ActionEvent event) {
    	Point thisPoint = new Point(8,8);
    	guessOutcome(button188, thisPoint);	
    }

    @FXML
    void button189click(ActionEvent event) {
    	Point thisPoint = new Point(8,9);
    	guessOutcome(button189, thisPoint);	
    }

    @FXML
    void button190click(ActionEvent event) {
    	Point thisPoint = new Point(9,0);
    	guessOutcome(button190, thisPoint);	
    }

    @FXML
    void button191click(ActionEvent event) {
    	Point thisPoint = new Point(9,1);
    	guessOutcome(button191, thisPoint);	
    }

    @FXML
    void button192click(ActionEvent event) {
    	Point thisPoint = new Point(9,2);
    	guessOutcome(button192, thisPoint);	
    }

    @FXML
    void button193click(ActionEvent event) {
    	Point thisPoint = new Point(9,3);
    	guessOutcome(button193, thisPoint);	
    }

    @FXML
    void button194click(ActionEvent event) {
    	Point thisPoint = new Point(9,4);
    	guessOutcome(button194, thisPoint);	
    }

    @FXML
    void button195click(ActionEvent event) {
    	Point thisPoint = new Point(9,5);
    	guessOutcome(button195, thisPoint);	
    }

    @FXML
    void button196click(ActionEvent event) {
    	Point thisPoint = new Point(9,6);
    	guessOutcome(button196, thisPoint);	
    }

    @FXML
    void button197click(ActionEvent event) {
    	Point thisPoint = new Point(9,7);
    	guessOutcome(button197, thisPoint);	
    }

    @FXML
    void button198click(ActionEvent event) {
    	Point thisPoint = new Point(9,8);
    	guessOutcome(button198, thisPoint);	
    }

    @FXML
    void button199click(ActionEvent event) {
    	Point thisPoint = new Point(9,9);
    	guessOutcome(button199, thisPoint);	
    }

    @FXML
    void initialize() {
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

    }
	public void setGameApp(GameApplication app) {
		gameApp = app;
	}
}
