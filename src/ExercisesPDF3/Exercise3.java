package ExercisesPDF3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int etanol = 0;

        int tipo_combustivel = sc.nextInt();

        while (tipo_combustivel != 4){
            if(tipo_combustivel == 1)
                alcool += 1;
            else if (tipo_combustivel == 2){
                gasolina += 1;
            }
            else if(tipo_combustivel == 3){
                etanol += 1;
            }
            tipo_combustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Etanol: " + etanol);
        sc.close();
    }
}
