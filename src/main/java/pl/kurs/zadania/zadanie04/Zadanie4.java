package pl.kurs.zadania.zadanie01;

import java.util.ArrayList;
import java.util.List;

/*
Napisz program, który dla zadanego N policzy ciąg Fibonacciego z ostatnim elementem mniejszym lub równym N
Np dla N = 12, wynikiem będzie: 1,1,2,3,5,8
 */
public class Zadanie4 {

    public static void main(String[] args) {

        int n = 12;

        ArrayList lista = new ArrayList();

        lista.add(1);
        lista.add(1);

        int m = 0;

        for (int i = 1; (int) lista.get(i) < n; i++) {

            m = (int) lista.get(i) + (int) lista.get(i - 1);

            if (m > 12){
                break;
            }
            lista.add(m);

        }
        System.out.println(lista);

    }

}
