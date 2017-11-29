package pl.kurs.zadania.zadanie08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie8 {

	public static void main(String[] args) throws FileNotFoundException {
	

		
		PrintWriter zapis = new PrintWriter("plik.txt");
	      zapis.println("asdasdasdasdasd");
	      zapis.close();
	      
	      Scanner odczyt = new Scanner(new File("plik.txt"));
	      System.out.println(odczyt.nextLine());
	}

}
