package Interfaces;

/*
 * Interface for controlling the functions in a Wordle game
 */

public interface WordleGameInterface {
	
	/*
	 * Må ha objektvariabler som lagrer forskjelligg info
	 * 
	 * 	- String gameWord
	 * 	- String usersCurrentWord
	 * 
	 * 	- int currentRow
	 * 	- boolean correctWordCorrect
	 * 	- Char[] gameBoard
	 * 
	 */
	
	
	/**
	 * Reads words from a .txt file to Eclipse
	 * takes out a random word.
	 * 
	 * @return	the word to be guessed.
	 */
	public String generateGameWord();
	
	/**
	 * Takes the word the user has typed
	 * and sees if the word is a real word
	 * 
	 * @param word	The word the user has typed
	 * @return	True if the word is legal, else False
	 */
	public boolean checkLegalWord();
	
	/**
	 * Checks if the users current word
	 * is equal to the game word
	 * 
	 * @return	true if they are equal, if else false
	 */
	public boolean correctWord();
	
	
	/**
	 * Takes the users current Word and returns a array
	 * where value 1 at index 0 means right word, wrong place (the first character in the word)
	 * 		 value 2 at index 0 means right word, right place (the first character in the word)
	 * 
	 * @return	 a list of int values for the status of the correct characters
	 */
	public int[] checkForCorrectChars();
	
	/**
	 * Checks if Object variable currentRow is == 5
	 * if curretRow == 5, returns false to signal gameOwer
	 * if not it increments currentRow by one
	 * 
	 * It also sets currentWord to "" for the next word to be guessed
	 * 
	 * @return	true if its rows left, false if not
	 */
	public boolean nextRow();
	
	public void setUsersCurrentWord(String word);
	
	// for testing
	public String getUsersCurrentWord();
	
	public String getGameWord();
	
	public int getCurrentRow();

}
