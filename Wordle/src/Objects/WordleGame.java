package Objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Interfaces.WordleGameInterface;

public class WordleGame implements WordleGameInterface {
	
	private String gameWord; 
	private String usersCurrentWord;
	
	private int currentRow;
	private boolean correctWord;
	
	private char[][] gameBoard;
	
	
	
	public WordleGame() {
		currentRow = 1;
		gameWord = generateGameWord();
		
		gameBoard = new char[5][5];
	}

	@Override
	public String generateGameWord() {
		String result = "";
		
		try {
			String[] list = new String[300];
			int antall = 0;
			File file = new File("GameWords.txt");
			
			Scanner reader = new Scanner(file);			
			while(reader.hasNext()) {
				list[antall]= reader.nextLine();
				antall++;
			}
			
			reader.close();
			int random = (int) (Math.random() * antall);
			gameWord = list[random];
			result = gameWord;
			
		} catch (Exception e) {
			System.out.println("File not found error!");
		}
		
		return gameWord;
	}

	@Override
	public boolean checkLegalWord() {
		String word = usersCurrentWord;
		boolean legal = false;
		String[] legalWords = new String[3000];
		int antall = 0;
		
		try {
			// Gets a list of legal words to java for check up
			Scanner reader = new Scanner(new File("legalWords.txt"));
			while (reader.hasNext()) {
				legalWords[antall] = reader.nextLine();
				antall++;
			}
			reader.close();
		
		} catch(Exception e) {
			System.out.println("File not Found in: CheckLegalWord");
		}
		
		// Sees if the word is legal by checking the imported list
		for (int i = 0; !legal && legalWords[i] != null; i++) {
			if(legalWords[i].equalsIgnoreCase(word)) {
				legal = true;
			}
		}
		return legal;
	}

	@Override
	public boolean correctWord() {
		return usersCurrentWord.equalsIgnoreCase(gameWord);
	}

	
	/*
	 * MÅ FIKSE
	 * en algoritme som har kontroll på om det er samme bokstav og plass eller bare
	 * riktig bokstav
	 */
	@Override
	public int[] checkForCorrectChars() {
		int[] result = new int[5];
		String riktig = gameWord;
		String bruker = usersCurrentWord;
		
		for(int i = 0; i < gameWord.length(); i++) {
			
			String riktigS = riktig.charAt(i) + "";
			String brukerS = bruker.charAt(i) + "";
			
			if(riktigS.contentEquals(brukerS)) {
				result[i] = 2;
			}
			else if(riktig.contains(brukerS)) {
				result[i] = 1;
			}
			else {
				result[i] = 0;
			}
		}
		return result;
	}
	
	@Override
	public boolean nextRow() {
		currentRow++;
		return true;	
	}

	@Override
	public void setUsersCurrentWord(String word) {
		usersCurrentWord = word;
	}

	@Override
	public String getGameWord() {
		return gameWord;
	}

	@Override
	public String getUsersCurrentWord() {
		return usersCurrentWord;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}
	
	
	
	

}
