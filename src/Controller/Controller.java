package Controller;

import Machine.*;
import Storage.FilHåndtering;
import UI.UserInterface;
import Økonomi.Kontigentberegner;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {


    UserInterface ui = new UserInterface();
    FilHåndtering filer = new FilHåndtering();
    Klubben klub = new Klubben();
    Kontigentberegner k = new Kontigentberegner();
    Træner træner = new Træner();
    Revisor revisor = new Revisor();


    public void præsenterMenuForbrugeren() throws IOException, ClassNotFoundException {


        ui.printTekst("Tryk 1 for Formand  ");
        ui.printTekst("Tryk 2 for Træner ");
        ui.printTekst("Tryk 3 for Revisor");
        ui.printTekst("Tryk 4 for at afslutte programmet");

        int valgteTal = ui.fåBrugerValgSomInt();

        if (valgteTal == 1) {

            ui.printTekst("Tryk 1 for at oprette en svømmer");
            ui.printTekst("Tryk 2 for vende tilbage til hovedmenu");
            ui.printTekst("Tryk 3 Afslutte programmet");

            int valgteTal1 = ui.fåBrugerValgSomInt();


            formandMenu(valgteTal1);


        } else if (valgteTal == 2) {

            ui.printTekst("Tryk 1 for at se alle medlemmer i klubben");
            ui.printTekst("Tryk 2 for vende tilbage til hovedmenu");
            ui.printTekst("Tryk 3 for at registrere nyt træningsresultat for svømmer");
            ui.printTekst("Tryk 4 for at registrere nyt stævneresultat for svømmer");

            int valgteTal2 = ui.fåBrugerValgSomInt();


            trænerMenu(valgteTal2);


        } else if (valgteTal == 3) {


            ui.printTekst("tryk 1 for at se samlede indbetalinger");
            ui.printTekst("Tryk 2 for at sætte medlemmer i restance");
            ui.printTekst("Tryk 3 for at vende tilbage til hovedmenuen");

            int valgtetal3 = ui.fåBrugerValgSomInt();

            revisorMenu(valgtetal3);

        } else if (valgteTal == 4) {

            filer.gemSvømmerIFil(klub.getAlleMedlemerIKlubben());


        }
    }

// Kan flyttes til Run funktion med getklub fra controller.

    public void indlæsAlleSvømmereNårProgrammetStarter() {


        filer.tilføjSvømmereTilKlubFraFil(klub.getAlleMedlemerIKlubben());


    }

    // Kan med fordel  flyttes til revisor // Økonomiklassen
    public double udregnKontigentBetalingerForHeleKlubben() {

        double samledeBetalinger = 0.0;
        for (int i = 0; i < klub.getAlleMedlemerIKlubben().size(); i++) {
            SvømmerInformationer svømmerInformationer = klub.getAlleMedlemerIKlubben().get(i);
            samledeBetalinger = samledeBetalinger + k.beregnKontigentBetalingForSvømmer(svømmerInformationer);
        }
        return samledeBetalinger;
    }


    public void formandMenu(int valgteTal) throws IOException, ClassNotFoundException {


        if (valgteTal == 1) {

            SvømmerInformationer nySvømmer = ui.opretEnNySvømmer();
            klub.getAlleMedlemerIKlubben().add(nySvømmer);
            præsenterMenuForbrugeren();

        } else if (valgteTal == 2) {

            præsenterMenuForbrugeren();

        } else if (valgteTal == 3) {

            filer.gemSvømmerIFil(klub.getAlleMedlemerIKlubben());
        }

    }

    public void trænerMenu(int valgteTal) throws IOException, ClassNotFoundException {

        if (valgteTal == 1) {
            // Top 5
            ui.printTekst("Medlemmer i Klubben: " + "\n" + klub.getAlleMedlemerIKlubben());
            præsenterMenuForbrugeren();
        } else if (valgteTal == 2) {
            præsenterMenuForbrugeren();
        } else if (valgteTal == 3) {
            ui.printTekst("Medlemmer i Klubben: " + klub.getAlleMedlemerIKlubben());

            // Valgt svømmer.

            ui.printTekst("Indtast navnet på Svømmeren der skal have et nyt træningsresultat: ");
            String søgtesvømmer = ui.fåBrugerValgSomStringt();

            ui.printTekst("Indtast disciplin");
            String valgteDisciplin = ui.fåBrugerValgSomStringt();

            ui.printTekst("Indtast først antal hele minutter");
            int valgteMinutter = ui.fåBrugerValgSomInt();

            ui.printTekst("Indtast antal sekunder");
            int valgteSekunder = ui.fåBrugerValgSomInt();

            ui.printTekst("Indtast antal millisekunder");
            int valgteMillisekunder = ui.fåBrugerValgSomInt();

            ui.printTekst("Vælg en dato for resultat. Dags dato er: " + LocalDate.now());
            String valgteDato = ui.fåBrugerValgSomStringt();

            træner.angivNytTræningsResultat(valgteDisciplin, valgteMinutter, valgteSekunder, valgteMillisekunder, søgEfterSvømmer(søgtesvømmer), valgteDato);

            præsenterMenuForbrugeren();


        } else if (valgteTal == 4){
            ui.printTekst("Konkurrencesvømmere i Klubben: " + klub.getAlleKonkurrenceSvømmereIKlubben());

            // Valgt svømmer.

            ui.printTekst("Indtast navnet på Svømmeren der skal have et nyt stævneresultat: ");
            String søgtesvømmer = ui.fåBrugerValgSomStringt();

            ui.printTekst("Indtast navn på stævne");
            String stævneNavn = ui.fåBrugerValgSomStringt();

            ui.printTekst("Indtast placering opnået ved stævne");
            int placering = ui.fåBrugerValgSomInt();

            ui.printTekst("Indtast disciplin");
            String valgteDisciplin = ui.fåBrugerValgSomStringt();

            ui.printTekst("Indtast først antal hele minutter");
            int valgteMinutter = ui.fåBrugerValgSomInt();

            ui.printTekst("Indtast antal sekunder");
            int valgteSekunder = ui.fåBrugerValgSomInt();

            ui.printTekst("Indtast antal millisekunder");
            int valgteMillisekunder = ui.fåBrugerValgSomInt();

            ui.printTekst("Vælg en dato for resultat. Dags dato er: " + LocalDate.now());
            String valgteDato = ui.fåBrugerValgSomStringt();

            træner.angivNytStævneResultat(stævneNavn, placering, valgteDisciplin, valgteMinutter, valgteSekunder, valgteMillisekunder, søgEfterSvømmer(søgtesvømmer), valgteDato);

            præsenterMenuForbrugeren();
        }

    }

    public void revisorMenu(int valgteTal) throws IOException, ClassNotFoundException {

        if (valgteTal == 1) {
            ui.printTekst("Forventede indbetalinger for Klubben " + udregnKontigentBetalingerForHeleKlubben());
            præsenterMenuForbrugeren();
        } else if (valgteTal == 2) {
            ui.printTekst("Medlemmer i Restance: " + k.printMedlemmerIRestance(klub.getAlleMedlemerIKlubben()));

            ui.printTekst("Indtast navnet på den svømmer du vil tilføje eller fjerne fra listen.");
            String navn = ui.fåBrugerValgSomStringt();

            revisor.sætSvømmerIRestance(søgEfterSvømmer(navn));
            præsenterMenuForbrugeren();
        } else if (valgteTal == 3) {
            præsenterMenuForbrugeren();

        }


    }




    public SvømmerInformationer søgEfterSvømmer(String navnPåSvømmer) {


        for (int i = 0; i < klub.getAlleMedlemerIKlubben().size(); i++) {

            SvømmerInformationer svømmer = klub.getAlleMedlemerIKlubben().get(i);

            if (svømmer.getNavn().equals(navnPåSvømmer)) {

                return svømmer;
            }


        }

        return null;

    }

}



