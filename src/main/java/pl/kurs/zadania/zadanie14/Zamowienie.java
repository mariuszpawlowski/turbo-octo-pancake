package pl.kurs.zadania.zadanie14;

public class Zamowienie {

	private Pozycja pozycje[];

	static int ileDodanych=0; // liczba pozycji w zamï¿½wieniu
	int maksRozmiar; // maksymalna liczba pozycji w zamï¿½wieniu
	Pozycja temp = new Pozycja();
	// konstruktor bezparametrowy ï¿½ maksRozmiar ustalany na wartoï¿½ï¿½ 10
	public Zamowienie(){
		maksRozmiar = 10;
		pozycje = new Pozycja[maksRozmiar];

	}


	// konstruktor z parametrem okreï¿½lajï¿½cym maksymalnï¿½ liczbï¿½ pozycji w zamï¿½wieniu

	public Zamowienie(int maksRozmiar) {
		this.maksRozmiar = maksRozmiar;
		pozycje = new Pozycja[maksRozmiar];

	}

	// dodaje podanï¿½ pozycjï¿½ do zamï¿½wienia ??????????



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

	void dodajPozycje(Pozycja p) {
		//tutaj juz obiekt p jest podwojony

		if (ileDodanych < maksRozmiar) {



			pozycje[ileDodanych] = p;
			ileDodanych++;


		} else {
			System.out.println("Nie mozna dodac: " + p);
		}
		//System.out.println("Nazwa dodawanego produktu: "+p.getNazwaTowaru());
		//System.out.println("Nazwa sprawdzanego produktu: "+pozycje[ileDodanych-2].getNazwaTowaru());
		if (ileDodanych > 1) {
			boolean sprawdzenie = p.getNazwaTowaru().equals(pozycje[ileDodanych - 2].getNazwaTowaru());

			if (sprawdzenie == true) {
				//int wynik = p.getIleSztuk() + pozycje[ileDodanych-1].getIleSztuk();
				int wynik = 1 + pozycje[ileDodanych-1].getIleSztuk();
				pozycje[ileDodanych - 2].setIleSztuk(wynik);
				ileDodanych = ileDodanych - 1;
				System.out.println("Dodano powtarzajaca sie pozycje: "+p.getNazwaTowaru());

				//obiekt p jako parametr metody dodaj ma tyle sztuk ile w tabeli, a nie tyle co jako p1,p2...
			}
		}
		System.out.println("Dodano pozycję: "+p.getNazwaTowaru()+" w ilosci: "+p.getIleSztuk());
	}
	
	void usunPozycje(int indeks) {
	
				
		for (int i=indeks; i<ileDodanych; i++) {
						
		pozycje[i] = pozycje[i+1];
		
		}
		ileDodanych = ileDodanych-1;
	}
	
	void edytujPozycjeAdmin(int indeks) {
		System.out.println("Edytujesz pozycje: " + pozycje[indeks]);
		
		pozycje[indeks].setCena(10.0);
		pozycje[indeks].setNazwaTowaru("Cukier brazowy");
		pozycje[indeks].setIleSztuk(5);
	}
	
	
	void podsumowanie() {
		double suma=0;
		double cenajedn;
		int iloscjedn;
		
		for (int i=0; i<ileDodanych; i++) {
			cenajedn = pozycje[i].getCena();
			iloscjedn = pozycje[i].getIleSztuk();
			double sumajedn = cenajedn *iloscjedn;
			suma = suma +sumajedn;
		}
		
		System.out.println("Razem: "+suma+ " zl");
	}
}
