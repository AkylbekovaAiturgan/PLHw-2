import java.util.Scanner;

public class BiletyNaMetro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int one = 0, five = 0, ten = 0, twenty = 0, sixty = 0;

        sixty = n / 60;
        n %= 60;

        twenty = n / 20;
        n %= 20;

        ten = n / 10;
        n %= 10;

        five = n / 5;
        n %= 5;

        one = n;

        if (one * 15 > 70) {
            five++;
            one = 0;
        }

        if (five * 70 + one * 15 > 125) {
            ten++;
            five = 0;
            one = 0;
        }

        if (ten * 125 + five * 70 + one * 15 > 230) {
            twenty++;
            ten = 0;
            five = 0;
            one = 0;
        }

        if (twenty * 230 + ten * 125 + five * 70 + one * 15 > 440) {
            sixty++;
            twenty = 0;
            ten = 0;
            five = 0;
            one = 0;
        }

        System.out.println(one + " " + five + " " + ten + " " + twenty + " " + sixty);
    }
}
