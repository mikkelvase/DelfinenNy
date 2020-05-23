package Machine;

import java.time.LocalDate;

public class Resultat{

    String disciplin;
    int minutter;
    int sekunder;
    int millisekunder;
    LocalDate dato;



    public Resultat(String disciplin, int minutter, int sekunder, int millisekunder, LocalDate dato){
        this.disciplin = disciplin;
        this.minutter = minutter;
        this.sekunder = sekunder;
        this.millisekunder = millisekunder;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return
                "Disciplin: " + disciplin + "\n" +
                "Tid: " + minutter + ":" + sekunder + ":" + millisekunder +
                "\nDato: " + dato;
    }
}