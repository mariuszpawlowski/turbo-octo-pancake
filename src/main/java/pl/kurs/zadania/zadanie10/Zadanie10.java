package pl.kurs.zadania.zadanie10;

import java.util.Scanner;

public class Zadanie10 {

	public static void main(String[] args) {

		String lancuch;
		Scanner odczyt = new Scanner(System.in);

		System.out.println("Podaj ciag znaków");
		lancuch = odczyt.nextLine();

		String str = new String(lancuch);
		char[] array = str.toCharArray();

		char koncowka = array[array.length - 1];

		int licznik = 0;
		
		for (int i = 0; i < array.length; i++) {

			if (koncowka == array[i]) {
				licznik++;
			}
		}
		int ilosc = licznik - 1;

		System.out.println("Litera " + koncowka + " powtorzyla sie " + ilosc + " razy");
	}

}