package pl.kurs.zadania.zadanie14;

import java.util.Arrays;

public class Zamowienie {

	Pozycja pozycje[] = new Pozycja[10];
	

	int ileDodanych; // liczba pozycji w zam�wieniu
	int maksRozmiar; // maksymalna liczba pozycji w zam�wieniu

	// konstruktor bezparametrowy � maksRozmiar ustalany na warto�� 10

	public Zamowienie() {
		maksRozmiar = 10;

	}

	// konstruktor z parametrem okre�laj�cym maksymaln� liczb� pozycji w zam�wieniu

	public Zamowienie(int maksRozmiar) {
		this.maksRozmiar = maksRozmiar;
	}

	// dodaje podan� pozycj� do zam�wienia ??????????

	void dodajPozycje(Pozycja p) {
		for(int i=0; i<10; i++) {
			pozycje[i] = p;
		}
		

	}

	
	public double obliczWartosc(double cena, int iloscSztuk) {
		

		double wartosc = cena * iloscSztuk;

		return wartosc;

	}

	public String toString() {
		String lancuch = "";
		for (int i = 0; i < pozycje.length; i++) {
			lancuch = pozycje.toString();
		}
		
	
		return lancuch;
	
		
		}
		
		void wypisz(Pozycja p) {
			for (int i = 0; i < pozycje.length; i++) {
				System.out.println(pozycje[i]);
			}
}

}