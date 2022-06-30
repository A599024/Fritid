package objekter;

public class Brett {
	
	public static void main(String[] args) {
		
		Spill spill = new Spill(3);
		
		System.out.println(spill.getAktuellSpiller().getFarge());
		spill.handling(6, 0, 0);
		spill.handling(4, 1, 1);
		spill.handling(6, 0, 0);
		spill.handling(5, 1, 1);
		
		
	}

}
