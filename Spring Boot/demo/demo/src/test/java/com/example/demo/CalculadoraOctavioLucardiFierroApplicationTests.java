package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


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
		Assertions.assertEquals(Calcu.Multiplicar(3,5),15);
		Assertions.assertNotEquals(Calcu.Multiplicar(21,76),0);
		Assertions.assertNotEquals(Calcu.Multiplicar((-6),76),90);
		Assertions.assertEquals(Calcu.Multiplicar((-9),(-9)),81);
	}

	@Test
	public void Suma(){
		Assertions.assertEquals(Calcu.SUMA(2,8),10);
		Assertions.assertNotEquals(Calcu.SUMA(21,2),122);
		Assertions.assertEquals(Calcu.SUMA((-9),(-9)),(-18));
	}

	@Test
	public void Resta(){
		Assertions.assertEquals(Calcu.RESTAR(90,55),35);
		Assertions.assertNotEquals(Calcu.RESTAR(100,12),112);
		Assertions.assertEquals(Calcu.RESTAR((-9),(-9)),0);
	}

	@Test
	public void Divicion(){
		Assertions.assertEquals(Calcu.Dividir(90,45),2.0);
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.Dividir(12000, 0);}); //Excepcion
		Assertions.assertNotEquals(Calcu.RESTAR(3,4),0);
	}

	@Test
	public void Cuadratica(){
		double result1[] = {-1 , -1};
		double result2[] = { 1 , -5};

		Assertions.assertArrayEquals(Calcu.FuncionCuadratica(1,2,1),result1,0);
		Assertions.assertArrayEquals(Calcu.FuncionCuadratica(1,4,(-5)),result2,0);
		//Excepciones Matematicas
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.FuncionCuadratica(0,998,234);});
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.FuncionCuadratica(0,1,1);});
	}



}
