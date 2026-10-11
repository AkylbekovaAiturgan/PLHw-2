import java.util.Scanner;

public class SqrEqation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println(0);
        }
    }
}