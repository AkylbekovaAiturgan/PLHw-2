import java.util.Scanner;

public class TypeTringle {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

           if (a*a+b*b==c*c){
               System.out.println("right");
           }else if (a*a+b*b>c*c){
               System.out.println("acute");
           }else{
               System.out.println("obtuse");
           }
    }
}
