package ExercisesPDF3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        if(senha != 2002)
            System.out.println("Senha Inválida");
        else System.out.println("Acesso permitido");
        while (senha != 2002){
            senha = sc.nextInt();
            System.out.println("Senha Inválida");
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
