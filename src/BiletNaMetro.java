import java.util.Scanner;

public class BiletNaMetro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int one = 0;
        int ten = 0;
        int sixty = 0;
        
        if (n >= 60) {
            sixty = n / 60;
            n = n % 60;
        }

        if (n > 0) {
            if (n <= 9) {
                if (n * 15 >= 125) {
                    ten = 1;
                } else {
                    one = n;
                }
            } else if (n <= 10) {
                ten = 1;
            } else {
                ten = n / 10;
                n = n % 10;

                if (n > 0) {
                    if (n * 15 > 125 - ten * 125) {
                        ten++;
                    } else {
                        one = n;
                    }
                }
            }
        }

        System.out.println(one + " " + ten + " " + sixty);
    }
}