package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

@SpringBootTest
class CalculadoraOctavioLucardiFierroApplicationTests {

	@Test
	void contextLoads() {
	}

	public MetodosCalcu Calcu;

	@BeforeEach
	public void a ()
	{
		Calcu = new MetodosCalcu();
	}

	@Test
	public void Multiplicacion(){
		assertEquals(Calcu.Multiplicar(3,5),15);
	}
	@Test
	public void Multiplicacion2(){
		assertEquals(Calcu.Multiplicar((-9),(-9)),81);
	}
	@Test
	public void Multiplicacion3(){
		assertNotEquals(Calcu.Multiplicar(21,76),0);
	}
	@Test
	public void Multiplicacion4(){
		assertNotEquals(Calcu.Multiplicar((-6),76),90);
	}
	@Test
	public void Suma(){
		assertEquals(Calcu.SUMA(2,8),10);
	}
	@Test
	public void Suma3(){
		assertNotEquals(Calcu.SUMA(21,2),122);
	}
	@Test
	public void Suma2(){assertEquals(Calcu.SUMA((-9),(-9)),(-18));
	}
	@Test
	public void Resta(){
		assertEquals(Calcu.RESTAR(90,55),35);
	}

	@Test
	public void Resta2(){
		assertNotEquals(Calcu.RESTAR(100,12),112);
	}

	@Test
	public void Resta3(){
		assertEquals(Calcu.RESTAR((-9),(-9)),0);
	}
	@Test
	public void Divicion(){
		assertEquals(Calcu.Dividir(90,45),2.0);
	}
	@Test
	public void Divicion2(){
		assertThrows(ArithmeticException.class,() -> {Calcu.Dividir(12000, 0);}); //Excepcion
	}

	@Test
	public void Divicion3(){
		assertNotEquals(Calcu.Dividir(3,4),0);
	}




	@Test
	public void Cuadratica(){
		double result1[] = {-1 , -1};

		assertArrayEquals(Calcu.FuncionCuadratica(1,2,1),result1,0);
	}


	@Test
	public void Cuadratica2(){
		double result2[] = { 1 , -5};

		assertArrayEquals(Calcu.FuncionCuadratica(1,4,(-5)),result2,0);
	}

	@Test
	public void Cuadratica3(){
		//Excepciones Matematicas
		assertThrows(ArithmeticException.class,() -> {Calcu.FuncionCuadratica(0,998,234);});
	}


	@Test
	public void Cuadratica4(){
		assertThrows(ArithmeticException.class,() -> {Calcu.FuncionCuadratica(0, 1,2);});
	}

}
