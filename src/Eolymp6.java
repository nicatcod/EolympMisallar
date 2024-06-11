import java.util.Scanner;

public class Eolymp6 {
    //İki natural n və m ədədləri verilmişdir.
//Nümunədə göstərildiyi kimi # simvollarından ibarət n * m ölçülü düzbucaqlını çap edin.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
