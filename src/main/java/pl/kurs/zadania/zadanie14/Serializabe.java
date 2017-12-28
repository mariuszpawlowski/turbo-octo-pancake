package pl.kurs.zadania.zadanie14;
import java.lang.Object;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public interface Serializabe {

    public static void zapiszZamowienie(Zamowienie z, String plikzamowienia){


//Get the file reference
        Path path = Paths.get("/IdeaProjects/turbo-octo-pancake/src/main/java/pl/kurs/zadania/zadanie14");

//Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write(String.valueOf(z));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static Zamowienie wczytajZamowienie(String plikzamowienia){


        return ;
}
}