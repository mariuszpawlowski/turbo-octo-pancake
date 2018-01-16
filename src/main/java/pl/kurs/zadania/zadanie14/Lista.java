package pl.kurs.zadania.zadanie14;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    public int element;

    int i = 0;
    private int liczby [];
    private int pojemnosc;
    private int rozmiar;

    public Lista (int pojemnosc){

        this.pojemnosc = pojemnosc;

        int liczby[] = new int [pojemnosc];

            }

           void dodajElement (int element) {

                this.element = element;


                liczby[i] = element;
                i++;


           }

           /*
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
*/

}
