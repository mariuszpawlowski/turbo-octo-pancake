package pl.kurs.spotkanie6;

import java.io.IOException;

public class B {

    public static void main(String[] args)  {

        B b = new B();
        try {
            b.metodaC();
        } catch (IOException e) {
            // log
            // zwraca komunikat

            e.printStackTrace();
            return;
        } finally {

        }

        // inna akcja
    }

    public void metodaC() throws IOException {

        A  a = new A();
        a.metodaA();
    }
}
