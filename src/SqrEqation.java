import java.util.Scanner;

public class SqrEqation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println((-b + Math.sqrt(D)) / (2 * a));
            System.out.println((-b - Math.sqrt(D)) / (2 * a));
        } else if (Math.abs(D) < 1e-10) {
            System.out.println(-b / (2 * a));
        }else{
            System.out.println(0);
        }
    }
}