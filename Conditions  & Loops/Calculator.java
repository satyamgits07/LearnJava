import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from user till user does not press X or x;
        int ans =0; 
        while(true){
            //Take operator as input
            System.out.println("Enter the operaor");
            char op = sc.next().trim().charAt(0);
            if(op== '+' || op== '-' || op== '*' || op == '/' || op == '%'){
                // input two numbers
                    System.out.println("Enter 1st value:-");
                int a = sc.nextInt();
                System.out.println("Enter 2nd value:-");
                int b = sc.nextInt();
                
                    if(op == '+'){
                    ans=  a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op== '*'){
                    ans = a*b;
                }
                if(op== '/'){
                    if(b !=0){
                        ans = a/b;
                    }
                }
                if(op== '%'){
                    ans = a%b;
                }
            } else if (op== 'x' || op=='X'){
                break;
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Result  "+ ans);
            
        }
        
        
    }
}

