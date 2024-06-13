import java.util.Scanner;

public class Eolymp16 {
    public static void main(String[] args) {
        //Üçrəqəmli ədəd verilir. Onun rəqəmlərinin hasilini hesablamalı.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int b =N/100;
        int c =(N/10)%10;
        int d =N%10;
        int B = b*c*d;
        System.out.println(B);
    }
}
