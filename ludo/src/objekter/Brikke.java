package objekter;

public class Brikke {
	
	/*
	 * En brikke har possjisjon -1, da er den inne.
	 * har en brikke ett positivt tall er den ute.
	 */
	private Farge farge;
	private int possisjon;
	private boolean erInne;
	private boolean iSafeSone;
	private boolean iMål;

	public Brikke(Farge farge) {
		this.farge = farge;
		this.erInne = true;
		this.iSafeSone = false;
		this.iMål = false;
		this.possisjon = -1;
		System.out.println(farge + " brikke opprettet.");
	}
	
	/*
	 * Denne må kobles sammen i spiller, slik at vi ikke kan ta ut ny brikke når alle er ute;
	 */
	public void brikkeUt() {
		if(farge == Farge.GUL)
			possisjon = 0;
		if(farge == Farge.GRONN)
			possisjon = 13;
		if(farge == Farge.ROD)
			possisjon = 26;
		if(farge == Farge.BLA)
			possisjon = 39;
		
		System.out.println(farge + " brikke flyttes ut...");
	}
	
	public void brikkeInn() {
		possisjon = -1;
		System.out.println(farge + " brikke flyttes inn...");
	}
	
	public void flyttBrikke(int antallFlytt) {
		int prepos = possisjon; 
		possisjon += antallFlytt;
		System.out.println(farge + " brikke flyttes fra " + prepos + " til " + possisjon + ".");
	}

	public Farge getFarge() {
		return farge;
	}

	public void setFarge(Farge farge) {
		this.farge = farge;
	}

	public int getPossisjon() {
		return possisjon;
	}

	public void setPossisjon(int possisjon) {
		this.possisjon = possisjon;
	}

	public boolean isErInne() {
		return erInne;
	}

	public void setErInne(boolean erInne) {
		this.erInne = erInne;
	}

	public boolean isiSafeSone() {
		return iSafeSone;
	}

	public void setiSafeSone(boolean iSafeSone) {
		this.iSafeSone = iSafeSone;
	}

	public boolean isiMål() {
		return iMål;
	}

	public void setiMål(boolean iMål) {
		this.iMål = iMål;
	}
	

}
