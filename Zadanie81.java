import java.io.*;
public class Zadanie81 {

	public static void main(String[] args) throws IOException {
		File plik1 = new File("plik1.txt");
	      
	      plik1.createNewFile();
	      
	      
	      FileWriter zapis = new FileWriter(plik1); 
	      
	      zapis.write("aaaaaaaaaaa"); 
	      zapis.flush();
	      zapis.close();

	      
	      FileReader fr = new FileReader(plik1); 
	      char [] a = new char[50];
	      fr.read(a);   
	      
	      for(char c : a)
	         System.out.print(c);   
	      fr.close();

	}

}
