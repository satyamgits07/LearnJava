import java.util.*;
public class QuestionPractice {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(isPrime(n));

        // System.out.println(isArmstrong(n));

        for(int i=100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    // Print all the three digit armstrong number

    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while (n>0){
            int rem=n%10;
            n=n /10;
            sum = sum + rem*rem*rem;
        }

        return sum==original;
    }

    
  //  find the number is prime or not

    static boolean isPrime(int n) {
            if (n<=1){
                return false;
            }
            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;

            }
            if (c*c>n){
                return true;
            }
            return false;
            
    }
}
