package pl.kurs.zadania.zadanie14;

public class Zamowienie {

	Pozycja pozycje[] = new Pozycja[10];

	int ileDodanych; // liczba pozycji w zam�wieniu
	int maksRozmiar; // maksymalna liczba pozycji w zam�wieniu

	// konstruktor bezparametrowy � maksRozmiar ustalany na warto�� 10
	/*
	 * public Zamowienie() { maksRozmiar=10; }
	 */

	// konstruktor z parametrem okre�laj�cym maksymaln� liczb� pozycji w zam�wieniu

	public Zamowienie(int maksRozmiar) {
		this.maksRozmiar = maksRozmiar;
	}

	// dodaje podan� pozycj� do zam�wienia ??????????

	void dodajPozycje(Pozycja p) {
		int i = 0;
		p = pozycje[i++];

	}

	// drugi raz taka sama metoda??
	public static double obliczWartosc(double cena, int iloscSztuk) {
		// zwracaj�c� warto�� pozycji zam�wienia,

		double wartosc = cena * iloscSztuk;

		return wartosc;

	}
	// jak wypisa� tablic� podzielon� na poszczeg�lne elementy wiersza?
	// polecenie: zwraca �a�cuch zawieraj�cy spis pozycji zam�wienia oraz ��czn�
	// warto�� zam�wienia

	public String toString() {
		String lancuch = .NazwaTowaru()+"       "+getCena()+" z�       "+getIleSztuk()+" szt.      "+obliczWartosc(getCena(), getIleSztuk())+"z�";
		return lancuch;
	
	}
}