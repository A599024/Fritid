package Objects;

public class testKlasse {
	
	public static void main(String[] args) {
		
		WordleGame game = new WordleGame();
		
		game.setUsersCurrentWord("bønne");
		System.out.println("Brukers ord: " + game.getUsersCurrentWord());
		System.out.println("Spillets ord: " + game.getGameWord());
		System.out.println("Lovlig ord? " + game.checkLegalWord());
		
		System.out.println("User guessed correct? " + game.correctWord());
		
		
		
//		System.out.println("Vi er på rad nr 2: " + game.nextRow());
//		System.out.println("Vi er på rad nr 3: " + game.nextRow());
//		System.out.println("Vi er på rad nr 4: " + game.nextRow());
//		System.out.println("Vi er på rad nr 5: " + game.nextRow());
//		System.out.println("Vi er på rad nr ikke fler: " + game.nextRow());
		

		
		
		

	}

}
