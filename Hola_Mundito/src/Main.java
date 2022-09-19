import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        int a, b, c = 0;
        Scanner s = new Scanner( System.in );
        System.out.println( "Introduce dos números: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println( "La suma de a y b es: " + c );

        }
    }

