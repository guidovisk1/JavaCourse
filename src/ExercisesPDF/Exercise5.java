package ExercisesPDF;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short peca_1 = sc.nextShort();
        short numero_pecas1 = sc.nextShort();
        float valor_peca1 = sc.nextFloat();

        short peca_2 = sc.nextShort();
        short numero_pecas2 = sc.nextShort();
        float valor_peca2 = sc.nextFloat();

        float valor1 = numero_pecas1 * valor_peca1;
        float valor2 = numero_pecas2 * valor_peca2;

        float soma = valor1 + valor2;

        System.out.println(soma);

        sc.close();
    }
}
