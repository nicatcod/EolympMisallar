import java.util.Scanner;

public class Eolymp14 {
    public static void main(String[] args) {
        //İki sıfır olmayan n və m tam ədədləri verilmişdir.
        // n və m tam ədədləri eyni işarəlidirlərsə 1, əks halda 0 çap edin.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        if(N==0||K==0){
            System.out.println("Eded 0 olmaz");
        }
     else if (N > 0 && K > 0 || N < 0 && K < 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}


