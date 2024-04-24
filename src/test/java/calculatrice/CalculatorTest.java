package calculatrice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }


    @Test
    public void add_test() {
        // Addition de deux nombres positifs
        assertEquals(8, calculator.add(5, 3));

        // Addition de deux nombres négatifs
        assertEquals(-8, calculator.add(-5, -3));

        // Addition d'un nombre positif et d'un nombre négatif
        assertEquals(2, calculator.add(5, -3));

        // Addition de zéro
        assertEquals(5, calculator.add(5, 0));

        // Addition de plusieurs nombres
        assertEquals(11, calculator.add(5, 3, 2, 1));

        // Liste d'arguments vide
        assertEquals(0, calculator.add());


    }

    @Test
    public void subtract_test() {

        // Soustraction de deux nombres positifs
        assertEquals(2, calculator.subtract(5, 3));

        // Soustraction de deux nombres négatifs
        assertEquals(-2, calculator.subtract(-5, -3));

        // Soustraction d'un nombre positif et d'un nombre négatif
        assertEquals(8, calculator.subtract(5, -3));

        // Soustraction d'un nombre à zéro
        assertEquals(5, calculator.subtract(5, 0));

        // Soustraction de plusieurs nombres
        assertEquals(1, calculator.subtract(10, 3, 4, 2));
    }
    @Test
    public void multiply_test() {


        // Multiplication de deux nombres positifs
        assertEquals(15, calculator.multiply(5, 3));
        //multiply float
        assertEquals(20.8, calculator.multiply(6.5, 3.2));
        // Multiplication de deux nombres négatifs
        assertEquals(15, calculator.multiply(-5, -3));

        // Multiplication d'un nombre positif et d'un nombre négatif
        assertEquals(-15, calculator.multiply(5, -3));

        // Multiplication par zéro
        assertEquals(0, calculator.multiply(5, 0));

        // Multiplication de plusieurs nombres
        assertEquals(120, calculator.multiply(2, 3, 4, 5));
    }

    @Test
    public void divide_test() {

        // Division de deux nombres positifs
        assertEquals(2, calculator.divide(6, 3));
        //divide float
        assertEquals(2.5217391304347827, calculator.divide(5.8, 2.3));
        // Division de deux nombres négatifs
        assertEquals(2, calculator.divide(-6, -3));

        // Division d'un nombre positif et d'un nombre négatif
        assertEquals(-2, calculator.divide(6, -3));

        // Division par zéro
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));

        // Division de plusieurs nombres
        assertEquals(0, calculator.divide(0, 4));
    }


    @Test
    public void sum_test() {


        // Addition de deux nombres positifs
        assertEquals(8, calculator.sum(5, 3));

        // Addition de deux nombres négatifs
        assertEquals(-8, calculator.sum(-5, -3));

        // Addition d'un nombre positif et d'un nombre négatif
        assertEquals(2, calculator.sum(5, -3));

        // Addition de zéro
        assertEquals(5, calculator.sum(5, 0));

        // Addition de plusieurs nombres
        assertEquals(11, calculator.sum(5, 3, 2, 1));

        // Liste d'arguments vide
        assertEquals(0, calculator.sum());
    }
}