package pl.kurs.lambda;

import pl.kurs.zadania.zadanie19.domain.User;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Integer> liczby = new ArrayList<>();
        liczby.add(1);

        // liczby wieksze od 4

        List<Integer> wynik = new ArrayList<>();

        for (Integer i : liczby) {
            if (i > 4) {
                wynik.add(i);
            }
        }

        Optional<Integer> wynikStream = liczby.stream()
                //.filter(x -> metoda(x))
                .sorted()
                .findFirst();

        
        System.out.println(wynikStream);


    }

    private static boolean metoda(Integer x) {

        return false;

    }



}
