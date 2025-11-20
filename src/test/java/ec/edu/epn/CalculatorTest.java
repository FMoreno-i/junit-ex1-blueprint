package ec.edu.epn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    //crear instancia de la clase a la cual se hace la prueba
    private Calculator calculator = new Calculator();
    //Metodo_caso_resultadoEsperado (es un estandar de como se prueba)
    @Test //metodo asociado a una prueba unitaria
    void add_TwoPositiveNumbers_ReturnCorrectSum(){
        //Arrange - Preparacion de la prueba
        int a = 3;
        int b = 4;
           
        //Act - ejecucion
        int result = calculator.add(a, b);

        //Assert - metodos para validar 
        assertEquals(7, result);

    }

    @Test
    void substract_TwoNumbers_ReturnCorrectSubstract(){
        int a = 3;
        int b = 1;
        int result = calculator.subtract(a, b);
        assertEquals(2, result);
    }

    @Test
    void multiply_TwoNumbers_ReturnCorrectProduct(){
        int a = 2;
        int b = 8;
        int result = calculator.multiply(a, b);
        assertEquals(16, result);
    }

    @Test
    void divide_TwoNumbers_ReturnCorrectDivide(){
        int a = 18;
        int b = 9;
        double result = calculator.divide(a, b);
        assertEquals(2, result);
    }

     @Test
    void isEven_Number(){
        int a = 20;
        boolean result = calculator.isEven(a);
        assertEquals(true, result);
    }


}
