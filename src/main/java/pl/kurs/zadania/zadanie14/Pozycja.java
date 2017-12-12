package pl.kurs.zadania.zadanie14;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {

        this.ileSztuk = ileSztuk;
        this.nazwaTowaru = nazwaTowaru;
        this.cena = cena;
    }

    public Pozycja() {

    }

    public int getIleSztuk() {

        return ileSztuk;
    }

    public String getNazwaTowaru() {

        return nazwaTowaru;
    }

    public double getCena() {

        return cena;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obliczWartosc(double cena, int iloscSztuk) {
        //zwracaj�c� warto�� pozycji zam�wienia,

        double wartosc = cena * iloscSztuk;

        return wartosc;

    }    //This static method cannot hide the instance method from Object  - remove static
    //Jak ustawi� graniczn� ilosc znak�w dla poszczeg�lnych zmiennych


    /*
    http://www.samouczekprogramisty.pl/formatter-formatowanie-lancuchow-znakow/
     */
    @Override
    public String toString() {

        String lancuch = nazwaTowaru + "       " + cena + " zl       " + ileSztuk + " szt.      " + obliczWartosc(getCena(), getIleSztuk()) + "zl";

        return lancuch;

    }

}
