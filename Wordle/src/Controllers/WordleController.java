package Controllers;


import java.util.Iterator;

import Objects.WordleGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class WordleController {

	@FXML
	private Button reset;
	
	@FXML
	private Button goButton;

	@FXML
	private Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9,  lb10,
	lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19,
	lb20, lb21, lb22, lb23, lb24, lb25;

	private Label one, two, three, four, five;

	@FXML
	private ImageView logoBilde;

	@FXML
	private TextField userWord;
	
	@FXML
	private Label statusLabel;

	private WordleGame game = new WordleGame();

	private int[] res;

	public void goAction(ActionEvent e) {
					
		String textFieldWord = userWord.getText();
		textFieldWord.toLowerCase();
		game.setUsersCurrentWord(textFieldWord);
		setLabels();
	
		if(game.checkLegalWord()) {
			
			System.out.println("legal Word");
			textFieldWord = textFieldWord.toUpperCase();
			char[] characters = textFieldWord.toCharArray();
			one.setText(" " + characters[0] + "");
			two.setText(" " + characters[1] + "");
			three.setText(" " + characters[2] + "");
			four.setText(" " + characters[3] + "");
			five.setText(" " + characters[4] + "");
			
			
			/***********************************************
			 *  LEGG TIL FARGEBYTTE 
			 ***********************************************/
			res = game.checkForCorrectChars();

			
			fargeBytte(res[0], one);
			fargeBytte(res[1], two);
			fargeBytte(res[2], three);
			fargeBytte(res[3], four);
			fargeBytte(res[4], five);

			
			/***********************************************
			 * 
			 ***********************************************/
			

		} else {
			System.out.println("Not legal Word");
			userWord.setPromptText("Not a Word!");
		}
		
		System.out.println("Row: " + game.getCurrentRow());
		
		if(game.correctWord()) {
			System.out.println("DU VANT!");
			statusLabel.setText("Gratulerer du vant!");
			game = new WordleGame();
			newSetup();
		}
		else if(!game.checkLegalWord()) {
			System.out.println("Ugyldig ord");
		}
		else if(game.getCurrentRow() < 5) {
			game.nextRow();
		}
		else {
			System.out.println("DU TAPTE!");
			statusLabel.setText("Du tapte!");
			game = new WordleGame();
			newSetup();
		}
		userWord.setText("");
		
	}

	private void setLabels() {
		
		switch(game.getCurrentRow()) {		
		case 1:
			one = lb1;
			two = lb2;
			three = lb3;
			four = lb4;
			five = lb5;
			break;
		case 2:
			one = lb6;
			two = lb7;
			three = lb8;
			four = lb9;
			five = lb10;
			break;
		case 3:
			one = lb11;
			two = lb12;
			three = lb13;
			four = lb14;
			five = lb15;
			break;
		case 4:
			one = lb16;
			two = lb17;
			three = lb18;
			four = lb19;
			five = lb20;
			break;
		case 5:
			one = lb21;
			two = lb22;
			three = lb23;
			four = lb24;
			five = lb25;
			break;

		}
	}
	

	@FXML public void resetAction(ActionEvent event) {
		userWord.setText("");
		newSetup();
	}
	
	public void newSetup() {
		
		Label[] labels = { lb1, lb2, lb3, lb4, lb5,
							lb6, lb7, lb8, lb9, lb10,
							lb11, lb12, lb13, lb14, lb15,
							lb16, lb17, lb18, lb19, lb20,
							lb21, lb22, lb23, lb24, lb25
		};
		
		for(int i = 0; i < labels.length; i++) {
			labels[i].setText("");
			labels[i].setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, null, null)));

		}
		
//		lb1.setText("");
//		lb2.setText("");
//		lb3.setText("");
//		lb4.setText("");
//		lb5.setText("");
//		lb6.setText("");
//		lb7.setText("");
//		lb8.setText("");
//		lb9.setText("");
//		lb10.setText("");
//		lb11.setText("");
//		lb12.setText("");
//		lb13.setText("");
//		lb14.setText("");
//		lb15.setText("");
//		lb16.setText("");
//		lb17.setText("");
//		lb18.setText("");
//		lb19.setText("");
//		lb20.setText("");
//		lb21.setText("");
//		lb22.setText("");
//		lb23.setText("");
//		lb24.setText("");
//		lb25.setText("");
//		userWord.setText("");
		
	}
	
	public void fargeBytte(int x, Label y) {
		switch(x) {
		case 0:
			y.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, null, null)));
			break;
		case 1:
			y.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
			break;
		case 2:
			y.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
			break;
		}
		
		
	}

	




}
