package pl.kurs.zadania.zadanie14;

public class Pozycja implements Serializabe {
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

    }    
    
  


    /*
    http://www.samouczekprogramisty.pl/formatter-formatowanie-lancuchow-znakow/
     */
    @Override
    public String toString() {
      String lancuch = "";
        if (ileSztuk<5) {
            lancuch = nazwaTowaru + "       " + cena + " zl       " + ileSztuk + " szt.      " + obliczWartosc(getCena(), getIleSztuk()) + "zl";
        }
        else {
            lancuch = nazwaTowaru + "       " + cena + " zl       " + ileSztuk + " szt.      " + obliczWartoscZRabatem(getCena(), getIleSztuk()) + "zl";
            double rabat = obliczWartosc(getCena(), getIleSztuk()) - obliczWartoscZRabatem(getCena(), getIleSztuk());
            System.out.println("naliczono rabat w wysokosci: " + rabat + "zł");
        }
        return lancuch;

    }


    double obliczWartoscZRabatem(double cena, int ileSztuk){
        double wartoscZRabatem=0;
        // 5–10 szt. rabat 5%

        if (ileSztuk>=5 && ileSztuk<=10)
        {
           double wartoscZRabatem1 =  0.95* obliczWartosc(cena,ileSztuk );
           wartoscZRabatem = wartoscZRabatem1;
        }
      else {

            if (ileSztuk> 10 && ileSztuk <= 20) {
                double wartoscZRabatem2 = 0.90 * obliczWartosc(cena, ileSztuk);
                wartoscZRabatem = wartoscZRabatem2;
            } else {


                if (ileSztuk > 20) {
                    double wartoscZRabatem3 = 0.85 * obliczWartosc(cena, ileSztuk);
                    wartoscZRabatem = wartoscZRabatem3;
                }

            }
        }

        return wartoscZRabatem;
    }
}
