import java.util.Scanner;

public class Calculadora {

    Calculadora()
    {}
    public int sumar(int numero1, int numero2) {
        //int numero1, numero2, resultado = 0;
        //Scanner s = new Scanner( System.in );
        //System.out.println( "Introduce dos numeros para sumar: ");
        //numero1 = s.nextInt();
        //numero2 = s.nextInt();
        //resultado = numero1 + numero2;

       // System.out.println( "La suma de " + numero1 + " y " + numero2 + " es: " + resultado );
        return  numero1 + numero2;
    }

    public int restar() {
        int numero1, numero2, resultado = 0;
        Scanner s = new Scanner( System.in );

        System.out.println( "Introduce dos numeros para restar: ");
        numero1 = s.nextInt();
        numero2 = s.nextInt();
        resultado = numero1 - numero2;

        System.out.println( "La resta de " + numero1 + " y " + numero2 + " es: " + resultado );
        return resultado;
    }
    public int multiplicacion() {
        int numero1, numero2, resultado = 0;
        Scanner s = new Scanner( System.in );

        System.out.println( "Introduce dos numeros para multiplicar: ");
        numero1 = s.nextInt();
        numero2 = s.nextInt();
        resultado = numero1 * numero2;

        System.out.println( "La multiplicacion de " + numero1 + " y " + numero2 + " es: " + resultado );
        return resultado;
    }
    public float Division() {
        float numero1, numero2, resultado = 0;
        Scanner s = new Scanner( System.in );

        System.out.println( "Introduce dos numeros para dividir: ");
        numero1 = s.nextInt();
        numero2 = s.nextInt();
        resultado = numero1 / numero2;

        System.out.println( "La Division de " + numero1 + " y " + numero2 + " es: " + resultado );
        return resultado;
    }
}