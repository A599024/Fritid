package controllers;

import java.awt.Label;

import javafx.fxml.FXML;

public class winnerController {
	
	@FXML
	private Label winnerLabel;
	
	@FXML
	void mouseOver() {
		try {
			winnerLabel.setText(GameController.colorWinner + " " + "WON!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
