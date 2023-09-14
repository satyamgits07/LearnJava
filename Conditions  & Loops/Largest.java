import java.util.*;

 public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q : Find the largest number of the 3
        // int max =a;
        // if (b>max){
        //     max=b;
        // }    
        // if (c>max){
        //     max=c;
        // }

        //Math.max/min

        int min= Math.min(a, Math.min(c,b));
        System.out.println("smallest number among these 3 is " + min);
    }
 }