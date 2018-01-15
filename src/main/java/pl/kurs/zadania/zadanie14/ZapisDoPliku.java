package pl.kurs.zadania.zadanie14;

import java.io.*;

public class ZapisDoPliku {

    // deserialize to Object from given file
    public static Object deserialize(String nowezamowienie) throws IOException,
            ClassNotFoundException {

        FileInputStream fis = new FileInputStream(nowezamowienie);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Zamowienie z, String nowezamowienie)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(nowezamowienie);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(z);

        fos.close();
    }

}




