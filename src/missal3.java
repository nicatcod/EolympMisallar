import java.util.Scanner;

public class missal3 {
    public static void main(String[] args) {
        //İstifadəçiyə müsbət tam ədəd daxil etməyi təklif edən proqram yazın.
        //Sonra həmin ədədin vurma cədvəlini çap etməlidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Musbet Ededi daxil Ele");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
             {


                System.out.println("%d* %d=%d ",N,i, N*i);



            }
        }
    }
}

