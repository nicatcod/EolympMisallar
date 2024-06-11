import java.util.Scanner;

public class Eolymp10 {
    public static void main(String[] args) {
        //Tərəflərinin uzunluğu verilmiş
        //Üçbucağın növünü müəyyənləşdirməli (bərabərtərəfli, bərabəryanlı, müxtəliftərəfli).
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b + c > 100) {
            System.out.println("deyer duz deyil");
            return;
        }
        if (a == b && a == c) {
            System.out.println("beraber terefli di");
        } else if (a == c || a == b || b == c) {
            System.out.println("beraber yanli di");
        } else
            System.out.println("ferqli");
    }
}


