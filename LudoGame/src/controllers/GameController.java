package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import objects.Board;
import objects.Piece;
import objects.Player;

import java.io.IOException;

import enums.Color;

public class GameController {

    @FXML
    private Label base1Bla;

    @FXML
    private Label base1Gronn;

    @FXML
    private Label base1Gul;

    @FXML
    private Label base1Rod;

    @FXML
    private Label base2Bla;

    @FXML
    private Label base2Gronn;

    @FXML
    private Label base2Gul;

    @FXML
    private Label base2Rod;

    @FXML
    private Label base3Bla;

    @FXML
    private Label base3Gronn;

    @FXML
    private Label base3Gul;

    @FXML
    private Label base3Rod;

    @FXML
    private Label base4Bla;

    @FXML
    private Label base4Gronn;

    @FXML
    private Label base4Gul;

    @FXML
    private Label base4Rod;

    @FXML
    private Label currentPlayer;

    @FXML
    private Button kast;

    @FXML
    private TextField numSpillere;

    @FXML
    private Button nyBrikke;

    @FXML
    private Label q1;

    @FXML
    private Label q10;

    @FXML
    private Label q11;

    @FXML
    private Label q12;

    @FXML
    private Label q13;

    @FXML
    private Label q14;

    @FXML
    private Label q15;

    @FXML
    private Label q16;

    @FXML
    private Label q17;

    @FXML
    private Label q18;

    @FXML
    private Label q19;

    @FXML
    private Label q2;

    @FXML
    private Label q20;

    @FXML
    private Label q21;

    @FXML
    private Label q22;

    @FXML
    private Label q23;

    @FXML
    private Label q24;

    @FXML
    private Label q25;

    @FXML
    private Label q26;

    @FXML
    private Label q27;

    @FXML
    private Label q28;

    @FXML
    private Label q29;

    @FXML
    private Label q3;

    @FXML
    private Label q30;

    @FXML
    private Label q31;

    @FXML
    private Label q32;

    @FXML
    private Label q33;

    @FXML
    private Label q34;

    @FXML
    private Label q35;

    @FXML
    private Label q36;

    @FXML
    private Label q37;

    @FXML
    private Label q38;

    @FXML
    private Label q39;

    @FXML
    private Label q4;

    @FXML
    private Label q40;

    @FXML
    private Label q41;

    @FXML
    private Label q42;

    @FXML
    private Label q43;

    @FXML
    private Label q44;

    @FXML
    private Label q45;

    @FXML
    private Label q46;

    @FXML
    private Label q47;

    @FXML
    private Label q48;

    @FXML
    private Label q49;

    @FXML
    private Label q5;

    @FXML
    private Label q50;

    @FXML
    private Label q51;

    @FXML
    private Label q52;

    @FXML
    private Label q6;

    @FXML
    private Label q7;

    @FXML
    private Label q8;

    @FXML
    private Label q9;

    @FXML
    private Button startKnapp;

    @FXML
    private Label tarningRes;
    
    @FXML
    private Label q101, q102, q103, q104, q105, q106, q201, q202, q203, q204, q205, q206,
    			  q301, q302, q303, q304, q305, q306, q401, q402, q403, q404, q405, q406;
    
    private Label[] plasser = { q1, q2, q3, q4, q5, q6, q7, q8, q9, q10,
    							q11, q12, q13, q14, q15, q16, q17, q18, q19, q20,
    							q21, q22, q23, q24, q25, q26, q27, q28, q29, q30,
    							q31, q32, q33, q34, q35, q36, q37, q38, q39, q40,
    							q41, q42, q43, q44, q45, q46, q47, q48, q49, q50,
    							q51, q52,
    							q101, q102, q103, q104, q105, q106,
    							q201, q202, q203, q204, q205, q206,
    							q301, q302, q303, q304, q305, q306,
    							q401, q402, q403, q404, q405, q406
    };
    
    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    
    private boolean numPlayersChoosed = false;
    private int gamePlayers;
    private Board game;
    
    public static Color colorWinner = null;
    
    
    
    
    
    

    @FXML
    void flyttB1(ActionEvent event) {
    	checkVictory();
    	game.move(1);
    	updateBoard();
    }

    @FXML
    void flyttB2(ActionEvent event) {
    	checkVictory();
    	game.move(2);
    	updateBoard();
    }

    @FXML
    void flyttB3(ActionEvent event) {
    	checkVictory();
    	game.move(3);
    	updateBoard();
    }

    @FXML
    void flyttB4(ActionEvent event) {
    	checkVictory();
    	game.move(4);
    	updateBoard();
    }

