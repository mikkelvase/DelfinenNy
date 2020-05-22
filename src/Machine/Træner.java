package Machine;

import UI.UserInterface;

import java.time.LocalTime;

public class Træner {
UserInterface ui = new UserInterface();
    // Registrer tid og date for svømmer

// Fejl sender ikke svømmer med.
    public void setTime(int minutes , SvømmerInformationer svømmer) {

        LocalTime time = LocalTime.now();
        int hours = minutes / 60;
        int minutes1 = minutes % 60;
        int getMinute = LocalTime.now().getMinute();
        LocalTime time2;

        if (getMinute + minutes1 >= 60) {
            time2 = LocalTime.of(time.plusHours(hours + 1).getHour(), time.plusMinutes(minutes1).getMinute());

        } else {
            time2 = LocalTime.of(time.plusHours(hours).getHour(), time.plusMinutes(minutes1).getMinute());

        }
       svømmer.setTime(time2);
        ui.printTekst("Vi har tilføjet følgende tid" + time2 + " til svømmeren: " + svømmer.getNavn());
    }
}
