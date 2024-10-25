package ExercisesPDF;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Calculadora de raio de um círculo X");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio,2);

        System.out.printf("O valor da área é %.4f", area);
    }
}
