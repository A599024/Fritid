package test;

import static javax.swing.JOptionPane.*;

import java.util.Scanner;

import objects.Board;

public class TestGame {
	
	public static void main(String[] args) {
		
		Board board = new Board(2);
		
		int i = 0;
		while(i < 200)
		{
			/*
			 * 1 = ut brikke 1
			 * 2 = ut brikke 2
			 * 3 = ut brikke 3
			 * 4 = ut brikke 4
			 * 10 = roll dice
			 * 11 = move out
			 * 69 = print board
			 * 100 = finished
			 */
			
			Scanner sc = new Scanner(System.in);
			int svar = sc.nextInt();
			
			switch(svar) {
			case 1:
				board.move(1);
				break;
			case 2:
				board.move(2);
				break;
			case 3:
				board.move(3);
				break;
			case 4:
				board.move(4);
				break;
			case 11:
				board.moveOut();
				break;
			case 10:
				board.rollDice();
				break;
			case 100:
				i = 350;
				break;
			case 69:
				board.printBoard();
				break;
			default:
				break;
			case 91:
				board.setDice(1);
				break;
			case 92:
				board.setDice(2);
				break;
			case 93:
				board.setDice(3);
				break;
			case 94:
				board.setDice(4);
				break;
			case 95:
				board.setDice(5);
				break;
			case 96:
				board.setDice(6);
				board.allowPieceOut();
				break;
			case 0:
				System.out.println("Players inside: " + "\n" + board.getPlayer1().getPiecesInside().size() + "\n" + 
						board.getPlayer2().getPiecesInside().size() /*+ "\n" + 
						board.getPlayer3().getPiecesInside().size() + "\n" + 
						board.getPlayer4().getPiecesInside().size()*/);
				break;
			case 40:
				board.setDice(50);
			}
			i++;
			
		}
		
		System.out.println("FERIDGGGG");
		
		
		
	}

}
