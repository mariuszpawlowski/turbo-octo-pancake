package pl.kurs.zadania.zadanie17;

import java.io.*;
import java.util.ArrayList;

/*
Napisać funkcję public static void sumujIZapisz(String nazwaPliku) , któ- ra odczytuje plik o podanej nazwie
zawierający liczby całkowite(po jednej w wierszu). Funkcja ma za zadanie odczytać i zsumować wszystkie liczby z pliku,
 a następnie dopisać na końcu pliku wyznaczoną sumę powiększoną o 1. Ponow- ne uruchomienia funkcji będą
 skutkowały dopisywaniem kolejnych wierszy.

Jeżeli plik nie istnieje to ma zostać utworzony – suma dla pustego pliku wyniesie 0,
a więc należy dopisać wiersz zawierający 1.
 */
public class Zadanie17 {

    public static void main(String[] args) throws IOException {

            sumujIZapisz("sumowanie.txt");

    }


    public static void sumujIZapisz(String plik) throws IOException {

        BufferedReader fileReader = null;
        String filePath = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie17/"+plik;
        String czytanaLinijka = "";
        BufferedWriter fileWriter = null;
        BufferedWriter bw = null;
        int suma = 0;
        int i = 0;
        int index = 0;
        ArrayList<String> numbers = new ArrayList<String>();
        try {
            fileReader = new BufferedReader(new FileReader(filePath));


            while ((czytanaLinijka = fileReader.readLine()) != null) {

                numbers.add(czytanaLinijka);
            }

            for ( i=0; i<numbers.size(); i++){

                suma = suma + Integer.valueOf(numbers.get(i));

            }
            numbers.add(Integer.toString(suma +1));
            ////jakas chujnia z zapisem ??




        } catch (FileNotFoundException e) {
            System.out.println("nie ma pliku - tworze nowy");

                if (fileReader != null) {
                    fileReader.close();
                }

            try {

                File file = new File(filePath);

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);

                bw.write("1"+"\n");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            finally
            {
                try{
                    if(bw!=null)
                        bw.close();
                }catch(Exception ex){
                    System.out.println("Error in closing the BufferedWriter"+ex);
                }
            }
        }
        BufferedWriter bw1 = null;
        try {

            File file = new File(filePath);

            FileWriter fw = new FileWriter(file);
            bw1 = new BufferedWriter(fw);

            for (i=0; i<numbers.size(); i++){
                bw1.write(numbers.get(i).toString()+"\n");
            }
         // bw1.write(String.valueOf(numbers));

            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw1!=null)
                    bw1.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }

    }
}
