import java.util.Scanner;

public class Eolymp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        int b = 0;
        for (int i = 1; i <= n; i++) {
            b = b + i * i;
        }

        System.out.println("=" + b);
    }
}





