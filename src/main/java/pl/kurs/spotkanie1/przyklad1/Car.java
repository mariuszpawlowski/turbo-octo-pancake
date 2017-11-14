package pl.kurs.spotkanie1.przyklad1;

public class Car {

    private int iloscDrzwi;
    private int iloscKol;

    public Car(){

    }

    public Car(int iloscDrzwi, int iloscKol){
        System.out.println("Zawolany konstrultor");
        this.iloscDrzwi = iloscDrzwi;
        this.iloscKol = iloscKol;
    }

    public static void metoda(int iloscDrzwi){
        System.out.println("metoda bez instancji" + iloscDrzwi);

    }

    public void wypisz(){
        System.out.println("drzwi " + iloscDrzwi);
        System.out.println("kola " + iloscKol);
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }
}
