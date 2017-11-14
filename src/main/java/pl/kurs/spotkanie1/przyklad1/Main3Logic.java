package pl.kurs.spotkanie1.przyklad1;

import java.util.ArrayList;
import java.util.List;

public class Main3Logic {

    int parametr1;
    int parametr2;
    int parametr3;

    public Main3Logic(int parametr1, int parametr2, int parametr3) {
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
        this.parametr3 = parametr3;
    }

    public DwaParametry zwroc2Parametry(){
        // zwroc parametr 1 i 2
        DwaParametry dwaParametry = new DwaParametry();
        dwaParametry.setPar1(parametr1);
        dwaParametry.setPar2(parametr2);

        return dwaParametry;

    }

    public List<Integer> zwroc2ParametryJakoListe(){
        // zwroc parametr 1 i 2
        List<Integer> lista = new ArrayList<>();
        lista.add(parametr1);
        lista.add(parametr2);

        return lista;

    }

}
