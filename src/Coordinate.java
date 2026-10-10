import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if (x1 > 0 && y1 > 0) {
            if (x2 > 0 && y2 > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (x1 < 0 && y1 < 0) {
            if (x2 < 0 && y2 < 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (x1 > 0 && y1 < 0) {
            if (x2 > 0 && y2 < 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (x2 < 0 && y2 > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
