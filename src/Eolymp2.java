import java.util.Scanner;

public class Eolymp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3) System.out.println("İlkin");
        else if (n <= 6) System.out.println("Orta");
        else if (n <= 9) System.out.println("Kafi");
        else if (n <= 12) System.out.println("Yüksək");
        if (n > 12) System.out.println("Dəyər düz deyil");
    }
}