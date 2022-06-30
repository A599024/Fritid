package test;

import objects.Board;

public class TestBoard {
	
	public static void main(String[] args) {
		/* Blue, Red, Green, Yellow */
		Board board = new Board(1);
		board.rollDice();
		System.out.println(board.getPlayerInPlay().getColor());
		board.nextPlayer();
		board.nextPlayer();
		board.nextPlayer();
		board.nextPlayer();
		board.nextPlayer();
		
		
	}

}
