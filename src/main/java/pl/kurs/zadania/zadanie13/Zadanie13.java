package pl.kurs.zadania.zadanie13;

import java.lang.StringBuffer;
import java.util.Scanner;

public class Zadanie13 {

	public static void main(String[] args) {

		String lancuch;
		Scanner odczyt = new Scanner(System.in);

		System.out.println("Podaj ciag znaków");
		lancuch = odczyt.nextLine();

		StringBuffer buffer = new StringBuffer(lancuch);

		buffer.reverse();
		System.out.println(buffer);
	}

}
