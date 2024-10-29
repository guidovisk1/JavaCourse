package Examples;

public class ExampleStringFormats {
    public static void main(String[] args) {
        String nome = "    Felipe Rocha Cardoso   ";
        String data_aleatoria = "2024-10-07";
        String nome_minusculo = nome.toLowerCase();
        String nome_maiusculo = nome.toUpperCase();
        String nome_sem_espaco = nome.trim(); // The trim() method removes whitespace from both ends of a string.
        String data_formatada = data_aleatoria.replace("-","/");


        System.out.println(nome_minusculo);
        System.out.println(nome_maiusculo);
        System.out.println(nome_sem_espaco);
        System.out.println(data_formatada);
    }
}
