package pl.kurs.zadania.zadanie18;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*

Napisać funkcję, której zadaniem jest odczytanie danych tabelarycznych z pliku tekstowego, a następnie zapisanie ich do nowego pliku w postaci kodu HTML.
      Przykład:
      Wejście:
      "Waga" "Wzrost" "BMI" "Nadwaga"
      70 1,8 21,6 "NIE"
      67 1,77 21,39 "NIE"
      85 1,7 29,41 "TAK"
      100 1,92 27,13 "TAK"
      Wynik:
      <html><body>
      <table>
      <tr><td>"Waga"</td><td>"Wzrost"</td><td>"BMI"</td><td>"Nadwaga"
      </td></tr>
      <tr><td>70</td><td>1,8</td><td>21,6</td><td>"NIE"
      </td></tr>
      <tr><td>67</td><td>1,77</td><td>21,39</td><td>"NIE"
      </td></tr>
      <tr><td>85</td><td>1,7</td><td>29,41</td><td>"TAK"
      </td></tr>
      <tr><td>100</td><td>1,92</td><td>27,13</td><td>"TAK"</td></tr>
      </table>
      </body></html>



 */
public class Zadanie18 {


    public static void main(String[] args) throws IOException {

        zapisDoHTML("wejscie");
    }

    public static void zapisDoHTML(String nazwapliku) throws IOException {

        BufferedReader fileReader = null;

        ArrayList<String> dane = new ArrayList<String>();

        String filePath = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie18/wejscie";

        String czytanaLinijka = "";

        String przyklad = "";

        String html = "";


        try {

            fileReader = new BufferedReader(new FileReader(filePath));

            while ((czytanaLinijka = fileReader.readLine()) != null) {

                dane.add(czytanaLinijka);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            fileReader.close();
        }

        //ArrayList <String> linijka = new ArrayList<String>();

        String beginHtml = "<html><body>\n" +
                "<table>\n";

        String endHtml = "</table>\n" +
                "</body></html>";

        html = beginHtml + "\n";

        for (int i = 0; i < dane.size(); i++) {
            StringTokenizer st = new StringTokenizer(dane.get(i));

            String[] words = dane.get(i).split("\\s");


            for (int j = 0; j < words.length; j++) {
                if (j == 0) {
                    przyklad = "<tr> <td>" + words[j] + "</td>";
                }
                else if (j< words.length-1) {

                    przyklad = przyklad + "<td>" + words[j] + "</td>";
                }
                    else
                        przyklad = przyklad + "<td>" + words[j] + "</td></tr>" +
                            "\n";

                }
                //tutaj dac przekazanie do html i wyzerowac przyklad

                html = html + przyklad;
                przyklad = "";
            }


                html = html + endHtml;


        //zapis do pliku

        //Zapis pliku wyjsciowego plikWy
        String filePath2 = "/home/pawel/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie18/wynik.html";
        BufferedWriter bw = null;
        try {

            File file = new File(filePath2);


            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);


                bw.write(html);


            System.out.println("File written Successfully");

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


    }

