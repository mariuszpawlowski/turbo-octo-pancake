package pl.kurs.zadania.zadanie14;

public class Zamowienie {

	Pozycja pozycje[] = new Pozycja[10];

	int ileDodanych; // liczba pozycji w zamówieniu
	int maksRozmiar; // maksymalna liczba pozycji w zamówieniu

	// konstruktor bezparametrowy – maksRozmiar ustalany na wartoœæ 10
	/*
	 * public Zamowienie() { maksRozmiar=10; }
	 */

	// konstruktor z parametrem okreœlaj¹cym maksymaln¹ liczbê pozycji w zamówieniu

	public Zamowienie(int maksRozmiar) {
		this.maksRozmiar = maksRozmiar;
	}

	// dodaje podan¹ pozycjê do zamówienia ??????????

	void dodajPozycje(Pozycja p) {
		int i = 0;
		p = pozycje[i++];

	}

	// drugi raz taka sama metoda??
	public static double obliczWartosc(double cena, int iloscSztuk) {
		// zwracaj¹c¹ wartoœæ pozycji zamówienia,

		double wartosc = cena * iloscSztuk;

		return wartosc;

	}
	// jak wypisaæ tablicê podzielon¹ na poszczególne elementy wiersza?
	// polecenie: zwraca ³añcuch zawieraj¹cy spis pozycji zamówienia oraz ³¹czn¹
	// wartoœæ zamówienia

	public String toString() {
		String lancuch = .NazwaTowaru()+"       "+getCena()+" z³       "+getIleSztuk()+" szt.      "+obliczWartosc(getCena(), getIleSztuk())+"z³";
		return lancuch;
	
	}
}