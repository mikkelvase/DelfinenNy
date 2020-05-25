package Machine;

import java.time.LocalDate;
import java.util.ArrayList;

public class StævneResultat extends Resultat {
    protected String stævneNavn;
    protected int placering;



    StævneResultat(String disciplin, int minutter, int sekunder, int millisekunder, LocalDate dato, String stævneNavn, int placering) {
        super(disciplin, minutter, sekunder, millisekunder, dato);
        this.stævneNavn = stævneNavn;
        this.placering = placering;
    }



    @Override
    public String toString() {
        return
                "Disciplin: " + disciplin + " Stævne: "  + stævneNavn + " Placering: nr. " + placering +
                        " Tid: " + minutter + ":" + sekunder + ":" + millisekunder + " Dato: " + dato;
    }
}
