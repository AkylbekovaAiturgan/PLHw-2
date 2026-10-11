import java.util.Scanner;

public class Cow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n==1){
            System.out.println(n + " korova ");
        }else if (n<2 &&  n>4){
            System.out.println(n + " korovy ");
        }else{
            System.out.println(n + " korov " );
        }
    }
}