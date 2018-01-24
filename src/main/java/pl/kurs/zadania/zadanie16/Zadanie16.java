package pl.kurs.zadania.zadanie16;

/*

Napisać funkcję:
     public static void szukaj(String nazwaPlikWe, String nazwaPlikWy,
                               String slowo)
której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo.
Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr wiersza
(z pierwszego pliku). Nazwa pierwszego pliku zapamiętana jest w parametrze nazwaPlikWe,
nazwa pliku wynikowego podana jest w parametrze nazwaPlikWy, natomiast szukane słowo w parametrze slowo.

Przykład - plik wejściowy:
     Ala ma jutro egzamin z biologii.
     Jan myje auto.
     Eh, jutro kolejny egzamin.
     Nie lubie polityki.
Jeżeli szukanym słowem byłoby ”egzamin”, to plik wynikowy powinien wyglądać następująco:
     1: Ala ma jutro egzamin z biologii.
     3: Eh, jutro kolejny egzamin.

 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zadanie16 {

    public static void main(String[] args) throws IOException {

        szukaj("plikWe", "plikWe","egzamin");
    }

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {


        BufferedReader fileReader = null;

        String czytanaLinijka = "";
        String odczytanyPlik = "";
        String nowyWiersz = "";
        String filePath = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie16/plikWe";

        ArrayList <String> words = new ArrayList<String>();

        try{

            fileReader = new BufferedReader(new FileReader(filePath));
            while ((czytanaLinijka = fileReader.readLine()) != null) {

                words.add(czytanaLinijka);

        }


    }finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }


        //Liczenie
        int index = 0;
    String mycontent = "";
        ArrayList <String> wynik = new ArrayList<String>();

        for (int i=0; i<words.size(); i++){

            if (words.get(i).toString().contains(slowo) == true){
                index = i+1;
                wynik.add(index+":"+" "+words.get(i));

            }
        }

        //Zapis pliku wyjsciowego plikWy
        String filePath2 = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie16/plikWy";
        BufferedWriter bw = null;
        try {

            File file = new File(filePath2);


            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (int i=0; i<wynik.size(); i++){
                bw.write(wynik.get(i).toString()+"\n");
            }

            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }


}


