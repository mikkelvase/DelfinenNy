package Machine;

import UI.UserInterface;

import java.time.LocalDate;
import java.time.LocalTime;

public class Træner {
UserInterface ui = new UserInterface();
    // Registrer tid og date for svømmer

// Fejl sender ikke svømmer med.
    public void angivNytTræningsResultat(int minutes , SvømmerInformationer svømmer , String dato) {


        svømmer.setdatoForNytResultat(dato);
        int hours = minutes / 60;
        int minutes1 = minutes % 60;
        LocalTime time2;
        time2 = LocalTime.of(hours,minutes1);

       svømmer.setTime(time2);
        ui.printTekst("Vi har tilføjet følgende tid" + time2 + " til svømmeren: " + svømmer.getNavn() + " Dato: " + svømmer.getDatoForNytResultat());
    }
}
