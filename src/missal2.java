import java.util.Scanner;

public class missal2 {
    public static void main(String[] args) {
        //Ayın nömrəsini göstərən N tam ədədi verilib (1 ≤ N ≤ 12).
        //N ədədinə uyğun olaraq ayın hansı rübdə yerləşdiyini tapmaq lazımdır.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 3) {
            System.out.println("1ci rub");
        }else if (n > 3 && n <= 6) {
            System.out.println("2ci rub");
        } else if (n > 6 && n <= 9) {
            System.out.println("3ci rub");

        } else if (n > 9 && n <= 12) {
            System.out.println("4ci rub");
        }
    }
}





