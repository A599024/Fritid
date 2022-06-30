package test;

import enums.Color;
import objects.Player;

public class TestPlayer {
	
	public static void main(String[] args) {
		
		Player player = new Player(Color.BLUE);
		player.pieceOut();
		player.movePiece(1, 4);
		
		
	}

}
