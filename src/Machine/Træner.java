package Machine;

import UI.UserInterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Træner {
   private  UserInterface ui = new UserInterface();




    public void angivNytTræningsResultat(int disciplin, int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer, String dato) {

        if(disciplin == 1) {
            Resultat resultat = new Resultat("Crawl", minutes, seconds, milliseconds, LocalDate.parse(dato));
            svømmer.setResultatCrawl(resultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 2) {
            Resultat resultat = new Resultat("Rygcrawl", minutes, seconds, milliseconds, LocalDate.parse(dato));
            svømmer.setResultatRygcrawl(resultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 3) {
            Resultat resultat = new Resultat("Bryst", minutes, seconds, milliseconds, LocalDate.parse(dato));
            svømmer.setResultatBryst(resultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 4) {
            Resultat resultat = new Resultat("Butterfly", minutes, seconds, milliseconds, LocalDate.parse(dato));
            svømmer.setResultatButterfly(resultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
        }



    }

    public void angivNytStævneResultat(String stævneNavn, int placering, int disciplin, int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer, String dato) {

        if(disciplin == 1) {
            StævneResultat stævneResultat = new StævneResultat("Crawl", minutes, seconds, milliseconds, LocalDate.parse(dato), stævneNavn, placering);
            svømmer.setStævneResultatCrawl(stævneResultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 2) {
            StævneResultat stævneResultat = new StævneResultat("Rygcrawl", minutes, seconds, milliseconds, LocalDate.parse(dato), stævneNavn, placering);
            svømmer.setStævneResultatRygcrawl(stævneResultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 3) {
            StævneResultat stævneResultat = new StævneResultat("Bryst", minutes, seconds, milliseconds, LocalDate.parse(dato), stævneNavn, placering);
            svømmer.setStævneResultatBryst(stævneResultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
        } else if (disciplin == 4) {
            StævneResultat stævneResultat = new StævneResultat("Butterfly", minutes, seconds, milliseconds, LocalDate.parse(dato), stævneNavn, placering);
            svømmer.setStævneResultatButterfly(stævneResultat);
            ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
        }

    }

    //Skal sammenligne ved at rangere strings af tider fra mindst til størst. Bruger calculateAge() i Klubben til at differenceiere imellem aldersgrupper
    //se getResultatSomString() i StævneResultat

    /*
    public ArrayList<SvømmerInformationer> getTop5(String disciplin, String valgtAldersgruppe) {


    }

*/

}
