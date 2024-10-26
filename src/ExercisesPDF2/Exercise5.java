package ExercisesPDF2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if(codigo == 1){
            float valor_total = 4 * quantidade;
            System.out.printf("O valor é %.2f", valor_total);
        }
        if(codigo == 2){
            double valor_total = 4.50 * quantidade;
            System.out.printf("O valor é %.2f", valor_total);
        }if(codigo == 3){
            float valor_total = 5 * quantidade;
            System.out.printf("O valor é %.2f", valor_total);
        }if(codigo == 4){
            float valor_total = 2 * quantidade;
            System.out.printf("O valor é %.2f", valor_total);
        }if(codigo == 5){
            double valor_total = 1.50 * quantidade;
            System.out.printf("O valor é %.2f", valor_total);
        }

        sc.close();
    }
}
