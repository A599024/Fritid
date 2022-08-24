package test;

import static javax.swing.JOptionPane.*;
import objects.Board;

public class TestBoard {
	
	public static void main(String[] args) {
				
		/* Blue, Red, Green, Yellow */
		Board board = new Board(3);
		board.rollDice();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		board.rollDice();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		board.rollDice();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		board.moveOut();
		board.rollDice();
		
		board.printBoard();
		
		
		
	}

}
