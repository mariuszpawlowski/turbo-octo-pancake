package pl.kurs.zadania.zadanie14;



import static java.lang.Integer.parseInt;

public class Czas {

    int godziny;
    int minuty;
    public Czas(){

    }
    Czas czas = new Czas();

    public Czas(int godziny, int minuty) {


        this.godziny = godziny;
        this.minuty = minuty;

        if (minuty > 59){

            int resztaGodz = minuty/60;
            godziny = resztaGodz;

            int resztaMin = minuty%60;
            minuty = resztaMin;
        }
        System.out.println(godziny+ " h "+minuty+" min");


    }


    public Czas(String lancuch) {

        int koniecgodz = lancuch.indexOf("h");

        String sgodziny = lancuch.substring(0, koniecgodz-1);

        int koniecmin = lancuch.indexOf("m");

        String sminuty = lancuch.substring(koniecgodz+2, koniecmin-1);

        this.minuty = parseInt(sminuty);
        this.godziny = parseInt(sgodziny);


        }


    @Override
    public String toString() {

        String lancuch = godziny+ " h "+minuty+" min";

        return lancuch;

    }

    Czas dodaj (Czas t){

Czas tP = new Czas();




        return t;
    }
    /*

    Czas dodaj(Czas t) której wynikiem jest nowy obiekt klasy Czas będący sumą
bieżącego i podanego jako parametr obiektu

     */

}




