package controllers;

import enums.Farge;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import objekter.Spill;

public class spillController {

	@FXML
	private Button startKnapp;
	
    @FXML
    private Label base1Bla;

    @FXML
    private Label base1Gronn;

    @FXML
    private Label base1Gul;

    @FXML
    private Label base1Rod;

    @FXML
    private Label base2Bla;

    @FXML
    private Label base2Gronn;

    @FXML
    private Label base2Gul;

    @FXML
    private Label base2Rod;

    @FXML
    private Label base3Bla;

    @FXML
    private Label base3Gronn;

    @FXML
    private Label base3Gul;

    @FXML
    private Label base3Rod;

    @FXML
    private Label base4Bla;

    @FXML
    private Label base4Gronn;

    @FXML
    private Label base4Gul;

    @FXML
    private Label base4Rod;

    @FXML
    private Button kast;

    @FXML
    private TextField nuMSpillere;

    @FXML
    private Button nyBrikke;

    @FXML
    private Label q1;

    @FXML
    private Label q10;

    @FXML
    private Label q11;

    @FXML
    private Label q12;

    @FXML
    private Label q13;

    @FXML
    private Label q14;

    @FXML
    private Label q15;

    @FXML
    private Label q16;

    @FXML
    private Label q17;

    @FXML
    private Label q18;

    @FXML
    private Label q19;

    @FXML
    private Label q2;

    @FXML
    private Label q20;

    @FXML
    private Label q21;

    @FXML
    private Label q22;

    @FXML
    private Label q23;

    @FXML
    private Label q24;

    @FXML
    private Label q25;

    @FXML
    private Label q26;

    @FXML
    private Label q27;

    @FXML
    private Label q28;

    @FXML
    private Label q29;

    @FXML
    private Label q3;

    @FXML
    private Label q30;

    @FXML
    private Label q31;

    @FXML
    private Label q32;

    @FXML
    private Label q33;

    @FXML
    private Label q34;

    @FXML
    private Label q35;

    @FXML
    private Label q36;

    @FXML
    private Label q37;

    @FXML
    private Label q38;

    @FXML
    private Label q39;

    @FXML
    private Label q4;

    @FXML
    private Label q40;

    @FXML
    private Label q41;

    @FXML
    private Label q42;

    @FXML
    private Label q43;

    @FXML
    private Label q44;

    @FXML
    private Label q45;

    @FXML
    private Label q46;

    @FXML
    private Label q47;

    @FXML
    private Label q48;

    @FXML
    private Label q49;

    @FXML
    private Label q5;

    @FXML
    private Label q50;

    @FXML
    private Label q51;

    @FXML
    private Label q52;

    @FXML
    private Label q6;

    @FXML
    private Label q7;

    @FXML
    private Label q8;

    @FXML
    private Label q9;

    @FXML
    private Label spillerSinTur;

    @FXML
    private Label tarningRes;
    
    
    private Spill spill;
    
    public int tarningResultat() {
    	int res = 0;
    	if(tarningRes.getText().equals("1"))
    		res = 1;
    	else if(tarningRes.getText().equals("2"))
    		res = 2;
    	else if(tarningRes.getText().equals("3"))
    		res = 3;
    	else if(tarningRes.getText().equals("4"))
    		res = 4;
    	else if(tarningRes.getText().equals("5"))
    		res = 5;
    	else if(tarningRes.getText().equals("6"))
    		res = 6;
    	
    	return res;
    }
    