    @FXML
    void kastTarning(ActionEvent event) {
    	game.rollDice();
    	int dice = game.getDice();
    	tarningRes.setText(dice + "");
    }

    @FXML
    void startSpill(ActionEvent event) {
    	for(int i = 0; i < plasser.length; i++) {
    		plasser[i] = new Label();
    	}
    	
    	
    	try {
    		
    		int spillere = Integer.parseInt(numSpillere.getText());
    		switch(spillere) 
    		{
    		case 2:
    			gamePlayers = 2;
    			break;
    		case 3:
    			gamePlayers = 3;
    			break;
    		case 4:
    			gamePlayers = 4;
    			break;
    		default:
    			gamePlayers = 4;
    			break;
    		}
    		
    		game = new Board(gamePlayers);
    		numSpillere.setVisible(false);
    		startKnapp.setVisible(false);
    		updateCurPlayer();
    		
    		
    	} catch(Exception e) {
    		System.out.println("må skrive inn tall");
    	}
    }

    @FXML
    void utNyBrikke(ActionEvent event) {
    	game.moveOut();
    	updateBoard();
    }
    
    public void updateCurPlayer() {
    	String s = "Spiller: ";
    	currentPlayer.setText(s + game.getPlayerInPlay().getColor());
    }
    
    public void updateBoard() {
    	clearBoard();
    	currentPlayer.setText("Spiller: " + game.getPlayerInPlay().getColor());
    	
    	for(int i = 1; i <= gamePlayers; i++)
    	{    			
    
    		for(int j = 1; j <= 4; j++)
    		{
        		String colorLetter = "";
        		int letter = i;
        		
        		switch(letter) {
        		case 1: colorLetter = "B"; break;
        		case 2: colorLetter = "R"; break;
        		case 3: colorLetter = "G"; break;
        		case 4: colorLetter = "Y"; break;
        		default: colorLetter = "Fail color letter";
        		}
        		
    			Piece p = game.getPlayer(i).getPiece(j);
    			int piecePos = p.getPosition();
    			 
				 Label pos = null;				 
				 
				 switch(piecePos) {
				 case 1: pos = q1; break;
				 case 2: pos = q2; break;
				 case 3: pos = q3; break;
				 case 4: pos = q4; break;
				 case 5: pos = q5; break;
				 case 6: pos = q6; break;
				 case 7: pos = q7; break;
				 case 8: pos = q8; break;
				 case 9: pos = q9; break;
				 case 10: pos = q10; break;
				 //
   				 case 11: pos = q11; break;
				 case 12: pos = q12; break;
				 case 13: pos = q13; break;
				 case 14: pos = q14; break;
				 case 15: pos = q15; break;
				 case 16: pos = q16; break;
				 case 17: pos = q17; break;
				 case 18: pos = q18; break;
				 case 19: pos = q19; break;
				 case 20: pos = q20; break;
				 //
   				 case 21: pos = q21; break;
				 case 22: pos = q22; break;
				 case 23: pos = q23; break;
				 case 24: pos = q24; break;
				 case 25: pos = q25; break;
				 case 26: pos = q26; break;
				 case 27: pos = q27; break;
				 case 28: pos = q28; break;
				 case 29: pos = q29; break;
				 case 30: pos = q30; break;
				 //
   				 case 31: pos = q31; break;
				 case 32: pos = q32; break;
				 case 33: pos = q33; break;
				 case 34: pos = q34; break;
				 case 35: pos = q35; break;
				 case 36: pos = q36; break;
				 case 37: pos = q37; break;
				 case 38: pos = q38; break;
				 case 39: pos = q39; break;
				 case 40: pos = q40; break;
				 //
   				 case 41: pos = q41; break;
				 case 42: pos = q42; break;
				 case 43: pos = q43; break;
				 case 44: pos = q44; break;
				 case 45: pos = q45; break;
				 case 46: pos = q46; break;
				 case 47: pos = q47; break;
				 case 48: pos = q48; break;
				 case 49: pos = q49; break;
				 case 50: pos = q50; break;
				 //
				 case 51: pos = q51; break;
				 case 52: pos = q52; break;
				 //
				 case 53: pos = q1; break;
				 case 54: pos = q2; break;
				 case 55: pos = q3; break;
				 case 56: pos = q4; break;
				 case 57: pos = q5; break;
				 case 58: pos = q6; break;
				 case 59: pos = q7; break;
				 case 60: pos = q8; break;
				 //
				 case 61: pos = q9; break;
				 case 62: pos = q10; break;
				 case 63: pos = q11; break;
				 case 64: pos = q12; break;
				 case 65: pos = q13; break;
				 case 66: pos = q14; break;
				 case 67: pos = q15; break;
				 case 68: pos = q16; break;
				 case 69: pos = q17; break;
				 case 70: pos = q18; break;
				 //
				 case 71: pos = q19; break;
				 case 72: pos = q20; break;
				 case 73: pos = q21; break;
				 case 74: pos = q22; break;
				 case 75: pos = q23; break;
				 case 76: pos = q24; break;
				 case 77: pos = q25; break;
				 case 78: pos = q26; break;
				 case 79: pos = q27; break;
				 case 80: pos = q28; break;
				 //
				 case 81: pos = q29; break;
				 case 82: pos = q30; break;
				 case 83: pos = q31; break;
				 case 84: pos = q32; break;
				 case 85: pos = q33; break;
				 case 86: pos = q34; break;
				 case 87: pos = q35; break;
				 case 88: pos = q36; break;
				 case 89: pos = q37; break;
				 case 90: pos = q38; break;
				 //
				 case 101: pos = q101; break;
				 case 102: pos = q102; break;
				 case 103: pos = q103; break;
				 case 104: pos = q104; break;
				 case 105: pos = q105; break;
				 case 106: pos = q106; break;
				 //
				 case 201: pos = q201; break;
				 case 202: pos = q202; break;
				 case 203: pos = q203; break;
				 case 204: pos = q204; break;
				 case 205: pos = q205; break;
				 case 206: pos = q206; break;
				 //
				 case 301: pos = q301; break;
				 case 302: pos = q302; break;
				 case 303: pos = q303; break;
				 case 304: pos = q304; break;
				 case 305: pos = q305; break;
				 case 306: pos = q306; break;
				 //
				 case 401: pos = q401; break;
				 case 402: pos = q402; break;
				 case 403: pos = q403; break;
				 case 404: pos = q404; break;
				 case 405: pos = q405; break;
				 case 406: pos = q406; break;
				 // default: System.out.println("fail pos-Label");
				 }
				 
				 String before = "";
				 
				 if(pos != null) {
					 before = pos.getText();
					 pos.setText(before + colorLetter + j);
				 }
    				 
    		} // end for(j)
    		
    	} // end for(i)
    	
    }

