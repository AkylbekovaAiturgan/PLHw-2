import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a==0) {
            if (b==0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if ((-b)%a==0) {
                System.out.println((-b)/a);
            } else {
                System.out.println("NO");
            }
        }
    }
}
