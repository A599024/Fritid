package objects;

/*
 * safeSone:   The piece is in a spot where it cannot be killed.
 * finishLine: The piece is in its home right before it finishes its run.
 * position:   The position of the piece, if its -1 the piece is at start.
 * number: 	   The number of the piece. (helps for the controller)
 * color:	   The color of the piece.
 */

import enums.Color;

public class Piece {
	
	private int position;
	private int number;
	private Color color;
	
	public Piece(int number, Color color) {
		this.position = -1;
		this.number = number;
		this.color = color;
	}
	
	public void pieceOut() {
		if(color == Color.BLUE)
			position = 1;
		else if(color == Color.RED)
			position = 1 + 13;
		else if(color == Color.GREEN)
			position = 1 + 13 + 13;
		else if(color == Color.YELLOW)
			position = 1 + 13 + 13 + 13;
	}
	
	public void pieceIn() {
		position = -1;
	}
	
	
	
	
	
	
	

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
	

}
