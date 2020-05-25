package Økonomi;

import Machine.SvømmerInformationer;
import UI.UserInterface;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Kontigentberegner {


   private int seniortakst = 1600;
   private int juniortakst = 1000;
   private int passivTakst = 500;
   private double seniorRabet = 1600 * 0.75;

   private ArrayList<SvømmerInformationer> personerIRestance = new ArrayList<>();










public double beregnKontigentBetalingForSvømmer(SvømmerInformationer svømmerInformationer) {


    Period period = Period.between(svømmerInformationer.getFødselsdato() , LocalDate.now());

    int year = period.getYears();

    // For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år)

    if( svømmerInformationer.getAktivitetsform() == true && year < 18 ) {

        svømmerInformationer.setKontigentBetaling(juniortakst);

        return juniortakst;

        // for seniorsvømmere (18 år og over) 1600 kr der er aktive

    } else if(svømmerInformationer.getAktivitetsform() == true && year > 18 && year < 60) {

        svømmerInformationer.setKontigentBetaling(seniortakst);


        return seniortakst;


    } else if (svømmerInformationer.getAktivitetsform() == true && year > 60) {

        svømmerInformationer.setKontigentBetaling(seniorRabet);

        return seniorRabet;

    } else {

        svømmerInformationer.setKontigentBetaling(passivTakst);

        return passivTakst;
    }


}

    public ArrayList<SvømmerInformationer> printMedlemmerIRestance(ArrayList<SvømmerInformationer> svømmerInformationers) {


        for (int i = 0; i < svømmerInformationers.size(); i++) {

            boolean eriRestance = svømmerInformationers.get(i).isiRestance();

            if (eriRestance == true ) {

                personerIRestance.add(svømmerInformationers.get(i));

            }




        }

    return personerIRestance;
    }
/*
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

 */

    @Override
    public String toString() {
        return
                "personerIRestance = " + personerIRestance;
    }
}
