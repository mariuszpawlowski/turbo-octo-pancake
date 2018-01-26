package pl.kurs.zadania.zadanie14;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    int element=0;

    int i = 0;
    private int liczby [];
    private int pojemnosc;
    private int rozmiar;



    public Lista (int pojemnosc){

        this.pojemnosc = pojemnosc;
        this.liczby = new int[pojemnosc];

        int liczby[] = new int [pojemnosc];

            }

           void dodajElement (int element) {
                rozmiar++;


                liczby[i] = element;
                i++;


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


            void pisz(){

                System.out.println("Rozmiar listy to: " +liczby.length+" elementów");
                System.out.println("Pojemność listy to: "+pojemnosc);

                for (int i=0; i<liczby.length; i++){
                    System.out.println(liczby[i]);
                }

            }

void usunPierwszy (int parametr){

        int b =0;
        for (int i=0; i<liczby.length;i++){

            if (parametr == liczby[i]){
                for(int j=0;j<rozmiar;j++)
                {
                    liczby[i+j]=liczby[i+(j+1)];
                }
                break;
            }

        }
        rozmiar--;
}


}
