package pl.kurs.zadania.zadanie14;

public class Zamowienie {

	private Pozycja pozycje[];

	int ileDodanych=0; // liczba pozycji w zamï¿½wieniu
	int maksRozmiar; // maksymalna liczba pozycji w zamï¿½wieniu

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
		if (ileDodanych < maksRozmiar){
			pozycje[ileDodanych] = p;
			ileDodanych++;	
			
		} else {
			System.out.println("Nie mozna dodac: " + p);
		}
		for (int i=0; i<ileDodanych; i++) {
			if (p.getNazwaTowaru().equals(pozycje[i].getNazwaTowaru())) {
				System.out.println("dublowanie");
				
			}
			
		}
	}
	

	
	void usunPozycje(int indeks) {
	
				
		for (int i=indeks; i<ileDodanych; i++) {
						
		pozycje[i] = pozycje[i+1];
		
		}
		ileDodanych = ileDodanych-1;
	}
	
	void edytujPozycjeAdmin(int indeks) {
		System.out.println("Edytujesz pozycjê: " + pozycje[indeks]);
		
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
		
		System.out.println("Razem: "+suma+ " z³");
	}
}
