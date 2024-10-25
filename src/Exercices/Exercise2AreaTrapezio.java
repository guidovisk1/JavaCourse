package Exercices;

public class Exercise2AreaTrapezio {
    public static void main(String[] args) {
        int base_menor = 6;
        int base_maior = 8;
        int altura = 5;

        calcularAreaTrapezio(base_menor,base_maior,altura);
    }

    public static void calcularAreaTrapezio(int b_menor,int b_maior,int altura){
        int area = (b_maior + b_menor) / 2 * altura;
        System.out.print(area);
    }

}