	private void clearBoard() {
		q1.setText("");
		q2.setText("");
		q3.setText("");
		q4.setText("");
		q5.setText("");
		q6.setText("");
		q7.setText("");
		q8.setText("");
		q9.setText("");
		q10.setText("");
		
		q11.setText("");
		q12.setText("");
		q13.setText("");
		q14.setText("");
		q15.setText("");
		q16.setText("");
		q17.setText("");
		q18.setText("");
		q19.setText("");
		q20.setText("");
		
		q21.setText("");
		q22.setText("");
		q23.setText("");
		q24.setText("");
		q25.setText("");
		q26.setText("");
		q27.setText("");
		q28.setText("");
		q29.setText("");
		q30.setText("");
		
		q31.setText("");
		q32.setText("");
		q33.setText("");
		q34.setText("");
		q35.setText("");
		q36.setText("");
		q37.setText("");
		q38.setText("");
		q39.setText("");
		q40.setText("");
		
		q41.setText("");
		q42.setText("");
		q43.setText("");
		q44.setText("");
		q45.setText("");
		q46.setText("");
		q47.setText("");
		q48.setText("");
		q49.setText("");
		q50.setText("");
		
		q51.setText("");
		q52.setText("");
		
		q101.setText("");
		q102.setText("");
		q103.setText("");
		q104.setText("");
		q105.setText("");
		q106.setText("");
		
		q201.setText("");
		q202.setText("");
		q203.setText("");
		q204.setText("");
		q205.setText("");
		q206.setText("");
		
		q301.setText("");
		q302.setText("");
		q303.setText("");
		q304.setText("");
		q305.setText("");
		q306.setText("");
		
		q401.setText("");
		q402.setText("");
		q403.setText("");
		q404.setText("");
		q405.setText("");
		q406.setText("");
		
	}
	
	public void checkVictory() {
		if(game.checkVictory() != null) {
			Player player = game.checkVictory();
			colorWinner = player.getColor();
			
			q1.getScene().getWindow().hide();;
			Stage winner = new Stage();
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("/FXML/winner.fxml"));
			} catch(IOException e) {
				e.printStackTrace();
			}
			Scene scene = new Scene(root);
			winner.setScene(scene);
			winner.show();
			winner.setResizable(false);		
			
		}
	}

}