package Examples;

import java.util.Scanner;

public class ExampleNoOOPResolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aX = sc.nextDouble();
        double bX = sc.nextDouble();
        double cX = sc.nextDouble();
        double aY = sc.nextDouble();
        double bY = sc.nextDouble();
        double cY = sc.nextDouble();

        double pX = (aX + bX + cX) / 2;
        double pY = (aY + bY + cY) / 2;

        double areaX = Math.sqrt(pX * (pX - aX) * (pX - bX) * (pX - cX) );
        double areaY = Math.sqrt(pY * (pY - aY) * (pY - bY) * (pY - cY) );

        System.out.println("Triangle X area : " + areaX);
        System.out.println("Triangle Y area : " + areaY);

        if(areaX > areaY)
            System.out.println("Larger area: X");
        else System.out.println("Larger area: Y");

        sc.close();
    }
}
