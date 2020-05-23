package Machine;

import Controller.Controller;
import UI.UserInterface;

public class Revisor {

    UserInterface ui = new UserInterface();
    // Skal kunne sætte medlemmer i restance med søgefunktion.



    // Søge:



/*

    public SvømmerInformationer søgEfterSvømmerForAtSætteIRestance(String navnPåSvømmerDerSkalIRestance) {


        Controller c = new Controller();


        for (int i = 0; i < c.getKlub().getAlleMedlemerIKlubben().size(); i++) {

            SvømmerInformationer svømmer = c.getKlub().getAlleMedlemerIKlubben().get(i);

            if (svømmer.getNavn().equals(navnPåSvømmerDerSkalIRestance)) {

                return svømmer;
            }


        }

        return null;

    }

 */

    public void sætSvømmerIRestance(SvømmerInformationer svømmerInformationer){




        ui.printTekst("Tryk 1 for at sætte svømmeren i restance." +
                "Tryk 2 for at fjerne svømmeren fra listen. ");
        int revisorvalg = ui.fåBrugerValgSomInt();

        if(revisorvalg == 1) {

            svømmerInformationer.setiRestance(true);
            ui.printTekst(svømmerInformationer.getNavn() + "Er tilføjet til /i Restance Listen/");

        } else if (revisorvalg == 2) {

            svømmerInformationer.setiRestance(false);
            ui.printTekst(svømmerInformationer.getNavn() + "Er fjernet fra  /i Restance Listen/");
        }



    }
}
