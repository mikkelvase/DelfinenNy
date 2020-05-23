package Machine;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


//  the process of translating data structures or object state into a format that can be stored.
public class SvømmerInformationer implements Serializable {

    private String navn;
    private String adresse;
    private LocalDate age; // Dette er ikke alder, men fødselsdag.
    private boolean aktivitetsform;
    private String medlemskab;
    private String[] disciplin;
    private double kontigentBetaling;
    //private LocalTime time;
    private Resultat resultat;
    //private LocalDate datoForNytResultat;
    private boolean iRestance;



/*
    public SvømmerInformationer(String navn, String fødselsdato, String adresse, String aktivitetsform, String medlemskab) {
        this.navn = navn;
        this.fødselsdato = fødselsdato;
        this.adresse = adresse;
        this.aktivitetsform = aktivitetsform;
        this.medlemskab = medlemskab;
    }

 */

    // Gettere

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public boolean getAktivitetsform() {
        return aktivitetsform;
    }

    public String getMedlemskab() {
        return medlemskab;
    }

    public String[] getDisciplin(){
        return disciplin;
    }

    public LocalDate getAge() {

        this.age = age;
        return age;
    }

    public boolean isiRestance() {
        return iRestance;
    }

    public boolean isAktivitetsform() {
        return aktivitetsform;
    }

    /*
    public LocalDate getDatoForNytResultat() {
        return datoForNytResultat;
    }
     */

    public double getKontigentBetaling() {
        return kontigentBetaling;
    }

    /*
    public LocalTime getTime() {
        return time;
    }
     */

    public Resultat getResultat() {
        return resultat;
    }

    // Settere


    public void setNavn(String navn) {
        this.navn = navn;
    }

    /*
    public void setTime(LocalTime time) {
        this.time = time;
    }
     */

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAktivitetsform(boolean aktivitetsform) {
        this.aktivitetsform = aktivitetsform;
    }

    public void setMedlemskab(String medlemskab) {
        this.medlemskab = medlemskab;
    }

    public void setDisciplin(String[] disciplin) {
        this.disciplin = disciplin;
    }

    public LocalDate setAge(String fødselsdato) {

       this.age = LocalDate.parse(fødselsdato);

        return age;

    }

    public void setiRestance(boolean iRestance) {
        this.iRestance = iRestance;
    }

    /*
    public LocalDate setdatoForNytResultat(String resultatTid) {
        this.datoForNytResultat = LocalDate.parse(resultatTid);
        return datoForNytResultat;
    }

     */

    public void setKontigentBetaling(double kontigentBetaling) {
        this.kontigentBetaling = kontigentBetaling;
    }



    @Override
    public String toString() {
        return "\n" + "Fulde navn: " +
                 navn + " " + " Adresse: " +
                 adresse + " Fødselsdag: " + age + " \n " + " Aktivitetsform: " +
                 aktivitetsform + " Medlemdskab:  "
                + medlemskab + " Valgte discipliner: " + Arrays.toString(disciplin) + "\nBedste reultat: " + resultat +  "\n";
    }


}
