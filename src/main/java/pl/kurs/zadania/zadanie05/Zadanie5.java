package pl.kurs.zadania.zadanie05;

import java.util.List;

public class Zadanie5 {

    public static void main(String[] args) {
        Zadanie5 zadanie5 = new Zadanie5();
        zadanie5.writeNamesStatistics();
    }

    private void writeNamesStatistics() {

        Read read = new Read();
        ShowStatistics showStatistics = new ShowStatistics();

        // wczytywanie imion
        List<String> lista = read.readNames();

        showStatistics.findShortestName(lista);

        showStatistics.findLongesttName(lista);

        // powtarzanie
        showStatistics.findDuplicates(lista);

    }

}