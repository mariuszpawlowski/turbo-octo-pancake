package pl.kurs.zadania.zadanie08;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import Paths i Path ??????/

public class Zadanie81 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(
				"C:\\Users\\Ortnann\\git\\turbo-octo-pancake\\src\\main\\java\\pl\\kurs\\zadania\\zadanie08\\test.txt");

		if (Files.exists(path)) {
		
			//Usuniêcie pliku 
		try {
			Files.delete(path);
		} catch (IOException e) {
			// deleting file failed
			e.printStackTrace();
		}
		}
		
		
		
		//Utworzenie nowego pliku
		try {

			Files.createFile(path);

		} catch (FileAlreadyExistsException ex) {

			System.err.println("File already exists");
		}

		
		//Zapis do pliku
		String przyklad = "Przykladowy tekst";

		Files.write(path, przyklad.getBytes());
		
		
		//Wypisanie pliku
		System.out.println(Files.readAllLines(path));
	}
}
