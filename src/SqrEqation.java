import java.util.Scanner;

public class SqrEqation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            System.out.println(x);
        }
    }
}



