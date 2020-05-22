package Machine;

import java.util.ArrayList;

public class Klubben {


    // Holder alle vores svømmere.

    ArrayList<SvømmerInformationer> alleMedlemerIKlubben = new ArrayList<>();


    public ArrayList<SvømmerInformationer> getAlleMedlemerIKlubben() {
        return alleMedlemerIKlubben;
    }

/*
  public SvømmerInformationer søgEfterSvømmer(String navnPåSvømmer) {




        for (int i = 0; i < alleMedlemerIKlubben.size(); i++) {

            SvømmerInformationer svømmer = alleMedlemerIKlubben.get(i);

            if (svømmer.getNavn() == navnPåSvømmer) {

                return svømmer;
            } else {
                System.out.println("Kunne ikke finde svømmer");
            }


        }

        return null;

        }

 */



    @Override
    public String toString() {
        return "Alle medlemmer i Kluben: " + alleMedlemerIKlubben +
                "\n";
    }
}
