package pl.kurs.zadania.zadanie07;

public class Zadanie7 {

	public static void main(String[] args) {
		// konwersja stringa na int, wywolac metode konwersji dwa razy, raz poprawnie, raz niepopranwie

		
		// poprawna przy uzyciu parseInt
		int x = Integer.parseInt("9");
		System.out.println(x);

		x = Integer.parseInt("9a");

		
		// niepoprawna conversion(znak1);
		int znak1 = 1;
		String znak = "3";

		//conversion(znak1);
		conversion(znak);
	}

	private static void conversion(String argument) {
		System.out.println(argument);

	}

}
