package Machine;

import Controller.Controller;
import UI.UserInterface;

public class Revisor {

   private  UserInterface ui = new UserInterface();



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
