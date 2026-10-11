import java.util.Scanner;

public class BiletNaMetro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int one = 0, ten = 0, sixty = 0;

        sixty = n / 60;
        n %= 60;

        if (n > 0) {
            if (n <= 9) {
                if (n * 15 <= 125) one = n;
                else ten = 1;
            } else {
                ten = n / 10;
                n %= 10;

                if (n > 0) {
                    if (n * 15 < 125) one = n;
                    else ten++;
                }
            }
        }

        if (one * 15 + ten * 125 > 440) {
            sixty++;
            one = 0;
            ten = 0;
        }

        System.out.println(one + " " + ten + " " + sixty);
    }
}