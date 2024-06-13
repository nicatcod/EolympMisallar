import java.util.Scanner;

public class Eolymp15 {
    public static void main(String[] args) {
        //Üç müxtəlif a,b,c ədədləri verilmişdir. Onlardan qiymətcə orta olanı tapın.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a);
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

