package Machine;

import UI.UserInterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Træner {
UserInterface ui = new UserInterface();
    // Registrer tid og date for svømmer

// Fejl sender ikke svømmer med.
    public void angivNytTræningsResultat(int minutes, int seconds, int milliseconds, SvømmerInformationer svømmer , String dato) {


        svømmer.setdatoForNytResultat(dato);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        int hours = minutes / 60;
        int minutes1 = minutes % 60;
        int seconds1 = seconds;
        int milliseconds1 = milliseconds * 10000000;
        LocalTime time2;
        time2 = LocalTime.of(hours,minutes1, seconds1, milliseconds1);



       svømmer.setTime(time2);
        ui.printTekst("Vi har tilføjet følgende tid: " + formatter.format(time2) + " til svømmeren: " + svømmer.getNavn() + " Dato: " + svømmer.getDatoForNytResultat());
    }
}
