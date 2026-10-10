import java.util.Scanner;

public class Kotlety {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int t;

        if (n<=k) {
            t=2*m;
        } else {
            t = (2*n*m+k-1)/k;
        }

        System.out.println(t);
    }
}