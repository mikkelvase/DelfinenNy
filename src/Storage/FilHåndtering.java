package Storage;

import Machine.SvømmerInformationer;
import org.w3c.dom.ls.LSOutput;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FilHåndtering implements  Serializable {





    // Når programmet lukker tager vi alle opbjekter fra vores Arraylist i klub og gemmer i filen.

    public void gemSvømmerIFil(ArrayList<SvømmerInformationer> arrayList) {

        // Vi definere først en fil og hvilket navn filen har.
        File file = new File("SvømmerDatabase");

        try {
            // vi laver en outputStream der får vores fil som parameter, på den måde ved den hvor data skal gemmes.
            FileOutputStream fos = new FileOutputStream(file);
            // Med hjælp fra outputStream definere vi hvilken slags Data vi gemmer i  filen nemlig Objekter.
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Vi gemmer / skriver objekter til vores fil med en predefineret Arraylist.
            oos.writeObject(arrayList);
            // Filen Lukkes.
            oos.close();
            System.out.println("Data blev skrevet til fil");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Når programmet starter op tager vi alle opbjekter fra vores fil svømmerDatabase og gemmer i vores Arraylist Klub.

    public void tilføjSvømmereTilKlubFraFil(ArrayList<SvømmerInformationer> klub) {


        try {
            // Vi definere først en fil og hvilket navn filen har.
            File file = new File("SvømmerDatabase");
            // vi laver en inputStream der får vores fil som parameter, på den måde ved den hvor der skal trækkes data fra.
            FileInputStream fis = new FileInputStream(file);
            // Med hjælp fra fileInput definere vi hvilken slags Data vi hiver ud fra filen nemlig Objekter.
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Vi laver et midlertidigt Arraylist som vi læser objekter fra filen ind i.
            ArrayList<SvømmerInformationer> svømmereFrafil = (ArrayList<SvømmerInformationer>) ois.readObject();


            // Med hjælp fra et forLoop gennemgår vi det midlertidige arraylist og tilføjer svømmerne en efter en til Klubben.
            for (int i = 0; i < svømmereFrafil.size(); ++i) {

                SvømmerInformationer svømmerDerSkalTilføjes = svømmereFrafil.get(i);
                klub.add(svømmerDerSkalTilføjes);


            }
            System.out.println("Database er up to date...");
            ois.close();

        } catch (Exception e) {

            System.out.println("Ingen data at indlæse");
        }



    }




}
