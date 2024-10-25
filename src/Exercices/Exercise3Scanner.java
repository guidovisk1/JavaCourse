package Exercices;

import java.util.Scanner;

public class Exercise3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá qual é o seu nome?");
        String x = sc.next(); // Puxa só uma palavra
        String z = sc.nextLine(); // Uma linha inteira
        int int_x = sc.nextInt();
        double double_x = sc.nextDouble();

        System.out.printf("Seja bem vindo %s %n",x);
        System.out.println(double_x);

        if(x.equals("Felipe") || (int_x == 19)){
            System.out.println("Vc é incrível");
        }else{
            System.out.println("Nem tanto");
        }
        sc.close();
    }
}
