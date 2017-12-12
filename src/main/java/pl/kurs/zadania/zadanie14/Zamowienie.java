package pl.kurs.zadania.zadanie14;

public class Zamowienie {

	private Pozycja pozycje[];

	int ileDodanych; // liczba pozycji w zam�wieniu
	int maksRozmiar; // maksymalna liczba pozycji w zam�wieniu

	// konstruktor bezparametrowy � maksRozmiar ustalany na warto�� 10
	public Zamowienie(){
		maksRozmiar = 10;
		pozycje = new Pozycja[maksRozmiar];
	}


	// konstruktor z parametrem okre�laj�cym maksymaln� liczb� pozycji w zam�wieniu

	public Zamowienie(int maksRozmiar) {
		this.maksRozmiar = maksRozmiar;
		pozycje = new Pozycja[maksRozmiar];
	}

	// dodaje podan� pozycj� do zam�wienia ??????????

	void dodajPozycje(Pozycja p) {
		if (ileDodanych < maksRozmiar){
			pozycje[ileDodanych] = p;
			ileDodanych++;
		} else {
			System.out.println("Nie mozna dodac: " + p);
		}
	}

	public double obliczWartosc(double cena, int iloscSztuk) {
		

		double wartosc = cena * iloscSztuk;

		return wartosc;

	}

	@Override
	public String toString() {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < ileDodanych; i++){
			stringBuffer.append(pozycje[i].toString());
			stringBuffer.append("\n");
		}

		return stringBuffer.toString();
	}
}