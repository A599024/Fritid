package objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
	
	public Board(int numPlayers) {
		System.out.println("GAME CREATED!" + "\n");
		Player[] players = {player1, player2, player3, player4};
		
		this.gameQueue = new LinkedBlockingQueue<>();
		this.dice = 6;
		this.board = new LinkedList[90];
		
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
		
		this.playerInPlay = player1;
	}
	
	public void rollDice() {
		dice = (int) (Math.random() * 6 + 1);
		System.out.println("Dice rolled: " + dice + "\n");
	}
	
	public void nextPlayer() {
		Player temp = gameQueue.remove();
		playerInPlay = gameQueue.peek();
		gameQueue.add(temp);
		
		System.out.println(playerInPlay.getColor() + " Player´s turn." + "\n");
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

	

}
