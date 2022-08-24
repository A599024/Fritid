package objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;

import enums.Color;

/*
 * gameQueue:
 * playerInPlay:
 * dice:
 * board:
 * players:
 */

public class Board {
	
	private Queue<Player> gameQueue;
	private Player playerInPlay;
	private int dice;
	private LinkedList<Piece>[] board;
	private Player player1, player2, player3, player4;
	private boolean canRollDice = true;
	private boolean firstRollDice = true;
	private boolean canMoveOut = false;
	private LinkedList<Piece> pieces = new LinkedList<>();
	
	
	public Board(int numPlayers) {
		System.out.println("GAME CREATED!" + "\n");
		Player[] players = {player1, player2, player3, player4};
		
		this.gameQueue = new LinkedBlockingQueue<>();
		this.dice = 0;
		this.board = new LinkedList[500];
		for(int i = 0; i < board.length; i++) {
			board[i] = new LinkedList<>();
		}
		
		// TODO - Her kan man lage mulighet for en AI til å spille mot deg.
		if(numPlayers == 2) {
			player1 = new Player(Color.BLUE);
			player2 = new Player(Color.RED);
			
			gameQueue.add(player1);
			gameQueue.add(player2);
		} else if(numPlayers == 3) {
			player1 = new Player(Color.BLUE);
			player2 = new Player(Color.RED);
			player3 = new Player(Color.GREEN);
			
			gameQueue.add(player1);
			gameQueue.add(player2);
			gameQueue.add(player3);
		} else {
			player1 = new Player(Color.BLUE);
			player2 = new Player(Color.RED);
			player3 = new Player(Color.GREEN);
			player4 = new Player(Color.YELLOW);
			
			gameQueue.add(player1);
			gameQueue.add(player2);
			gameQueue.add(player3);
			gameQueue.add(player4);
		}
		
		/* Adds the pieces to a list */
		for(int i = 1; i <= 4; i++) {
			if(player1 != null)
				pieces.add(player1.getPiece(i));
			if(player2 != null)
				pieces.add(player2.getPiece(i));
			if(player3 != null)
				pieces.add(player3.getPiece(i));
			if(player4 != null)
				pieces.add(player4.getPiece(i));
		}
		
		
		this.playerInPlay = player1;
	}
	
	public void rollDice() {
		if(dice == 6) {
			canRollDice = true;
		}
		else {
			canRollDice = false;
		}
		
		if(canRollDice == true || firstRollDice == true) {
			dice = (int) (Math.random() * 6 + 1);
			System.out.println("Dice rolled: " + dice + "\n");
			if(dice == 6)
				canMoveOut = true;
		} else {
			System.out.println("You cant roll the dice again!");
		}
		firstRollDice = false;
		
	}
	
	public void nextPlayer() {
		Player temp = gameQueue.remove();
		playerInPlay = gameQueue.peek();
		gameQueue.add(temp);
		
		canRollDice = true;
		firstRollDice = true;
		
		
		System.out.println(playerInPlay.getColor() + " Player´s turn." + "\n");
	}
	
	public void updateBoard() {
		clearGameBoard();
		
		/* Player 1 */
		if(player1 != null && player1.getPiecesOutside() > 0) {
			// Piece 1
			if(player1.getPiece1().getPosition() != -1)
			{
				board[player1.getPiece1().getPosition()].add(player1.getPiece1());
			}
			// Piece 2
			if(player1.getPiece2().getPosition() != -1)
			{
				board[player1.getPiece2().getPosition()].add(player1.getPiece2());
			}
			// Piece 3
			if(player1.getPiece3().getPosition() != -1)
			{
				board[player1.getPiece3().getPosition()].add(player1.getPiece3());
			}
			// Piece 4
			if(player1.getPiece4().getPosition() != -1)
			{
				board[player1.getPiece4().getPosition()].add(player1.getPiece4());
			}
		}
		
		/* Player 2 */
		if(player2 != null && player2.getPiecesOutside() > 0) {
			// Piece 1
			if(player2.getPiece1().getPosition() != -1)
			{
				board[player2.getPiece1().getPosition()].add(player2.getPiece1());
			}
			// Piece 2
			if(player2.getPiece2().getPosition() != -1)
			{
				board[player2.getPiece2().getPosition()].add(player2.getPiece2());
			}
			// Piece 3
			if(player2.getPiece3().getPosition() != -1)
			{
				board[player2.getPiece3().getPosition()].add(player2.getPiece3());
			}
			// Piece 4
			if(player2.getPiece4().getPosition() != -1)
			{
				board[player2.getPiece4().getPosition()].add(player2.getPiece4());
			}
		}
		
		/* Player 3 */
		if(player3 != null && player3.getPiecesOutside() > 0) {
			// Piece 1
			if(player3.getPiece1().getPosition() != -1)
			{
				board[player3.getPiece1().getPosition()].add(player3.getPiece1());
			}
			// Piece 2
			if(player3.getPiece2().getPosition() != -1)
			{
				board[player3.getPiece2().getPosition()].add(player3.getPiece2());
			}
			// Piece 3
			if(player3.getPiece3().getPosition() != -1)
			{
				board[player3.getPiece3().getPosition()].add(player3.getPiece3());
			}
			// Piece 4
			if(player3.getPiece4().getPosition() != -1)
			{
				board[player3.getPiece4().getPosition()].add(player3.getPiece4());
			}
		}
		
		/* Player 4 */
		if(player4 != null && player4.getPiecesOutside() > 0) {
			// Piece 1
			if(player4.getPiece1().getPosition() != -1)
			{
				board[player4.getPiece1().getPosition()].add(player4.getPiece1());
			}
			// Piece 2
			if(player4.getPiece2().getPosition() != -1)
			{
				board[player4.getPiece2().getPosition()].add(player4.getPiece2());
			}
			// Piece 3
			if(player4.getPiece3().getPosition() != -1)
			{
				board[player4.getPiece3().getPosition()].add(player4.getPiece3());
			}
			// Piece 4
			if(player4.getPiece4().getPosition() != -1)
			{
				board[player4.getPiece4().getPosition()].add(player4.getPiece4());
			}
		}
	}
	
