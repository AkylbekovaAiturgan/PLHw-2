import java.util.Scanner;

public class Kotlety {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int time;

        if (n <= k) {
            time = 2 * m;
        } else {
            int rounds = (2 * n + k - 1) / k;
            time = rounds * m;
        }

        System.out.println(time);
    }
}