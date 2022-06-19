package objekter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Spill {
	
	private int antallSpillere;
	private Spiller aktuellSpiller;
	private Spiller spiller1, spiller2, spiller3, spiller4;
	private Spiller[] spillere = {spiller1, spiller2, spiller3, spiller4};
	private Farge[] farger = {Farge.GUL, Farge.GRONN, Farge.ROD, Farge.BLA};
	private Queue<Spiller> koe = new LinkedBlockingQueue<>();
	
	
	public Spill(int antallSpillere) {
		
		for(int i = 0; i < antallSpillere; i++) {
			spillere[i] = new Spiller(farger[i]);
		}
		
		for(int i = 0; i < antallSpillere; i++) {
			koe.add(spillere[i]);
		}
		
		this.antallSpillere = antallSpillere;
		this.aktuellSpiller = spillere[0];
		System.out.println("\n" + "Nytt Spill opprettet!");
	}
	
	/* handling = 0 betyr ut, handling = 1 betyr flytt. */
	public void handling(int tarning, int handling) {
		
		
		
		
	}
	
	public void nesteSpiller() {
		Spiller tmp = koe.remove();
		aktuellSpiller = koe.peek();
		koe.add(tmp);
		System.out.println(aktuellSpiller.getFarge() + " SIN TUR!!");
	}

	public int getAntallSpillere() {
		return antallSpillere;
	}

	public void setAntallSpillere(int antallSpillere) {
		this.antallSpillere = antallSpillere;
	}

	public Spiller getAktuellSpiller() {
		return aktuellSpiller;
	}

	public void setAktuellSpiller(Spiller aktuellSpiller) {
		this.aktuellSpiller = aktuellSpiller;
	}

	public Spiller getSpiller1() {
		return spiller1;
	}

	public void setSpiller1(Spiller spiller1) {
		this.spiller1 = spiller1;
	}

	public Spiller getSpiller2() {
		return spiller2;
	}

	public void setSpiller2(Spiller spiller2) {
		this.spiller2 = spiller2;
	}

	public Spiller getSpiller3() {
		return spiller3;
	}

	public void setSpiller3(Spiller spiller3) {
		this.spiller3 = spiller3;
	}

	public Spiller getSpiller4() {
		return spiller4;
	}

	public void setSpiller4(Spiller spiller4) {
		this.spiller4 = spiller4;
	}

	public Spiller[] getSpillere() {
		return spillere;
	}

	public void setSpillere(Spiller[] spillere) {
		this.spillere = spillere;
	}

	public Farge[] getFarger() {
		return farger;
	}

	public void setFarger(Farge[] farger) {
		this.farger = farger;
	}

	public Queue<Spiller> getKoe() {
		return koe;
	}

	public void setKoe(Queue<Spiller> koe) {
		this.koe = koe;
	}
	
	
	

}
