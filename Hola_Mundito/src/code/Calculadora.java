package code;

import java.lang.constant.Constable;

public class Calculadora {

    public Calculadora()
    {

    }

    public static double[] FuncionCuadratica(double a, double b, double c){

        double b2 = b*b;
        double dentroraiz = b2 - (4*a*c);
        double raiz = (double) Math.sqrt(dentroraiz);

        double cuenta = (double )raiz;
        double veri =cuenta;
            if (veri % 2 ==0)
            {
                double primero = ((-b + raiz)/2*a);
                double segundo = ((-b  - raiz)/2*a);

                double  result[] = {primero, segundo};


                return  result;
            }
     return null;

    }
    public int sumar(int numero1, int numero2) {
        return  numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }
    public int multiplicacion(int numero1, int numero2) {

        return numero1*numero2;
    }
    public Constable Division(int numero1, int numero2) {
        if(numero2 == 0 ){
            return null;
        }
        else {
            int resultado = numero1 / numero2;
            return resultado;
        }
    }
}