import java.util.Scanner;

public class Eolymp5 {
    public static void main(String[] args) {
        //İkirəqəmli natural ədədin rəqəmlərinin cəminin kvadratını hesablayın.
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int birinci = N / 10;
        int ikinci = N % 10;
        int cem = birinci + ikinci;
        int cem1 = cem * cem;
        System.out.println(cem1);


    }
}

