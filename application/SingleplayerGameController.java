package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.*;

public class SingleplayerGameController {
	
	private GameApplication gameApp;
	
//	private static Point pointUserChoose;
	boolean shipHideHere;
	boolean repeatClick = false;
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
    		button100.setStyle("-fx-background-color: #ff0000");
    	}
    	else {
    		button100.setStyle("-fx-background-color: #04ff3f");
    	}	
    	repeatClick = true;
    }

    @FXML
    void button100click(ActionEvent event) {
    	if (repeatClick == true) {
    		return;
    		//Set some info here.
    	}
    	Point thisPoint = new Point(0,0);
    	guessOutcome(button100, thisPoint);
    	
    }

    @FXML
    void button101click(ActionEvent event) {

    }

    @FXML
    void button102click(ActionEvent event) {

    }

    @FXML
    void button103click(ActionEvent event) {

    }

    @FXML
    void button104click(ActionEvent event) {

    }

    @FXML
    void button105click(ActionEvent event) {

    }

    @FXML
    void button106click(ActionEvent event) {

    }

    @FXML
    void button107click(ActionEvent event) {

    }

    @FXML
    void button108click(ActionEvent event) {

    }

    @FXML
    void button109click(ActionEvent event) {

    }

    @FXML
    void button110click(ActionEvent event) {

    }

    @FXML
    void button111click(ActionEvent event) {

    }

    @FXML
    void button112click(ActionEvent event) {

    }

    @FXML
    void button113click(ActionEvent event) {

    }

    @FXML
    void button114click(ActionEvent event) {

    }

    @FXML
    void button115click(ActionEvent event) {

    }

    @FXML
    void button116click(ActionEvent event) {

    }

    @FXML
    void button117click(ActionEvent event) {

    }

    @FXML
    void button118click(ActionEvent event) {

    }

    @FXML
    void button119click(ActionEvent event) {

    }

    @FXML
    void button120click(ActionEvent event) {

    }

    @FXML
    void button121click(ActionEvent event) {

    }

    @FXML
    void button122click(ActionEvent event) {

    }

    @FXML
    void button123click(ActionEvent event) {

    }

    @FXML
    void button124click(ActionEvent event) {

    }

    @FXML
    void button125click(ActionEvent event) {

    }

    @FXML
    void button126click(ActionEvent event) {

    }

    @FXML
    void button127click(ActionEvent event) {

    }

    @FXML
    void button128click(ActionEvent event) {

    }

    @FXML
    void button129click(ActionEvent event) {

    }

    @FXML
    void button130click(ActionEvent event) {

    }

    @FXML
    void button131click(ActionEvent event) {

    }

    @FXML
    void button132click(ActionEvent event) {

    }

    @FXML
    void button133click(ActionEvent event) {

    }

    @FXML
    void button134click(ActionEvent event) {

    }

    @FXML
    void button135click(ActionEvent event) {

    }

    @FXML
    void button136click(ActionEvent event) {

    }

    @FXML
    void button137click(ActionEvent event) {

    }

    @FXML
    void button138click(ActionEvent event) {

    }

    @FXML
    void button139click(ActionEvent event) {

    }

    @FXML
    void button140click(ActionEvent event) {

    }

    @FXML
    void button141click(ActionEvent event) {

    }

    @FXML
    void button142click(ActionEvent event) {

    }

    @FXML
    void button143click(ActionEvent event) {

    }

    @FXML
    void button144click(ActionEvent event) {

    }

    @FXML
    void button145click(ActionEvent event) {

    }

    @FXML
    void button146click(ActionEvent event) {

    }

    @FXML
    void button147click(ActionEvent event) {

    }

    @FXML
    void button148click(ActionEvent event) {

    }

    @FXML
    void button149click(ActionEvent event) {

    }

    @FXML
    void button150click(ActionEvent event) {

    }

    @FXML
    void button151click(ActionEvent event) {

    }

    @FXML
    void button152click(ActionEvent event) {

    }

    @FXML
    void button153click(ActionEvent event) {

    }

    @FXML
    void button154click(ActionEvent event) {

    }

    @FXML
    void button155click(ActionEvent event) {

    }

    @FXML
    void button156click(ActionEvent event) {

    }

    @FXML
    void button157click(ActionEvent event) {

    }

    @FXML
    void button158click(ActionEvent event) {

    }

    @FXML
    void button159click(ActionEvent event) {

    }

    @FXML
    void button160click(ActionEvent event) {

    }

    @FXML
    void button161click(ActionEvent event) {

    }

    @FXML
    void button162click(ActionEvent event) {

    }

    @FXML
    void button163click(ActionEvent event) {

    }

    @FXML
    void button164click(ActionEvent event) {

    }

    @FXML
    void button165click(ActionEvent event) {

    }

    @FXML
    void button166click(ActionEvent event) {

    }

    @FXML
    void button167click(ActionEvent event) {

    }

    @FXML
    void button168click(ActionEvent event) {

    }

    @FXML
    void button169click(ActionEvent event) {

    }

    @FXML
    void button170click(ActionEvent event) {

    }

    @FXML
    void button171click(ActionEvent event) {

    }

    @FXML
    void button172click(ActionEvent event) {

    }

    @FXML
    void button173click(ActionEvent event) {

    }

    @FXML
    void button174click(ActionEvent event) {

    }

    @FXML
    void button175click(ActionEvent event) {

    }

    @FXML
    void button176click(ActionEvent event) {

    }

    @FXML
    void button177click(ActionEvent event) {

    }

    @FXML
    void button178click(ActionEvent event) {

    }

    @FXML
    void button179click(ActionEvent event) {

    }

    @FXML
    void button180click(ActionEvent event) {

    }

    @FXML
    void button181click(ActionEvent event) {

    }

    @FXML
    void button182click(ActionEvent event) {

    }

    @FXML
    void button183click(ActionEvent event) {

    }

    @FXML
    void button184click(ActionEvent event) {

    }

    @FXML
    void button185click(ActionEvent event) {

    }

    @FXML
    void button186click(ActionEvent event) {

    }

    @FXML
    void button187click(ActionEvent event) {

    }

    @FXML
    void button188click(ActionEvent event) {

    }

    @FXML
    void button189click(ActionEvent event) {

    }

    @FXML
    void button190click(ActionEvent event) {

    }

    @FXML
    void button191click(ActionEvent event) {

    }

    @FXML
    void button192click(ActionEvent event) {

    }

    @FXML
    void button193click(ActionEvent event) {

    }

    @FXML
    void button194click(ActionEvent event) {

    }

    @FXML
    void button195click(ActionEvent event) {

    }

    @FXML
    void button196click(ActionEvent event) {

    }

    @FXML
    void button197click(ActionEvent event) {

    }

    @FXML
    void button198click(ActionEvent event) {

    }

    @FXML
    void button199click(ActionEvent event) {

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
