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
        int min = 0;
        for (int i = 0; i < 2; i++) {
            String im1 = lista.get(i);
            String im2 = lista.get(i + 1);

            if (im1.length() < im2.length()) {
                min = im1.length();
                index = i;
            } else {

                min = im2.length();
                index = i;
            }

        }
        System.out.println("najkrotsze imie to: " + lista.get(index));
        System.out.println("ilosc liter " + min + " index wynosi " + index); // index zawsze wynosi 1 i nie sprawdza
        // prawidłowo dla i=0;

        /*
         *
         * // powtarzajace sie imiona
         *
         * int licznik = 0;
         *
         * for (int i = 0; i < (int) lista.size(); i++) { if (lista.get(i) ==
         * lista.get(i + 1)) { System.out.println(lista.get(i) + "powtarza sie");
         * licznik++; } System.out.println("powtarza sie " + licznik + " razy"); }
         */
    }

}
