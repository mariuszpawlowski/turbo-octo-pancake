package pl.kurs.zadania.zadanie14;


public class Zadanie14 {
	
	public static void main(String[] args) {
		// gdzie tutaj korzystamy z metody toString?
		
	
		
		
		Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
		System.out.println(p1); //w jaki sposób to jest wypisywane?
		Pozycja p2 = new Pozycja("Cukier", 3, 4);
		System.out.print(p2);
		
		Zamowienie z = new Zamowienie(20); //co to jest 20?
		z.dodajPozycje(p1);
		z.dodajPozycje(p2);
		System.out.println(z); 
		
		
	}
		

}

	
