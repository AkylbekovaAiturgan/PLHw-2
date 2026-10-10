import java.util.Scanner;

public class Sdacha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int s = (c*100+d)-(a*100+b);

        if (s >= 0) {
            int e = s / 100;
            int f = s % 100;
            System.out.println(e + " " + f);
        }

    }
}