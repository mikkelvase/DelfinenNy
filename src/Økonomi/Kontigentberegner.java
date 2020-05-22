package Økonomi;

import Machine.SvømmerInformationer;

import java.time.LocalDate;
import java.time.Period;

public class Kontigentberegner {




/*

For aktive medlemmer er kontingentet for ungdomssvømmere (under 18 år) 1000 kr. årligt, for seniorsvømmere (18 år og over) 1600 kr
. årligt. For medlemmer over 60 år gives der 25 % rabat af seniortaksten. For passivt medlemskab er taksten 500 kr. årligt.
 */

int seniortakst = 1600;
int juniortakst = 1000;
int passivTakst = 500;
double seniorRabet = 1600 * 0.75;





public double beregnKontigentBetalingForSvømmer(SvømmerInformationer svømmerInformationer) {


    Period period = Period.between(svømmerInformationer.getAge() , LocalDate.now());

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
}
