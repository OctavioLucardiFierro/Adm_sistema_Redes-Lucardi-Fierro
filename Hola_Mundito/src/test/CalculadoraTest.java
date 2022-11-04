package test;
//import static  org.junit.Assert.assertEquals;

        import code.Calculadora;
        import org.junit.Test;

//import static org.junit.Assert.assertEquals;
        import java.sql.Array;
        import java.util.Arrays;

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
        assertEquals(calculadora.Division(0, 45), 0);
    }


    @Test
    public void  Funcacuadra(){
        double result[]= {-1.0, -1.0};
        //(calculadora.FuncionCuadratica(1,2,1),result);
        assertArrayEquals(calculadora.FuncionCuadratica(1,2,1),result,0); // delta = el numero? de decimales que aproxima
    }
    @Test
    public void  Funcacuadra3(){
        double datos [] = calculadora.FuncionCuadratica(1,2,1);
        double result[]= {-1.0, 1.0};  //Si la tolerancia (delta) es muy alta el error pasa (Gran descubrimiento hecho por Barbieri)
        assertFalse(Arrays.equals(datos,result)); // delta = el numero? de decimales que aproxima
    }


    @Test
    public void  Funcacuadra4(){
        double result[]= {145, -5}; // si delta (tolerancia) > 0 es lo mismo que un assertNotArraysEquals
        //(calculadora.FuncionCuadratica(1,2,1),result);
        assertArrayEquals(calculadora.FuncionCuadratica(1,4,(-5)),result,9999); // delta = el numero? de decimales que aproxima

    }
    @Test
    public void  Funcacuadra2(){
        double result[]= {1, -5};
        //(calculadora.FuncionCuadratica(1,2,1),result);
        assertArrayEquals(calculadora.FuncionCuadratica(1,4,(-5)),result,0); // delta = el numero? de decimales que aproxima

    }
}




