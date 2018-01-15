package pl.kurs.zadania.zadanie14;


public class Zadanie14 {
	
	public static void main(String[] args) {

		System.out.println("Pozycje:");
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1); 
		Pozycja p2 = new Pozycja("Cukier", 1, 4);
		System.out.println(p2);
		Pozycja p3 = new Pozycja("Nutella", 1, 7);
		System.out.println(p3);

		new Zamowienie();

		Zamowienie z = new Zamowienie(10);

		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		System.out.println("Zamowiono "+Zamowienie.ileDodanych+" pozycji");
		System.out.println("Zamowienie: ");
		System.out.println(z);
		z.podsumowanie();
		

		
		//z.usunPozycje(2);
		
		//System.out.println(z);
		//z.podsumowanie();
		
		//z.edytujPozycjeAdmin(1);
		//System.out.println(z);
		
		//z.podsumowanie();

		z.dodajPozycje(p2);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p2);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
		z.dodajPozycje(p3);
		z.dodajPozycje(p3);
		z.dodajPozycje(p3);
		z.dodajPozycje(p3);
		z.dodajPozycje(p3);
		z.dodajPozycje(p3);
		System.out.println(z);
		z.podsumowanie();
	}
		

}

	
