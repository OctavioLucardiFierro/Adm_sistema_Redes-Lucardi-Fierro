package code;

public class Calculadora {

    public Calculadora()
    {

    }

    public static float [] FuncionCuadratica(float a,float b, float c){
        float b2 = b*b;
        float dentroraiz = b2 - (4*a*c);
        float raiz = (float) Math.sqrt(dentroraiz);

        float primero = ((-b + raiz)/2*a);
        float segundo = ((-b  - raiz)/2*a);

        float[] pepe ={primero,segundo};
        return  pepe;

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
    public int Division(int numero1, int numero2) {

        return numero1/numero2;
    }
}