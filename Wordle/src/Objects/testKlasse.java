package Objects;

public class testKlasse {
	
	public static void main(String[] args) {
		
		WordleGame game = new WordleGame();
		
		game.setUsersCurrentWord("bønne");
		System.out.println("Brukers ord: " + game.getUsersCurrentWord());
		System.out.println("Spillets ord: " + game.getGameWord());
		
		int[] res = game.checkForCorrectChars();
		
		for(int i : res)
			System.out.print(i + ", ");
		

		
		
		

	}

}
