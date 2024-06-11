import java.util.Scanner;

public class Eolymp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3) System.out.println("ilkin");
        else if (n <= 6) System.out.println("orta");
        else if (n <= 9) System.out.println("kafi");
        else if (n <= 12) System.out.println("yuksek");
        if (n > 12) System.out.println("deyer duz deyil");
    }
}
