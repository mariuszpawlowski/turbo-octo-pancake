package pl.kurs.zadania.zadanie14;


public class Zadanie14 {
	
	public static void main(String[] args) {
		
		
	
		
		
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1); 
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		System.out.println(p2);
		Pozycja p3 = new Pozycja("Nutella", 1, 7);
		System.out.println(p3);

		new Zamowienie();

		Zamowienie z = new Zamowienie(10); //co to jest 20?
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		z.dodajPozycje(p3);
		System.out.println("Zam�wienie: ");
		System.out.println(z);
		z.podsumowanie();
		
		//Jak wypisa� tabel� pozycje z tej klasy
		
		// z.usunPozycje(2); 
		
		System.out.println(z);
		z.podsumowanie();
		
		z.edytujPozycjeAdmin(1);
		System.out.println(z);
		
		//z.podsumowanie();
		//z.dodajPozycje(p3);
		
		System.out.println(z);
		z.podsumowanie();
	}
		

}

	
