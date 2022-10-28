package test;
//import static  org.junit.Assert.assertEquals;

import code.Calculadora;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import java.sql.Array;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();


    @Test
    public void sumaTest(){
        assertEquals(calculadora.sumar(18, 2), 20);
    }
    @Test
    public void sumaTest2(){
        assertEquals(calculadora.sumar(18, -2), 16);
    }
    @Test
    public void restaTest(){
        assertEquals(calculadora.restar(18, 200), -182);
    }

    @Test
    public void restaTest2(){
        assertNotEquals(calculadora.restar(18, 80), -98);
    }

    @Test
    public void Multiplicacion1(){
        assertEquals(calculadora.multiplicacion(18, 699), 12582);
    }

    @Test
    public void Multiplicacion2(){
        assertEquals(calculadora.multiplicacion(15, 2), 30);
    }

    @Test
    public void DivisionTest(){
        assertNotEquals(calculadora.Division(500000, 0), 123);
    }

    @Test
    public void DivisionTest2(){
        assertEquals(calculadora.Division(90, 45), 2);
    }

    @Test
    public void DivisionTest3(){
        assertNotEquals(calculadora.Division(0, 45), 20);
    }



    @Test
    public void  Funcacuadra(){assertEquals(String.valueOf(new float[][]{calculadora.FuncionCuadratica(1,2,1)}),-1,1);}
}
