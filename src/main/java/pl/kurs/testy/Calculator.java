package pl.kurs.testy;

public class Calculator {

    private CalculatorDB calculatorDB;

    public Calculator(CalculatorDB calculatorDB) {
        this.calculatorDB = calculatorDB;
    }

    public int add(){
        return calculatorDB.getLiczba1() + calculatorDB.getLiczba2();
    }
}
