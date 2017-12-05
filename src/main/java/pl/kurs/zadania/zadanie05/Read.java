package pl.kurs.zadania.zadanie05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read {

    public List<String> readNames() {
        Scanner odczyt = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj imie");
            String imie = odczyt.nextLine();
            list.add(imie);
        }
        return list;
    }
}
