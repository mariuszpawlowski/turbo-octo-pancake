package pl.kurs.spotkanie1.przyklad1;


import pl.kurs.spotkanie1.przyklad2.Utils;

public class Main2 {

    public static void main(String[] args) {
        String input = "aaaaaaaaaaaaaaaaaaaa";

        String output = Utils.limitString(input);

        Utils utils = new Utils();
        String output2 = utils.limitString2(input);

        System.out.println(output);
        System.out.println(output2);
    }
}
