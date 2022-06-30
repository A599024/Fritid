package test;

import enums.Color;
import objects.Piece;

public class TestPiece {

	public static void main(String[] args) {
		
		Piece piece = new Piece(1, Color.RED);
		System.out.println("Position: " + piece.getPosition());
		System.out.println("Color " + piece.getColor());
		System.out.println("Number: " + piece.getNumber());
		
	}
	
	
}
