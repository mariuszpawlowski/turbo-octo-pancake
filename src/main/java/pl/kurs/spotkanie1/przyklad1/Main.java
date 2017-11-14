package pl.kurs.spotkanie1.przyklad1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program uruchomiony ");


        System.out.println("Program dziala ");

        Car car = new Car();

        car.setIloscDrzwi(6);

        wypisz(car);

        Car.metoda(5);

        System.out.println("Program konczy sie ");
    }

    private static void wypisz(Car car) {
        System.out.println("drzwi = " + car.getIloscDrzwi());
    }
}
