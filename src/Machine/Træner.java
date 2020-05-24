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

        /*
        svømmer.setdatoForNytResultat(dato);
        int hours = minutes / 60;
        int minutes1 = minutes % 60;
        int seconds1 = seconds;
        int milliseconds1 = milliseconds * 10000000;
        LocalTime time2;
        time2 = LocalTime.of(hours, minutes1, seconds1, milliseconds1);
         */
        Resultat resultat = new Resultat(disciplin, minutes, seconds, milliseconds,LocalDate.parse(dato));

        svømmer.setResultat(resultat);

        ui.printTekst("Vi har tilføjet følgende resultat:\n" + resultat + "\nTil svømmeren: " + svømmer.getNavn());
    }

    public void angivNytStævneResultat(String stævneNavn, int placering, String disciplin, int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer, String dato) {

        /*
        svømmer.setdatoForNytResultat(dato);
        int hours = minutes / 60;
        int minutes1 = minutes % 60;
        int seconds1 = seconds;
        int milliseconds1 = milliseconds * 10000000;
        LocalTime time2;
        time2 = LocalTime.of(hours, minutes1, seconds1, milliseconds1);
         */
        StævneResultat stævneResultat = new StævneResultat(disciplin, minutes, seconds, milliseconds,LocalDate.parse(dato), stævneNavn, placering);

        svømmer.setStævneResultat(stævneResultat);

        ui.printTekst("Vi har tilføjet følgende resultat:\n" + stævneResultat + "\nTil svømmeren: " + svømmer.getNavn());
    }

    //Skal sammenligne ved at rangere strings af tider fra mindst til størst. Bruger calculateAge() i Klubben til at differenceiere imellem aldersgrupper
    //se getResultatSomString() i StævneResultat
    public ArrayList<SvømmerInformationer> getTop5(String disciplin, String valgtAldersgruppe){


    }


}
