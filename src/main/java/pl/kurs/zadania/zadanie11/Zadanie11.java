package pl.kurs.zadania.zadanie11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Napisac program obliczajacy srednia arytmetyczna z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich.
Liczby wczytywane sa od uzytkownika, koniec wczytywania oznacza podanie liczby 0.

 */
public class Zadanie11 {

	public static void main(String[] args) {

		int liczba;
		Scanner odczyt = new Scanner(System.in);

		List<Integer> lista = new ArrayList(); // dlaczego Integer zamiast int??

		// wczytanie liczb do listy
		do {
			System.out.println("Podaj liczbe - 0 zakonczy program");

			liczba = odczyt.nextInt();
			lista.add(liczba);
		} while (liczba != 0);
		lista.remove(new Integer(0));// usuwanie 150 z listy - skreslony new Integer
		System.out.println("Podano liczby: " + lista);

		double suma = 0;

		int ilosc = 0;
		int iloczyn = 1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < 0) {
				suma = suma + lista.get(i);
				ilosc++;

			}
		}
		double srednia = suma / ilosc;

		System.out.println("Suma ujemnych: " + suma);

		System.out.println("Srednia ujemnych: " + srednia);

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) >= 0) {
				iloczyn = lista.get(i) * iloczyn;
			}
		}

		System.out.println("Iloczyn liczb dodatnich " + iloczyn);
	}
}
