package pl.kurs.zadania.zadanie05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Napisz program, który wypełni tablicę napisów imionami podanymi z klawiatury i wypisze:
 1. najdłuższe imię
 2. najkrótsze imię
 3* powtarzające się imiona wraz z ich krotnościami

 */
public class Zadanie5 {

    public static void main(String[] args) {


        String imie;
        Scanner odczyt = new Scanner(System.in);

        List<String> lista = new ArrayList();




        // wczytanie imion do tablicy
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj imie");
            imie = odczyt.nextLine();
            lista.add(imie);
        }


        // porównanie imion

        int index = 0;
        for (int i = 0; i < lista.size(); i++) {
            String im = lista.get(i);

            int min = im.length();


            if (min > im.length()) {
                min = im.length();
                index = i;
            }
        }

        System.out.println("najkrotsze " + lista.get(index));

        index = 0;
        for (int i = 0; i < lista.size(); i++) {
            String im = (String) lista.get(i);
            int max = im.length();


            if (max < im.length()) {
                max = im.length();
                index = i;
            }
            // i++
        }

        System.out.println("najdluzsze " + lista.get(index));

        int counter = 0;
        for (String im : lista){


            counter++;
        }



        System.out.println("najdluzsze " + lista.get(index));

        // powtarzajace sie imionaa


        int licznik = 0;

        for (int i = 0; i < (int) lista.size(); i++) {
            if (lista.get(i) == lista.get(i + 1)) {
                System.out.println(lista.get(i) + "powtarza sie");
                licznik++;
            }
            System.out.println("powtarza sie " + licznik + " razy");
        }

    }

}
