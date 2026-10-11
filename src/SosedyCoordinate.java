import java.util.Scanner;

public class SosedyCoordinate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long M = in.nextLong();
        long N = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();

        if (y > 1)
            System.out.println(x + " " + (y - 1));

        if (x > 1)
            System.out.println((x - 1) + " " + y);

        if (y < N)
            System.out.println(x + " " + (y + 1));

        if (x< M)
            System.out.println((x + 1) + " " + y);
    }
}