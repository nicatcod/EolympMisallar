import java.util.Scanner;

public class Eolymp12 {
    public static void main(String[] args) {
        //N natural ədədi verilmişdir. Onun cüt və ya tək olmasını yoxlayın.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N % 2 == 0) {
            System.out.println("Even");
        } else if (N % 2 == 1) {
            System.out.println("ODD");
        }


    }
}
