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





    public void gemSvømmerIFil(ArrayList<SvømmerInformationer> arrayList) {

        File file = new File("SvømmerDatabase");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
            oos.close();
            System.out.println("Data blev skrevet til fil");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void tilføjSvømmereTilKlubFraFil(ArrayList<SvømmerInformationer> klub) {


        try {
            File file = new File("SvømmerDatabase");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<SvømmerInformationer> svømmereFrafil = (ArrayList<SvømmerInformationer>) ois.readObject();


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


    // Iterrator til at gennemgå Arraylist.

    /*
     Iterator<SvømmerInformationer> iter = svømmereFrafil.iterator();
        while(iter.hasNext()) {

            SvømmerInformationer s = iter.next();
            klub.getAlleMedlemerIKlubben().add(svømmerDerSkalTilføjes);

            );
     */



}
