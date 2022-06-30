package objects;

/*
 * piecesdInside:	A list of the pieces still inside.
 * piecesFinished:	A list of the pieces that have finished their run.
 * color:			The color of the player. 
 */

import java.util.LinkedList;
import enums.Color;

public class Player {
	
	private LinkedList<Piece> piecesInside;
	private LinkedList<Piece> piecesFinished;
	private Color color;
	private Piece piece1, piece2, piece3, piece4;
	
	public Player(Color color) {
		System.out.println("Player " + color + " created." + "\n");
		
		this.color = color;
		
		piecesInside = new LinkedList<>();
		piecesFinished = new LinkedList<>();
		
		piece1 = new Piece(1, color);
		piece2 = new Piece(2, color);
		piece3 = new Piece(3, color);
		piece4 = new Piece(4, color);
		
		piecesInside.add(piece4);
		piecesInside.add(piece3);
		piecesInside.add(piece2);
		piecesInside.add(piece1);
	}
	
	public void movePiece(int pieceNumber, int dice) {
		
		/* Piece 1 */
		if(pieceNumber == 1) {
						
			if(piecesInside.contains(piece1)) {
				System.out.println(color + " Piece 1 is still inside!");
			} else {
				System.out.println(color + " Moves piece 1 from " + piece1.getPosition() + " to " + (piece1.getPosition() + dice) + "." + "\n");
				piece1.setPosition(piece1.getPosition() + dice);
			}
		
		/* Piece 2 */
		} else if(pieceNumber == 2) {
			
			if(piecesInside.contains(piece2)) {
				System.out.println(color + " Piece 2 is still inside!");
			} else {
				System.out.println(color + " Moves Piece 2 from " + piece2.getPosition() + " to " + (piece2.getPosition() + dice) + "." + "\n");
				piece2.setPosition(piece2.getPosition() + dice);
			}
			
		/* Piece 3 */	
		} else if(pieceNumber == 3) {
			
			if(piecesInside.contains(piece3)) {
				System.out.println(color + " Piece 3 is still inside!");
			} else {
				System.out.println(color + " Moves Piece 3 from " + piece3.getPosition() + " to " + (piece3.getPosition() + dice) + "." + "\n");
				piece3.setPosition(piece3.getPosition() + dice);
			}
			
		/* Piece 4 */	
		} else if(pieceNumber == 4) {
			
			if(piecesInside.contains(piece4)) {
				System.out.println(color + " Piece 4 is still inside!");
			} else {
				System.out.println(color + " Moves Piece 4 from " + piece4.getPosition() + " to " + (piece4.getPosition() + dice) + "." + "\n");
				piece4.setPosition(piece4.getPosition() + dice);
			}
		}		
	}
	
	public void pieceOut() {
		Piece piece = piecesInside.removeLast();
		piece.pieceOut();
		System.out.println(color + " Piece " + piece.getNumber() + " moved out." + "\n");
	}

	public LinkedList<Piece> getPiecesInside() {
		return piecesInside;
	}

	public void setPiecesInside(LinkedList<Piece> piecesInside) {
		this.piecesInside = piecesInside;
	}

	public LinkedList<Piece> getPiecesFinished() {
		return piecesFinished;
	}

	public void setPiecesFinished(LinkedList<Piece> piecesFinished) {
		this.piecesFinished = piecesFinished;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Piece getPiece1() {
		return piece1;
	}

	public void setPiece1(Piece piece1) {
		this.piece1 = piece1;
	}

	public Piece getPiece2() {
		return piece2;
	}

	public void setPiece2(Piece piece2) {
		this.piece2 = piece2;
	}

	public Piece getPiece3() {
		return piece3;
	}

	public void setPiece3(Piece piece3) {
		this.piece3 = piece3;
	}

	public Piece getPiece4() {
		return piece4;
	}

	public void setPiece4(Piece piece4) {
		this.piece4 = piece4;
	}

}