    /*
     * Her kan man legge inn slik at brikker kan bli drept
     * ved å sjekke om label før har en annen farge enn seg selv vil man kunne drepe.
     */
    public void flytt(int brikkeNum) {
    	try {
	    	int posFor = spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon();
	    	Label labelFor = posTilLabel(posFor);
	    	if(labelFor.getText().equals(getBrikkeBukstav())) {
		    	labelFor.setText("");
	    	} else if(labelFor.getText().equals(getBrikkeBukstav() + " x 2")) {
	    		labelFor.setText(getBrikkeBukstav());
	    	} else if(labelFor.getText().equals(getBrikkeBukstav() + " x 3")) {
	    		labelFor.setText(getBrikkeBukstav() + " x 2");
	    	} else if(labelFor.getText().equals(getBrikkeBukstav() + " x 4")) {
	    		labelFor.setText(getBrikkeBukstav() + " x 3");
	    	}
	    	
	    	spill.handling(tarningResultat(), 1, brikkeNum);
	    	
	    	int posEtter = posFor + tarningResultat();
	    	Label labelEtter = posTilLabel(posEtter);
	    	if(labelEtter.getText().equals("")) {
	    		labelEtter.setText(getBrikkeBukstav());
	    	} else if(labelEtter.getText().equals(getBrikkeBukstav())) {
	    		labelEtter.setText(getBrikkeBukstav() + " x 2");
	    	} else if(labelEtter.getText().equals(getBrikkeBukstav() + " x 2")) {
	    		labelEtter.setText(getBrikkeBukstav() + " x 3");
	    	} else if(labelEtter.getText().equals(getBrikkeBukstav() + " x 3")) {
	    		labelEtter.setText(getBrikkeBukstav() + " x 4");
	    	}
	    	
	    	
	    	// 1, 9, 14, 22, 27, 35, 40, 48
	    	if(spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 1 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 9 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 14 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 22 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 27 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 35 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 40 ||
	    			spill.getAktuellSpiller().getBrikke(brikkeNum).getPossisjon() == 49
	    			) {
	    		spill.getAktuellSpiller().getBrikke(brikkeNum).setiSafeSone(true);
	    		System.out.println("Brikke " + brikkeNum + " er i safeSone!");
	    	} else {
	    		spill.getAktuellSpiller().getBrikke(brikkeNum).setiSafeSone(false);
	    	}
	    	
	    	spill.nesteSpiller();
	    	oppdaterSpiller();
    	} catch(NullPointerException e) {
    		System.out.println("Du kan ikke gjøre dette!");
    	}
    }
    
    @FXML
    void flyttB1(ActionEvent event) {
    	flytt(1);
    }


	@FXML
    void flyttB2(ActionEvent event) {
		flytt(2);
    }

    @FXML
    void flyttB3(ActionEvent event) {
    	flytt(3);
    }

    @FXML
    void flyttB4(ActionEvent event) {
    	flytt(4);
    }

    @FXML
    void kastTarning(ActionEvent event) {
    	int res = (int) (Math.random()*6+1);
    	tarningRes.setText(res + "");
    	
    	oppdaterSpiller();
    }

    private String getBrikkeBukstav() {
    	Farge farge = spill.getAktuellSpiller().getFarge();
    	String bukstav = ""; 
    	
    	if(farge == Farge.GUL)
    		bukstav = "GU";
    	else if(farge == Farge.GRONN)
    		bukstav = "GR";
    	else if(farge == Farge.BLA)
    		bukstav = "BL";
    	else if(farge == Farge.ROD)
    		bukstav = "RO";
    	
    	return bukstav;
    	
    }
    
    @FXML
    void startSpill(ActionEvent event) {
    	int res = 0;
    	if(nuMSpillere.getText().equals("2"))
    		res = 2;
    	else if(nuMSpillere.getText().equals("3"))
    		res = 3; 
    	else if(nuMSpillere.getText().equals("4"))
    		res = 4;
    	else
    		res = 2;
    	
    	spill = new Spill(res);
    	
    	nuMSpillere.setVisible(false);
    	startKnapp.setVisible(false);   
    	oppdaterSpiller();
    }

