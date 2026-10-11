import java.util.Scanner;

public class BiletNaMetro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sixty = n / 60;
        n %= 60;

        int ten = n / 10;
        n %= 10;

        int one = n;

        if (n * 15 > 125) {
            ten++;
            one = 0;
        }

        if (ten * 125 > 440) {
            sixty++;
            ten = 0;
            one = 0;
        }

        System.out.println(one + " " + ten + " " + sixty);
    }
}
