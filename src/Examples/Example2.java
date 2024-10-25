package Examples;

public class Example2 {
    public static void main(String[] args) {
        int a,b;
        double result;

        a = 5;
        b = 2;
        result = (double) a / b; // I must pass this 'double' to the compiler undertand that I dont wanti it to cut the other numbers

        System.out.println(result);
    }
}
