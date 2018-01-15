package pl.kurs.zadania.zadanie14;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    private int liczby [];
    private int pojemnosc;
    private int rozmiar;


    public Lista (int pojemnosc){

        this. pojemnosc = pojemnosc;

        //Lista liczby [] = new Lista[pojemnosc];

            }

           void dodajElement (int element){

                try {
                    liczby.add
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Tablica pełna");

                }

            }

            int znajdz (int szukana){

        boolean wynik = false;
        int zmienna= 0;
        for (int i=0; i<liczby.length; i++){
            if (szukana == liczby[i]) {
                wynik = true;
                zmienna = i;
                return i;
            }
            else
                continue;

        } if (wynik == false)
            zmienna = -1;

        return -1;
            }


}
