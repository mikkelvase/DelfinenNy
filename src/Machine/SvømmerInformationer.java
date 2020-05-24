package Machine;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;


//  the process of translating data structures or object state into a format that can be stored.
public class SvømmerInformationer implements Serializable {

    private String navn;
    private String adresse;
    private LocalDate fødselsdato;
    private boolean aktivitetsform;
    private String medlemskab;
    private String[] disciplin;
    private double kontigentBetaling;
    //private LocalTime time;
    private Resultat resultat;
    private StævneResultat stævneResultat;
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

    public LocalDate getFødselsdato() {

        this.fødselsdato = fødselsdato;
        return fødselsdato;
    }

    public boolean isiRestance() {
        return iRestance;
    }

    public boolean isAktivitetsform() {
        return aktivitetsform;
    }

    public double getKontigentBetaling() {
        return kontigentBetaling;
    }

    public Resultat getResultat() {
        return resultat;
    }


    // Settere

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    public void setStævneResultat(StævneResultat stævneResultat) {
        this.stævneResultat = stævneResultat;
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
       this.fødselsdato = LocalDate.parse(fødselsdato);
        return this.fødselsdato;
    }

    public int calculateAge() {
        if ((fødselsdato != null)) {
            return Period.between(fødselsdato, LocalDate.now()).getYears();
        } else {
            return 0;
        }
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
                 adresse + " Fødselsdag: " + fødselsdato + " \n " + " Aktivitetsform: " +
                 aktivitetsform + " Medlemdskab:  "
                + medlemskab + " Valgte discipliner: " + Arrays.toString(disciplin) + "\nBedste træningsreultat: " + resultat +  "\n"
                + "\nBedste stævnesreultat: " + stævneResultat +  "\n";
    }


}
