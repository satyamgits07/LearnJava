import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value to get the fibonacci serie:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       
        int a =1;
        int b =1;
        int count = 2;
         if(n==1){
            System.out.println("1");
            
        }
        if(n==2){
            System.out.println("1");
            System.out.println("1");
        }
        if(n>2){
            System.out.println(a);
         System.out.println(b);
        
        while(count<n){
            int c=a+b;
            a=b;
            b=c;
            count++;
             System.out.println(c); 
             
        }

    }


        
    }
}
