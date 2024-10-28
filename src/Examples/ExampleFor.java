package Examples;

import java.util.Scanner;

public class ExampleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_total_operacoes = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < numero_total_operacoes; i++){
            int valor_loop = sc.nextInt();
            soma += valor_loop;
        }
        System.out.printf("Soma total %d", soma);
        sc.close();
    }
}
