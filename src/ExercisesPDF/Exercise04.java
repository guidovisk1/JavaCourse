package ExercisesPDF;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por \n" +
                "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas \n" +
                "decimais");

        Scanner sc = new Scanner(System.in);
        int numero_funcionario = sc.nextInt();
        double horas_trabalhadas = sc.nextDouble();
        double salario_hora = sc.nextDouble();

        double salario_calculado = horas_trabalhadas * salario_hora;

        System.out.printf("%d, recebe $%.2f dolares",numero_funcionario,salario_calculado);

        sc.close();
    }
}
