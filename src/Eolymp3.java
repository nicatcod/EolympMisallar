import java.util.Scanner;

public class Eolymp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n/100;
        int c = n%10;
            if(c<m){
                System.out.println(m);
        } else if (c>m) {
                System.out.println(c);

            }
            else if (c==m) {
                System.out.println("=");
            }

    }
}
