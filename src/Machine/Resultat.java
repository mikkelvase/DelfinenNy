package Machine;

import java.io.Serializable;
import java.time.LocalDate;

//  the process of translating data structures or object state into a format that can be stored is called Serializable. Dette skal implementeres før vi kan gemme til fil.
public class Resultat implements Serializable {

    protected String disciplin;
    protected int minutter;
    protected int sekunder;
    protected int millisekunder;
    protected LocalDate dato;



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
                "" + disciplin +
                " Tid: " + minutter + ":" + sekunder + ":" + millisekunder +
                " Dato: " + dato;
    }
}