package pl.kurs.zadania.zadanie14;

public class Pozycja {
	String nazwaTowaru;
	int ileSztuk;
	double cena;

	public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {

		this.ileSztuk = ileSztuk;
		this.nazwaTowaru = nazwaTowaru;
		this.cena = cena;
	}
//czy gettery i settey s¹ tu w ogóle potrzebne
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
	
	public static double obliczWartosc(double cena, int iloscSztuk) {
		//zwracaj¹c¹ wartoœæ pozycji zamówienia,
		
		double wartosc = cena * iloscSztuk;
		
		return wartosc;
		
	}	//This static method cannot hide the instance method from Object  - remove static
	    //Jak ustawiæ graniczn¹ ilosc znaków dla poszczególnych zmiennych
	
	
	public String toString() {
		String lancuch = getNazwaTowaru()+"       "+getCena()+" z³       "+getIleSztuk()+" szt.      "+obliczWartosc(getCena(), getIleSztuk())+"z³";
		return lancuch;
	
	}
	
	
	
	
}
