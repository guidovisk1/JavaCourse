package Examples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50;
        if(minutos > 100){
            conta += (minutos - 100) * 2;
         }
        System.out.printf("Valor da conta a apagar %.2f", conta);

        sc.close();
    }
}
