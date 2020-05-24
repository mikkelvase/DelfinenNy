package UI;

import Machine.SvømmerInformationer;

import java.util.Scanner;

public class UserInterface {


    // Printer tekst til skærmen.

    public void printTekst(String text) {
        System.out.println(text);
    }



    Scanner userInput = new Scanner(System.in);



    public SvømmerInformationer opretEnNySvømmer() {

        // Vi opretter en tom Svømmer uden nogen constructor. Så vi kan sætte via get og settere i Svømmerinformationer.

        SvømmerInformationer nySvømmer = new SvømmerInformationer();


        // Prompts og input fra brugeren anvendes til at "bygge" en svømmer.

        printTekst("Indtast venligst navn på medlemmet: ");
        nySvømmer.setNavn(userInput.nextLine());


        printTekst("Indtast venligst adresse: ");
        nySvømmer.setAdresse(userInput.nextLine());


        printTekst("Angiv fødselsår fødselsdate i følgende format: ÅÅÅÅ-MM-DD");
        String date = userInput.nextLine();
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
    public int fåBrugerValgSomInt() {

        Scanner s = new Scanner(System.in);

        int brugervalg = s.nextInt();

        return brugervalg;
    }

    // Retunerer en String værdi som brugeren vælger via Scanenr input
    public String fåBrugerValgSomStringt() {

        Scanner s = new Scanner(System.in);

        String brugervalg = s.nextLine();

        return brugervalg;
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






    // Gode gamle sager


    /*
    public String[] valgteDiscipliner(SvømmerInformationer svømmer) {


        String[] valgte =  svømmer.getDisciplin();

        int arrayValg = userInput.nextInt();

        while (userInput.hasNextInt()) {


        }

    }


     int valgteSvømmeDiscipliner = userInput.nextInt();


            // Opgave der skal løses her: Mulighed for at tilføje flere en end disciplin af gangen.

            if (valgteSvømmeDiscipliner == 1) {
                nySvømmer.setDisciplin("Crawl");
                printTekst("Tilføjede Crawl til svømmeren: " + nySvømmer.getNavn());
            } else if (valgteSvømmeDiscipliner == 2) {
                nySvømmer.setDisciplin("Bryst");
                printTekst("Tilføjede Bryst til svømmeren: " + nySvømmer.getNavn());
            } else if (valgteSvømmeDiscipliner == 3){
                nySvømmer.setDisciplin("Ryg Crawl");
                printTekst("Tilføjede Ryg Crawl til svømmeren: " + nySvømmer.getNavn());

                // printTekst("Noget gik galt...");
            } else if (valgteSvømmeDiscipliner == 4) {

                nySvømmer.setDisciplin("Butterfly");
                printTekst("Tilføjede Butterfly til svømmeren: " + nySvømmer.getNavn());

            }

     */
}
