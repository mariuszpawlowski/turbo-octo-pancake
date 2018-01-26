package pl.kurs.zadania.zadanie15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ZliczanieJava8 {

    void liczZnakiiSlowa() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath2 = classLoader.getResource("a/plik.txt").getFile();
        File file = new File(filePath2);

        List<String> linieZpliku = Files.readAllLines(file.toPath());

        StringBuilder stringBuilder = new StringBuilder();
        for (String linia : linieZpliku){
            stringBuilder.append(linia);
        }

        String odczytanyPlik = stringBuilder.toString();

        odczytanyPlik = new String(Files.readAllBytes(file.toPath()));

        System.out.println(odczytanyPlik);


    }


}
