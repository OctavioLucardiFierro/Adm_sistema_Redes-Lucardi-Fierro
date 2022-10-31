package code;

public class Calculadora {

    public Calculadora()
    {

    }

    public static float[] FuncionCuadratica(float a, float b, float c){
        /*ArrayList <Double> arrli = new ArrayList<>();
        float b2 = b*b;
        float dentroraiz = b2 - (4*a*c);
        float raiz = (float) Math.sqrt(dentroraiz);

        double primero = ((-b + raiz)/2*a);
        double segundo = ((-b  - raiz)/2*a);
        arrli.add(primero);
        arrli.add(segundo);

        return arrli;*/
        float b2 = b*b;
        float dentroraiz = b2 - (4*a*c);
        float raiz = (float) Math.sqrt(dentroraiz);

        float cuenta = (float )raiz;
        float veri =cuenta;
            if (veri % 2 ==0)
            {
                float primero = ((-b + raiz)/2*a);
                float segundo = ((-b  - raiz)/2*a);

                float [] result = {primero, segundo};

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
    public int Division(int numero1, int numero2) {
        int resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return resultado;
    }
}