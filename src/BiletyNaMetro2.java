import java.util.Scanner;

public class BiletyNaMetro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int one = 0, five = 0, ten = 0, twenty = 0, sixty = 0;

        sixty = n / 60;
        n %= 60;

        if (n * 15 > 440) {
            sixty++;
            n = 0;
        }

        twenty = n / 20;
        n %= 20;

        if (n * 15 > 230) {
            twenty++;
            n = 0;
        }

        ten = n / 10;
        n %= 10;

        if (n * 15 > 125) {
            ten++;
            n = 0;
        }

        five = n / 5;
        n %= 5;

        if (n * 15 > 70) {
            five++;
            n = 0;
        }

        one = n;

        System.out.println(one + " " + five + " " + ten + " " + twenty + " " + sixty);
    }
}