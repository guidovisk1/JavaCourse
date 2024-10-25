package Exercices;

public class Exercise4Baskhara {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à calculadora de Bhaskara");

        calcularBhaskara(1.0, 2.0, 4.0);
    }

    public static void calcularBhaskara(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta é negativo. Não existem raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("O valor de x1 é " + x1);
            System.out.println("O valor de x2 é " + x2);
        }
    }
}
