package pl.kurs.zadania.zadanie09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Napisac program, ktory wczytuje od uzytkownika liczby, do momentu az zostanie podana liczba 150.
Po zakonczeniu dzia≈ania programu wyswietlona zostaje informacja o sumie oraz sredniej z wszystkich podanych liczb (poza 150)
oraz jak wiele podanych zostalo liczb dodatnich, podzielnych przez "2"
 */
public class Zadanie9 {

	public static void main(String[] args) {

		int liczba;
		Scanner odczyt = new Scanner(System.in);

		List<Integer> lista = new ArrayList(); // dlaczego Integer zamiast int??

		// wczytanie liczb do listy
		do {
			System.out.println("Podaj liczbe");

			liczba = odczyt.nextInt();
			lista.add(liczba);
		} while (liczba != 150);
		lista.remove(new Integer(150));// usuwanie 150 z listy - skreslony new Integer
		System.out.println("Podano liczby: " + lista);

		double suma = 0;

		int ilosc = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma = suma + lista.get(i);

		}
		double srednia = suma / lista.size();

		System.out.println("Suma: " + suma);

		System.out.println("Srednia: " + srednia);

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) > 0 && lista.get(i) % 2 == 0) {
				ilosc++;

			}

		}
		System.out.println("Podano " + ilosc + " liczb dodatnich podzielnych przez 2");
	}
}