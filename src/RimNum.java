
import java.util.Scanner;

public class RimNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x >= 100) {
            System.out.print("C");
            x -= 100;
        }

        if (x >= 90) {
            System.out.print("XC");
            x -= 90;
        } else if (x >= 50) {
            System.out.print("L");
            x -= 50;
        } else if (x >= 40) {
            System.out.print("XL");
            x -= 40;
        }

        if (x >= 10) {
            System.out.print("X");
            x -= 10;
        }
        if (x >= 10) {
            System.out.print("X");
            x -= 10;
        }
        if (x >= 10) {
            System.out.print("X");
            x -= 10;
        }

        if (x == 9) {
            System.out.print("IX");
            x -= 9;
        } else if (x >= 5) {
            System.out.print("V");
            x -= 5;
        } else if (x == 4) {
            System.out.print("IV");
            x -= 4;
        }

        if (x >= 1) {
            System.out.print("I");
            x--;
        }
        if (x >= 1) {
            System.out.print("I");
            x--;
        }
        if (x >= 1) {
            System.out.print("I");
        }
    }
}

