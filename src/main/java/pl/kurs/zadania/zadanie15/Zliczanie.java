package pl.kurs.zadania.zadanie15;
/*
Napisać metode liczZnakiSlowa, która zlicza:

• liczbę znaków w pliku,
• liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza),
• liczbę słów w pliku.

Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymie-
nionych podpunktów.

 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zliczanie {


    void liczZnakiiSlowa() throws IOException {

        String filePath = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie15/plik.txt";
        int number = 0;
        String odczytanyPlik = "";
        String czytanaLinijka= "";
        BufferedReader fileReader = null;
        int totalLength = 0;
        int enter = -1;
        String nowyWiersz = " ";

            try {
                fileReader = new BufferedReader(new FileReader(filePath));
                while ((czytanaLinijka = fileReader.readLine()) != null) {

                    odczytanyPlik= odczytanyPlik+ nowyWiersz + czytanaLinijka;



                }


            } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
            }

        StringTokenizer st = new StringTokenizer(odczytanyPlik);


        int liczbaTokenow = st.countTokens();


        System.out.println("Liczba wyrazow: " + liczbaTokenow);

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            totalLength = totalLength + token.length();
        }
        System.out.println("Liczba znakow: "+totalLength);

        int dlugoscStringa = odczytanyPlik.length();
        int whiteSpace = dlugoscStringa - totalLength + enter;

        System.out.println("Liczba bialych znakow "+ whiteSpace);

       //tabulator jako 5 spacji
    }


}
