package pl.kurs.zadania.zadanie05;

import java.util.Collections;
import java.util.List;

public class ShowStatistics {

    public void findDuplicates(List<String> lista) {
        Collections.sort(lista);
        System.out.println(lista);
        int licznik = 0;
        String rep = "";

        for (int i = 0; i < 4; i++) {

            if (lista.get(i).equals(lista.get(i + 1))) {
                rep = lista.get(i);
                licznik++;
            }
        }
        if (licznik == 0) {
            System.out.println("Zadne imie sie nie powtarza");
        } else{
            System.out.println("imi� " + rep + " powtarza sie " + licznik + "-krotnie");
        }

    }

    public void findLongesttName(List<String> lista) {
        String im3 = lista.get(0);
        int max = im3.length();
        int index = 0;

        for (int i = 1; i < 5; i++) {
            String im4 = lista.get(i);
            if (max <= im4.length()) {
                max = im4.length();
                index = i;
            }

        }
        System.out.println("najdluzsze imie to: " + lista.get(index));
        System.out.println("ilosc liter " + max + " index wynosi " + index);

    }

    public void findShortestName(List<String> lista) {

        int i = 0;
        int index = 0;
        String im1 = lista.get(0);
        int min = im1.length();

        for (i = 1; i < 5; i++) {
            String im2 = lista.get(i);
            if (min >= im2.length()) {
                min = im2.length();
                index = i;
            }

        }
        System.out.println("najkrotsze imie to: " + lista.get(index));
        System.out.println("ilosc liter " + min + " index wynosi " + index);

    }
}