    @FXML
    void utNyBrikke(ActionEvent event) {
    	if(tarningResultat() != 6) {
    		spill.nesteSpiller();
    	} else if(spill.getAktuellSpiller().getBrikkerInne() == 0) {
    		System.out.println("Du har alle brikkene ute!");
    	} else {
	    	spill.handling(tarningResultat(), 0, 0);
	    	if(spill.getAktuellSpiller().getFarge() == Farge.GUL)
	    	{
	    		if(q1.getText().equals("")) {
	    			q1.setText(getBrikkeBukstav());
	    		} else if(q1.getText().equals(getBrikkeBukstav())) {
	    			q1.setText(getBrikkeBukstav() + " x 2");
	    		} else if(q1.getText().equals(getBrikkeBukstav() +" x 2")) {
	    			q1.setText(getBrikkeBukstav() + " x 3");
	    		} else if(q1.getText().equals(getBrikkeBukstav() + " x 3")) {
	    			q1.setText(getBrikkeBukstav() + " x 4");
	    		}
	    	}
	    	else if(spill.getAktuellSpiller().getFarge() == Farge.GRONN)
	    	{
	    		if(q14.getText().equals("")) {
	    			q14.setText(getBrikkeBukstav());
	    		} else if(q14.getText().equals(getBrikkeBukstav())) {
	    			q14.setText(getBrikkeBukstav() + " x 2");
	    		} else if(q14.getText().equals(getBrikkeBukstav() +" x 2")) {
	    			q14.setText(getBrikkeBukstav() + " x 3");
	    		} else if(q14.getText().equals(getBrikkeBukstav() + " x 3")) {
	    			q14.setText(getBrikkeBukstav() + " x 4");
	    		}
	    	}
	    	else if(spill.getAktuellSpiller().getFarge() == Farge.BLA)
	    	{
	    		if(q27.getText().equals("")) {
	    			q27.setText(getBrikkeBukstav());
	    		} else if(q27.getText().equals(getBrikkeBukstav())) {
	    			q27.setText(getBrikkeBukstav() + " x 2");
	    		} else if(q27.getText().equals(getBrikkeBukstav() +" x 2")) {
	    			q27.setText(getBrikkeBukstav() + " x 3");
	    		} else if(q27.getText().equals(getBrikkeBukstav() + " x 3")) {
	    			q27.setText(getBrikkeBukstav() + " x 4");
	    		}
	    	}
	    	else if(spill.getAktuellSpiller().getFarge() == Farge.ROD)
	    	{
	    		if(q40.getText().equals("")) {
	    			q40.setText(getBrikkeBukstav());
	    		} else if(q40.getText().equals(getBrikkeBukstav())) {
	    			q40.setText(getBrikkeBukstav() + " x 2");
	    		} else if(q40.getText().equals(getBrikkeBukstav() +" x 2")) {
	    			q40.setText(getBrikkeBukstav() + " x 3");
	    		} else if(q40.getText().equals(getBrikkeBukstav() + " x 3")) {
	    			q40.setText(getBrikkeBukstav() + " x 4");
	    		}
	    	}
    	}
	    
    	oppdaterSpiller();
    	
    	
    }
    
    public Label posTilLabel(int pos) {
    	
    	switch(pos)
    	{
    	case 1:
    		return q1;
    	case 2:
    		return q2;
    	case 3:
    		return q3;
    	case 4:
    		return q4;
    	case 5:
    		return q5;
    	case 6:
    		return q6;
    	case 7:
    		return q7;
    	case 8:
    		return q8;
    	case 9:
    		return q9;
    	case 10:
    		return q10;
    	case 11:
    		return q11;
    	case 12:
    		return q12;
    	case 13:
    		return q13;
    	case 14:
    		return q14;
    	case 15:
    		return q15;
    	case 16:
    		return q16;
    	case 17:
    		return q17;
    	case 18:
    		return q18;
    	case 19:
    		return q19;
    	case 20:
    		return q20;
    	case 21:
    		return q21;
    	case 22:
    		return q22;
    	case 23:
    		return q23;
    	case 24:
    		return q24;
    	case 25:
    		return q25;
    	case 26:
    		return q26;
    	case 27:
    		return q27;
    	case 28:
    		return q28;
    	case 29:
    		return q29;
    	case 30:
    		return q30;
    	case 31:
    		return q31;
    	case 32:
    		return q32;
    	case 33:
    		return q33;
    	case 34:
    		return q34;
    	case 35:
    		return q35;
    	case 36:
    		return q36;
    	case 37:
    		return q37;
    	case 38:
    		return q38;
    	case 39:
    		return q39;
    	case 40:
    		return q40;
    	case 41:
    		return q41;
    	case 42:
    		return q42;
    	case 43:
    		return q43;
    	case 44:
    		return q44;
    	case 45:
    		return q45;
    	case 46:
    		return q46;
    	case 47:
    		return q47;
    	case 48:
    		return q48;
    	case 49:
    		return q49;
    	case 50:
    		return q50;
    	case 51:
    		return q51;
    	case 52: 
    		return q52;    		
    	}
    	return null;
    }
    
    public void oppdaterSpiller() {
    	spillerSinTur.setText("Spiller: " + spill.getAktuellSpiller().getFarge());
    }

}
