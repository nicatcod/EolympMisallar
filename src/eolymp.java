import java.util.Scanner;

public class eolymp {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Məktəbli sayı ");
            int n = input.nextInt();
            System.out.print("Alma sayı");
            int k = input.nextInt();
            int alma = k / n;
            int zenbil = k % n;
            System.out.println("Hər bir məktəbliyə düşən alma " + alma);
            System.out.println("Zənbildə qalan" + zenbil);
        }
    }
