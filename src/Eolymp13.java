import java.util.Scanner;

public class Eolymp13 {
    public static void main(String[] args) {
        //x-in [a;b] intervalına daxil olduğunu təyin edin.
        //x ədədi o zaman [a;b] intervalına daxildir ki, a≤x≤b olsun.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (x > a) {
            if (x < b)
                System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
