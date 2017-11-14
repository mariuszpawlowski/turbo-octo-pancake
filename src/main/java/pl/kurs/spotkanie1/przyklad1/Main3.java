package pl.kurs.spotkanie1.przyklad1;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Main3Logic main3Logic = new Main3Logic(1,2,3);

        DwaParametry dwaParametry = main3Logic.zwroc2Parametry();

        List<Integer> lista = main3Logic.zwroc2ParametryJakoListe();

        System.out.println(lista);

    }
}
