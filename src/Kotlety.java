import java.util.Scanner;

public class Kotlety {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        if (k==n){
            System.out.println((m*k)*2);
        }else{
            System.out.println((m*n)*2);
        }
    }
}