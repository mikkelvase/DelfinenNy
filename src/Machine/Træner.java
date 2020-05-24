package Machine;

import UI.UserInterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Træner {
    UserInterface ui = new UserInterface();

    // Registrer tid og date for svømmer

    // Fejl sender ikke svømmer med.
    public void angivNytTræningsResultat(String disciplin, int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer, String dato) {
        Resultat resultat = new Resultat(disciplin, minutes, seconds, milliseconds, LocalDate.parse(dato));

        if(disciplin.toLowerCase().equals("bryst")) {
            svømmer.setResultatBryst(resultat);
        } else if (disciplin.toLowerCase().equals("butterfly")) {
            svømmer.setResultatButterfly(resultat);
        } else if (disciplin.toLowerCase().equals("crawl")) {
            svømmer.setResultatCrawl(resultat);
        } else if (disciplin.toLowerCase().equals("rygcrawl")) {
            svømmer.setResultatRygcrawl(resultat);
        }


        ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
    }

    public void angivNytStævneResultat(String stævneNavn, int placering, String disciplin, int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer, String dato) {
        StævneResultat stævneResultat = new StævneResultat(disciplin, minutes, seconds, milliseconds, LocalDate.parse(dato), stævneNavn, placering);

        if(disciplin.toLowerCase().equals("bryst")) {
            svømmer.setStævneResultatBryst(stævneResultat);
        } else if (disciplin.toLowerCase().equals("butterfly")) {
            svømmer.setStævneResultatButterfly(stævneResultat);
        } else if (disciplin.toLowerCase().equals("crawl")) {
            svømmer.setStævneResultatCrawl(stævneResultat);
        } else if (disciplin.toLowerCase().equals("rygcrawl")) {
            svømmer.setStævneResultatRygcrawl(stævneResultat);
        }

        //svømmer.setStævneResultat(stævneResultat);

        ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
    }

    //Skal sammenligne ved at rangere strings af tider fra mindst til størst. Bruger calculateAge() i Klubben til at differenceiere imellem aldersgrupper
    //se getResultatSomString() i StævneResultat

    /*
    public ArrayList<SvømmerInformationer> getTop5(String disciplin, String valgtAldersgruppe) {


    }

*/

}
