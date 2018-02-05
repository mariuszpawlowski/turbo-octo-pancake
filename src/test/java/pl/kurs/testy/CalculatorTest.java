package pl.kurs.testy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        CalculatorDB calculatorDb = mock(CalculatorDB.class);
        when(calculatorDb.getLiczba1()).thenReturn(1);
        when(calculatorDb.getLiczba2()).thenReturn(2);
        calculator = new Calculator(calculatorDb);
    }

    @Test
    public void addTwoNumbers_ShouldReturnCorrectResult(){
        // When
        int wynik = calculator.add();

        // Then
        assertThat(wynik).isEqualTo(3);

    }

}