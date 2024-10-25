package ExercisesPDF;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiro_numero = sc.nextInt();
        System.out.println("Digite o segundo número");
        int segundo_número = sc.nextInt();
        int resultado = primeiro_numero + segundo_número;

        System.out.printf("O valor da soma entre %d e %d é igual a %d", primeiro_numero,segundo_número,resultado);
    }
}
