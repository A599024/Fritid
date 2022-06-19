package objekter;

public class Brett {
	
	public static void main(String[] args) {
		
		Spill spill = new Spill(3);
		
		System.out.println(spill.getAktuellSpiller().getFarge());
		spill.nesteSpiller();
		System.out.println(spill.getAktuellSpiller().getFarge());
		
//		Spiller[] sp = spill.getSpillere();
//		for(int i = 0; i < 3; i++) {
//			System.out.println(sp[i].getFarge());
//		}
		
	}

}
