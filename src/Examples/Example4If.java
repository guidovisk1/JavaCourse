package Examples;

import java.util.Scanner;

public class Example4If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();

        if(horas > 7 && horas < 12)
            System.out.println("Bom dia");
        else if(horas > 12 && horas < 18)
            System.out.println("Boa tarde");
        else
            System.out.println("Boa noite");

        sc.close();
    }
}
