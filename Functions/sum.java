import java.util.*;

public class sum {
    public static void main(String[] args) {
      //      int ans=sum2();
      //  System.out.println(ans);
      int ans=sum3(20,30);
      System.out.println(ans);
    }
      // pass the value of numbers when you are calling the method in main()
      static int sum3(int a, int b){
        int sum= a+b;
        return sum;
      }

    //return the value 

    static int sum2(){

     Scanner sc= new Scanner(System.in);
            int num1,num2,sum;
            System.out.print("Enter no 1:-");
          num1= sc.nextInt();
         System.out.print("Enter no. 2: ");
          num2=sc.nextInt();
          sum= num1+num2;
        
            return (sum); //khatamm tata bybye
             
        
           // error :- unreachable statement because we use return type before the statement
        }
    }

    
      /*  sum(); //we call the functions by bracket()...
        sum();
        sum();
        sum();

        
    }
        static void sum() {
            Scanner sc= new Scanner(System.in);
            int num1,num2,sum;
            System.out.print("Enter no 1:-");
          num1= sc.nextInt();
         System.out.print("Enter no. 2: ");
          num2=sc.nextInt();
          sum= num1+num2;
         System.out.println("THE SUM IS :-" + sum);
        }
    /*
        
         access modifier ( we will look in oop) return_type name(arguments){
            //body
            return statement;
         }
     */
    

