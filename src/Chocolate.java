import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        if ((k%m==0 && k/m<n) || (k%n==0 && k/n<m)) {
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}
