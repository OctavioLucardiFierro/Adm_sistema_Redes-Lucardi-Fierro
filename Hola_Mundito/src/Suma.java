import java.util.Scanner;

public class Suma {
    public int sumar() {
        int a, b, c = 0;
        Scanner s = new Scanner( System.in );
        System.out.println( "Introduce dos números: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println( "La suma de a y b es: " + c );
        return c;
    }
}