	/*
	 * The method move() and moveOut() are created in the class Player
	 * And here they are added some more restrictions to make the game flow better.
	 */
	public void move(int piece) {
		boolean nexttt = false;
		
		if(dice == 6 && playerInPlay.getPiece(piece).getPosition() != -1) {
			System.out.println("You can roll the dice again!" + "\n");
			playerInPlay.movePiece(dice, piece);
		} else if(playerInPlay.getPiece(piece).getPosition() == -1) {
			System.out.println(playerInPlay.getColor() + " " + piece + " This piece is still inside!");
		} else {
			playerInPlay.movePiece(piece, dice);
			nexttt = true;
		}
		
		if(playerInPlay.getPiece(piece).getPosition() != -1) {
			// LinkedList<Piece> place = board[playerInPlay.getPiece(piece).getPosition()];
			Piece p = playerInPlay.getPiece(piece);
			
			/* Safespots */
			if(p.getPosition() != 1 && p.getPosition() != 9 && p.getPosition() != 14 && p.getPosition() != 22 && p.getPosition() != 27 && p.getPosition() != 35 && 
					p.getPosition() != 40 && p.getPosition() != 48 && p.getPosition() != 53 && p.getPosition() != 61 && p.getPosition() != 66 && p.getPosition() != 74 &&
					p.getPosition() != 79 && p.getPosition() != 87 && p.getPosition() != 92 && p.getPosition() != 100) {
				for(Piece pc : pieces) {
				
					if(pc != null) {
						if(pc.getColor() != playerInPlay.getColor() && pc.getPosition() == p.getPosition()) {
							pc.setPosition(-1);
							
							/* Adds the killed piece back in the linkedlist of pieces inside */
							if(pc.getColor() == Color.BLUE)
								player1.setPieceInside(pc);
							else if(pc.getColor() == Color.RED)
								player2.setPieceInside(pc);
							else if(pc.getColor() == Color.GREEN)
								player3.setPieceInside(pc);
							else if(pc.getColor() == Color.YELLOW)
								player4.setPieceInside(pc);
				
							System.out.println(playerInPlay.getColor() + " killed a player!");
						}
						
					}
					
				}
				
			}
	
		}
		
		if(nexttt)
			nextPlayer();
		
		updateBoard();
	}
	
	public void moveOut() {
		if(dice == 6 && playerInPlay.getPiecesOutside() < 4 && canMoveOut) {
			canMoveOut = false;
			System.out.println("You can roll the dice again!" + "\n");
			playerInPlay.pieceOut();
			
		} else {
			System.out.println("You cant move any pieces out");
		}
		
		if(dice != 6 && playerInPlay.getPiecesOutside() == 0)
			nextPlayer();
		
		updateBoard();
	}
	
	public void clearGameBoard() {
		for(int i = 0; i < board.length; i++) {
			board[i] = new LinkedList<>();
		}
	}
	
	public void printBoard() {		
		for(int i = 1; i< board.length; i++) {
			System.out.println("BOARDPLACE NR " + i + ": ");
			Iterator<Piece> it = board[i].iterator();
			while(it.hasNext()) {
				Piece p = it.next();
				System.out.print("\t" + p.getColor() + "" + p.getNumber() + "\n");
			}
		}
	}

	public Queue<Player> getGameQueue() {
		return gameQueue;
	}

	public void setGameQueue(Queue<Player> gameQueue) {
		this.gameQueue = gameQueue;
	}

	public Player getPlayerInPlay() {
		return playerInPlay;
	}

	public void setPlayerInPlay(Player playerInPlay) {
		this.playerInPlay = playerInPlay;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public LinkedList<Piece>[] getBoard() {
		return board;
	}

	public void setBoard(LinkedList<Piece>[] board) {
		this.board = board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getPlayer3() {
		return player3;
	}

	public void setPlayer3(Player player3) {
		this.player3 = player3;
	}

	public Player getPlayer4() {
		return player4;
	}

	public void setPlayer4(Player player4) {
		this.player4 = player4;
	}
	
	public void allowPieceOut() {
		canMoveOut = true; 
	}

	

}
