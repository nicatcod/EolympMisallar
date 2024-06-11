import java.util.Scanner;

public class Eolymp8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            int tamBolum = a / b;
            int qaliqHisse = a % b;
            System.out.println(tamBolum + " " + qaliqHisse);
        }
    }
}



