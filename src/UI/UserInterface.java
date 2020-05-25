package UI;

import Machine.SvømmerInformationer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class UserInterface {

    private Scanner userInput = new Scanner(System.in);


    // Printer tekst til skærmen.

    public void printTekst(String text) {
        System.out.println(text);
    }






    public SvømmerInformationer opretEnNySvømmer() {

        // Vi opretter en tom Svømmer uden nogen constructor. Så vi kan sætte via get og settere i Svømmerinformationer.

        SvømmerInformationer nySvømmer = new SvømmerInformationer();


        // Prompts og input fra brugeren anvendes til at "bygge" en svømmer.

        printTekst("Indtast venligst navn på medlemmet: ");
        nySvømmer.setNavn(userInput.nextLine());


        printTekst("Indtast venligst adresse: ");
        nySvømmer.setAdresse(userInput.nextLine());


       // printTekst("Angiv fødselsår fødselsdate i følgende format: ÅÅÅÅ-MM-DD");

        String date = fåLocalDateObjectSomInput();
        nySvømmer.setAge(date);
        printTekst("Vi har registretet følgende fødselsdag: " + nySvømmer.getFødselsdato());


        printTekst("Angiv aktivitetsgrad. Tryk 1 for: Aktiv, Tryk 2 for: Passiv");
        int userChoice = userInput.nextInt();

        if (userChoice == 1) {
            nySvømmer.setAktivitetsform(true);
        } else if (userChoice == 2) {
            nySvømmer.setAktivitetsform(false);
        } else {
            printTekst("Tryk venligst 1 eller 2. Prøv igen: ");
        }


        printTekst("Angiv type af aktivitet. Tryk 1 for KonkurrenceSvømmer, Tryk 2 for Motionist");

        int userChoice2 = userInput.nextInt();
        if (userChoice2 == 1) {
            nySvømmer.setMedlemskab("Konkurrence");
        } else if (userChoice2 == 2) {
            nySvømmer.setMedlemskab("Motionist");
        }


        printTekst("Vil du tilføje en eller flere dicipliner til svømmeren? Tryk 1 for: JA , Tryk 2 for: MÅSKE SENERE");

        int userChoice1 = userInput.nextInt();

        if (userChoice1 == 1) {

            printTekst("Angiv hvilke discipliner der skal tilføjes til svømmeren: \n 1. Crawl \n 2. Brystsvømmming \n 3. Ryg Crawl \n 4. ButterFly");

            String[] disciplin = valgteDiscipliner();

            nySvømmer.setDisciplin(disciplin);

            printTekst("Svømmeren blev oprettet i systemet! ");


        } else if (userChoice1 == 2) {

            printTekst("Svømmeren blev oprettet i systemet! ");
        }

        return nySvømmer;
    }



// Retunerer en int værdi som brugeren vælger via Scanenr input



    // Retunerer en String værdi som brugeren vælger via Scanenr input

    public String fåBrugerValgSomStringt() {

        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        String brugervalg = "";
        do{
            if(scan.hasNextLine()){
                brugervalg = scan.nextLine();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Ugyldigt input ");
            }
        }while(!wenttocatch);
        return brugervalg;
    }


    public int fåBrugerValgSomInt() {

        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        int brugervalg = 0;
        do{
            if(scan.hasNextInt()){
                brugervalg = scan.nextInt();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Skriv et tal: ");
            }
        }while(!wenttocatch);
        return brugervalg;
    }



public String fåLocalDateObjectSomInput() {

    Scanner scanner = new Scanner(System.in);
    String dateGivenByUserString;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    System.out.println("Skriv datoen i formattet: yyyy-MM-dd");

    try {

        do {

            dateGivenByUserString = scanner.nextLine();

        } while (!dateGivenByUserString.matches("\\d{4}-\\d{2}-\\d{2}"));

       // LocalDate dateGivenByUser = LocalDate.parse(dateGivenByUserString, dateFormatter);
       //  System.out.println(dateGivenByUser.format(dateFormatter));
        return dateGivenByUserString;

    } catch (IllegalArgumentException e) {
        System.out.println("Skriv datoen i formattet: yyyy.MM.dd");

    }
    return "";
}




// Bygger en array af valgte discipliner ud fra brugerens indtastninger.

    public String[] valgteDiscipliner() {

        // Brugervalg gemmes i Array
        String[] chosenDisciplins = new String[4];

        userInput.nextLine();

        String in = userInput.nextLine();

        // The method split() splits a String into multiple Strings given the delimiter that separates them
        String[] inStrings = in.split(" ");

        int[] integers = new int[inStrings.length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(inStrings[i]);
        }
        for (int i = 0; i < integers.length; i++) {

            switch (integers[i]) {
                case 1:
                    chosenDisciplins[0] = "Crawl";
                    break;
                case 2:
                    chosenDisciplins[1] = "Rygcrawl";
                    break;
                case 3:
                    chosenDisciplins[2] = "Bryst";
                    break;
                case 4:
                    chosenDisciplins[3] = "Butterfly";
                    break;

            }


        }

        return chosenDisciplins;
    }

}
