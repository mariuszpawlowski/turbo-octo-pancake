package pl.kurs.testy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addTwoNumbers_ShouldReturnCorrectResult(){
        // Given
        int a = 1;
        int b = 2;

        // When
        int wynik = calculator.add(a, b);

        // Then
        assertThat(wynik).isEqualTo(3);

    }

}