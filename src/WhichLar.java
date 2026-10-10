import java.util.Scanner;

public class WhichLar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a == b) {
            System.out.println(0);
        } else if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
