import java.util.*;

public class Main { 
    public static void main(String[] args) {
        // Q : Take input of two numbers and print the sum
         Scanner sc= new Scanner(System.in);

         int num1, num2, sum;

         System.out.println("Enter no 1:-");
          num1= sc.nextInt();
         System.out.println("Enter no. 2: ");
          num2=sc.nextInt();
          sum= num1+num2;
         System.out.println("THE SUM IS :-" + sum);

         //if we want to do this multiple times like 100 times, then this will diffcult like to copy and paste 100times,  so we will use functions or methods to budle this code to use it again again

    }
}
