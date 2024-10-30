package Examples;

import TrianguloOOP.Triangulo;

import java.util.Scanner;

public class ExampleNoOOPResolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X");
        x.lado_a = sc.nextDouble();
        x.lado_b = sc.nextDouble();
        x.lado_c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.lado_a = sc.nextDouble();
        y.lado_b = sc.nextDouble();
        y.lado_c = sc.nextDouble();

        double pX = (x.lado_a + x.lado_b + x.lado_c) / 2;
        double pY = (y.lado_a + y.lado_b + y.lado_c) / 2;

        double areaX = Math.sqrt(pX * (pX - x.lado_a) * (pX - x.lado_b) * (pX - x.lado_c) );
        double areaY = Math.sqrt(pY * (pY - y.lado_a) * (pY - y.lado_b) * (pY - y.lado_c) );

        System.out.println("Triangle X area : " + areaX);
        System.out.println("Triangle Y area : " + areaY);

        if(areaX > areaY)
            System.out.println("Larger area: X");
        else System.out.println("Larger area: Y");

        sc.close();
    }
}
