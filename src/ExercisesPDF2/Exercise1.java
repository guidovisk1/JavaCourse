package ExercisesPDF2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x >= 0) {
            System.out.println("Número positivo");
        } else{
            System.out.println("Número negativo");
        }
        sc.close();
    }
}
