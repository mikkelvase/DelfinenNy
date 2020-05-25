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
    private Resultat resultatCrawl;
    private Resultat resultatBryst;
    private Resultat resultatRygcrawl;
    private Resultat resultatButterfly;
    private StævneResultat stævneResultatCrawl;
    private StævneResultat stævneResultatBryst;
    private StævneResultat stævneResultatRygcrawl;
    private StævneResultat stævneResultatButterfly;

    //private LocalDate datoForNytResultat;
    private boolean iRestance;


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

    public Resultat getResultatCrawl() {
        return resultatCrawl;
    }

    public Resultat getResultatBryst() {
        return resultatBryst;
    }

    public Resultat getResultatRygcrawl() {
        return resultatRygcrawl;
    }

    public Resultat getResultatButterfly() {
        return resultatButterfly;
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




    // Settere

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public void setStævneResultatCrawl(StævneResultat stævneResultatCrawl) {
        this.stævneResultatCrawl = stævneResultatCrawl;
    }

    public void setStævneResultatBryst(StævneResultat stævneResultatBryst) {
        this.stævneResultatBryst = stævneResultatBryst;
    }

    public void setStævneResultatRygcrawl(StævneResultat stævneResultatRygcrawl) {
        this.stævneResultatRygcrawl = stævneResultatRygcrawl;
    }

    public void setStævneResultatButterfly(StævneResultat stævneResultatButterfly) {
        this.stævneResultatButterfly = stævneResultatButterfly;
    }

    public void setResultatCrawl(Resultat resultatCrawl) {
        this.resultatCrawl = resultatCrawl;
    }

    public void setResultatBryst(Resultat resultatBryst) {
        this.resultatBryst = resultatBryst;
    }

    public void setResultatRygcrawl(Resultat resultatRygcrawl) {
        this.resultatRygcrawl = resultatRygcrawl;
    }

    public void setResultatButterfly(Resultat resultatButterfly) {
        this.resultatButterfly = resultatButterfly;
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


    public void setiRestance(boolean iRestance) {
        this.iRestance = iRestance;
    }


    public void setKontigentBetaling(double kontigentBetaling) {
        this.kontigentBetaling = kontigentBetaling;
    }



    @Override
    public String toString() {
        return "\n" + "Fulde navn: " +
                 navn  + " Adresse: " +
                 adresse + " Fødselsdag: " + fødselsdato + "\n" + "Aktivitetsform: " +
                 aktivitetsform + " Medlemdskab: "
                + medlemskab + " Valgte discipliner: " + Arrays.toString(disciplin)
                + "\nBedste træningsreultat: " + resultatCrawl
                + "\nBedste træningsreultat: " + resultatRygcrawl
                + "\nBedste træningsreultat: " + resultatBryst
                + "\nBedste træningsreultat: " + resultatButterfly
                + "\nBedste stævnesreultat: "  + stævneResultatCrawl
                + "\nBedste stævnesreultat: "  + stævneResultatRygcrawl
                + "\nBedste stævnesreultat: "  + stævneResultatBryst
                + "\nBedste stævnesreultat: "  + stævneResultatButterfly + "\n";
    }
}
