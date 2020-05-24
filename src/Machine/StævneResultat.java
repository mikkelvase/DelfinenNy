package Machine;

import java.time.LocalDate;

public class StævneResultat extends Resultat {
    protected String stævneNavn;
    protected int placering;

    StævneResultat(String disciplin, int minutter, int sekunder, int millisekunder, LocalDate dato, String stævneNavn, int placering) {
        super(disciplin, minutter, sekunder, millisekunder, dato);
        this.stævneNavn = stævneNavn;
        this.placering = placering;
    }

    //Skal give en String fx "12345" som man kan bruge til at sammenligne med andre tider
    public String getResultatSomString(){
        String resultat = "";

        return resultat;
    }

    @Override
    public String toString() {
        return
                "Dato: " + dato +
                "\nStævne: "  + stævneNavn + " Disciplin: " + disciplin + " Placering: nr. " + placering + "\n" +
                        "Tid: " + minutter + ":" + sekunder + ":" + millisekunder;
    }
}
