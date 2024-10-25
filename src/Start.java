import java.util.Locale;

public class Start {
    public static void main(String[] args){
        Locale.setDefault(Locale.US); // Just meme
        int y = 32;
        int x = 16;
        double z = 10.234;
        int media = (y + x) / 2;
        System.out.println(media);
        System.out.printf("%.2f%n", z); // 2 decimal houses format - Is a language pattern
        System.out.println("The result of the avg is " + media + ". The float value is " + z);

        concat();
    }

    public static void concat(){
        String nome = "Melissa";
        int age = 18;
        double salary = 1.800;

        System.out.printf("The age of %s is %d and her salary is %.3f",nome,age,salary);
    }
}
