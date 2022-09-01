package objects;

import java.util.Iterator;

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
	private int num1, num2, num3, num4, num5, num6;
	private int startVal;
	
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

// hele metoden kan også bli mer kompakt med brikkene
// mulig å gjøre det her litt mer kompakt med strings
		
		if(color == Color.BLUE) {
			startVal = 1;
			num1 = 101;
			num2 = 102;
			num3 = 103;
			num4 = 104;
			num5 = 105;
			num6 = 106;
		} else if(color == Color.RED) {
			startVal = 14;
			num1 = 201;
			num2 = 202;
			num3 = 203;
			num4 = 204;
			num5 = 205;
			num6 = 206;
		} else if(color == Color.GREEN) {
			startVal = 27;
			num1 = 301;
			num2 = 302;
			num3 = 303;
			num4 = 304;
			num5 = 305;
			num6 = 306;
		} else if(color == Color.YELLOW) {
			startVal = 40;
			num1 = 401;
			num2 = 402;
			num3 = 403;
			num4 = 404;
			num5 = 405;
			num6 = 406;
		}
		
		if(pieceNumber == 1) {
						
			if(piecesInside.contains(piece1)) {
				System.out.println(color + " Piece 1 is still inside!");
			} else {
				
				if(piece1.getPosition() + dice > (startVal+50) /* && piece1.getPosition() + dice <= (startVal + 50 + 6) */) {

					int pos = piece1.getPosition() + dice;
					if(pos == (startVal + 50 + 1) || pos == num1)
						piece1.setPosition(num1);
					else if(pos == (startVal + 50 + 2) || pos == num2)
						piece1.setPosition(num2);
					else if(pos == (startVal + 50 + 3) || pos == num3)
						piece1.setPosition(num3);
					else if(pos == (startVal + 50 + 4) || pos == num4)
						piece1.setPosition(num4);
					else if(pos == (startVal + 50 + 5) || pos == num5)
						piece1.setPosition(num5);
					else if(pos == (startVal + 50 + 6) || pos == num6)
					{
						piece1.setPosition(num6);
						piecesFinished.add(piece1);
						System.out.println(color + " piece 1 inside!");
						checkVictory();
					} else {
						System.out.println("Piece 1 cant be moved, it will go over the finishline.");
					}
					
					
					
				} else if(piece1.getPosition() + dice > -1 && piece1.getPosition() + dice <= (startVal + 50)) {
					System.out.println(color + " Moves piece 1 from " + piece1.getPosition() + " to " + (piece1.getPosition() + dice) + "." + "\n");
					piece1.setPosition(piece1.getPosition() + dice);					
				}
				
			}
		
		/* Piece 2 */
		} else if(pieceNumber == 2) {
			
			if(piecesInside.contains(piece2)) {
				System.out.println(color + " Piece 2 is still inside!");
			} else {
			
				if(piece2.getPosition() + dice > (startVal + 50) /* && piece2.getPosition() + dice <= (startVal + 50 + 6) */) {
				
					int pos = piece2.getPosition() + dice;
					if(pos == (startVal + 50 + 1) || pos == num1)
						piece2.setPosition(num1);
					else if(pos == (startVal + 50 + 2) || pos == num2)
						piece2.setPosition(num2);
					else if(pos == (startVal + 50 + 3) || pos == num3)
						piece2.setPosition(num3);
					else if(pos == (startVal + 50 + 4) || pos == num4)
						piece2.setPosition(num4);
					else if(pos == (startVal + 50 + 5) || pos == num5)
						piece2.setPosition(num5);
					else if(pos == (startVal + 50 + 6) || pos == num6)
					{
						piece2.setPosition(num6);
						piecesFinished.add(piece2);
						System.out.println(color + " piece 2 inside!");
						checkVictory();
					} else {
						System.out.println("Piece 2 cant be moved, it will go over the finishline.");
					}
					
				} else if(piece2.getPosition() + dice > -1 && piece2.getPosition() + dice <= (startVal + 50)) {
					System.out.println(color + " Moves piece 2 from " + piece2.getPosition() + " to " + (piece2.getPosition() + dice) + "." + "\n");
					piece2.setPosition(piece2.getPosition() + dice);					
				}
				
			}
			
		/* Piece 3 */	
		} else if(pieceNumber == 3) {
			
			if(piecesInside.contains(piece3)) {
				System.out.println(color + " Piece 3 is still inside!");
			} else {
			
				if(piece3.getPosition() + dice > (startVal + 50) /* && piece3.getPosition() + dice <= (startVal + 50 + 6) */) {
				
					int pos = piece3.getPosition() + dice;
					if(pos == (startVal + 50 + 1) || pos == num1)
						piece3.setPosition(num1);
					else if(pos == (startVal + 50 + 2) || pos == num2)
						piece3.setPosition(num2);
					else if(pos == (startVal + 50 + 3) || pos == num3)
						piece3.setPosition(num3);
					else if(pos == (startVal + 50 + 4) || pos == num4)
						piece3.setPosition(num4);
					else if(pos == (startVal + 50 + 5) || pos == num5)
						piece3.setPosition(num5);
					else if(pos == (startVal + 50 + 6) || pos == num6)
					{
						piece3.setPosition(num6);
						piecesFinished.add(piece3);
						System.out.println(color + " piece 3 inside!");
						checkVictory();
					} else {
						System.out.println("Piece 3 cant be moved, it will go over the finishline.");
					}
					
				} else if(piece3.getPosition() + dice > -1 && piece3.getPosition() + dice <= (startVal + 50)) {
					System.out.println(color + " Moves piece 3 from " + piece3.getPosition() + " to " + (piece3.getPosition() + dice) + "." + "\n");
					piece3.setPosition(piece3.getPosition() + dice);					
				}
				
			}
			
		/* Piece 4 */	
		} else if(pieceNumber == 4) {
			
			if(piecesInside.contains(piece4)) {
				System.out.println(color + " Piece 4 is still inside!");
			} else {
			
				if(piece4.getPosition() + dice > (startVal + 50) /* && piece4.getPosition() + dice <= (startVal + 50 + 6) */) {
				
					int pos = piece4.getPosition() + dice;
					if(pos == (startVal + 50 + 1) || pos == num1)
						piece4.setPosition(num1);
					else if(pos == (startVal + 50 + 2) || pos == num2)
						piece4.setPosition(num2);
					else if(pos == (startVal + 50 + 3) || pos == num3)
						piece4.setPosition(num3);
					else if(pos == (startVal + 50 + 4) || pos == num4)
						piece4.setPosition(num4);
					else if(pos == (startVal + 50 + 5) || pos == num5)
						piece4.setPosition(num5);
					else if(pos == (startVal + 50 + 6) || pos == num6)
					{
						piece4.setPosition(num6);
						piecesFinished.add(piece4);
						System.out.println(color + " piece 4 inside!");
						checkVictory();
					} else {
						System.out.println("Piece 4 cant be moved, it will go over the finishline.");
					}
					
				} else if(piece4.getPosition() + dice > -1 && piece4.getPosition() + dice <= (startVal + 50)) {
					System.out.println(color + " Moves piece 4 from " + piece4.getPosition() + " to " + (piece4.getPosition() + dice) + "." + "\n");
					piece4.setPosition(piece4.getPosition() + dice);					
				}
				
			}
			
		}
		
	}
	
	public boolean checkVictory() {
		if(piecesFinished.size() == 4) {
			System.out.println(color + " HAVE WON THE GAME!!!!!");
			return true;
		}
		return false;
		
	}

	public void pieceOut() {
		Piece piece = piecesInside.removeLast();
		piece.pieceOut();
		System.out.println(color + " Piece " + piece.getNumber() + " moved out." + "\n");
	}
	
	public int getPiecesOutside() {
		return (4 - piecesInside.size());
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
	
	public void setPieceInside(Piece piece) {
		piecesInside.add(piece);
	}
	
	public Piece getPiece(int pieceNum) {
		switch(pieceNum)
		{
		case 1: return piece1;
		case 2: return piece2;
		case 3: return piece3;
		case 4: return piece4;
		default: return null;
		}
	}

}
