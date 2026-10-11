import java.util.Scanner;

public class TypeTringle {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("impossible");
            } else {
                if (a > b && a > c) {
                    int t = a;
                    a = c;
                    c = t;
                }

                if (b > c) {
                    int t = b;
                    b = c;
                    c = t;
                }

                if (a * a + b * b == c * c) {
                    System.out.println("right");
                } else if (a * a + b * b > c * c) {
                    System.out.println("acute");
                } else {
                    System.out.println("obtuse");
                }
            }
        }
}
