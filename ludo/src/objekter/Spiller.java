package objekter;

public class Spiller {
	
	/*
	 * Hvis brikker inne er 0 kan vi ikke sette ut flere brikker.
	 */
	
	private Farge farge;
	private int brikkerInne;
	private Brikke brikke1, brikke2, brikke3, brikke4;
	
	public Spiller(Farge farge) {
		this.brikkerInne = 4;
		this.farge = farge;
		
		brikke1 = new Brikke(farge);
		brikke2 = new Brikke(farge);
		brikke3 = new Brikke(farge);
		brikke4 = new Brikke(farge);
		
		System.out.println();
	}
	
	/*
	 * I Spill må det kobles slik at det ikke er mulig
	 * å ta ut ny brikke med mindre man får 6
	 */
	public boolean brikkeUt() {
		boolean resultat = true;
		
		if(brikkerInne == 0) {
			System.out.println(farge + ": Alle brikker er inne, du må flytte!");
			resultat = false; 
		}
		
		if(brikke1.getPossisjon() == -1) {
			brikke1.brikkeUt();
			brikkerInne--;
		}
		else if(brikke2.getPossisjon() == -1) {
			brikke2.brikkeUt();
			brikkerInne--;
		}
		else if(brikke3.getPossisjon() == -1) {
			brikke3.brikkeUt();
			brikkerInne--;
		}
		else if(brikke4.getPossisjon() == -1) {
			brikke4.brikkeUt();
			brikkerInne--;
		}
		return resultat;
	}
	
	public boolean flyttBrikke(int brikkeNummer, int antallFlytt) {
		boolean resultat = true;
		Brikke brikke = null;
		
		if(brikkeNummer == 1)
			brikke = brikke1;
		else if(brikkeNummer ==  2)
			brikke = brikke2;
		else if(brikkeNummer == 3)
			brikke = brikke3;
		else
			brikke = brikke4;
		
		if(brikke.getPossisjon() == -1) {
			System.out.println(farge + " brikke1 er fortsatt inne!");
			resultat = false;
		} else {
			brikke.flyttBrikke(antallFlytt);
		}
		
		return resultat;
		
	}

	public Farge getFarge() {
		return farge;
	}

	public void setFarge(Farge farge) {
		this.farge = farge;
	}

	public int getBrikkerInne() {
		return brikkerInne;
	}

	public void setBrikkerInne(int brikkerInne) {
		this.brikkerInne = brikkerInne;
	}

	public Brikke getBrikke1() {
		return brikke1;
	}

	public void setBrikke1(Brikke brikke1) {
		this.brikke1 = brikke1;
	}

	public Brikke getBrikke2() {
		return brikke2;
	}

	public void setBrikke2(Brikke brikke2) {
		this.brikke2 = brikke2;
	}

	public Brikke getBrikke3() {
		return brikke3;
	}

	public void setBrikke3(Brikke brikke3) {
		this.brikke3 = brikke3;
	}

	public Brikke getBrikke4() {
		return brikke4;
	}

	public void setBrikke4(Brikke brikke4) {
		this.brikke4 = brikke4;
	}
	
	
	

}
