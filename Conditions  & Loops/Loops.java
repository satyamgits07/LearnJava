import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
         

        /*
           Syntax of for loops :
           for (initialization ; condition ; increment/decrement ) {
              // body/ statement
           }
         */
        // Q: Print numbers from 1 to 5
        //    for(int num=1; num<=5 ; num +=1 ){
        //     System.out.println(num);
        //    }

         // Q: print numbers from 1 to n 
           System.out.println("Enter value:");
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           

        //    for (int num=1 ; num<=n; num++){
        //     System.out.print(num + " ");

           /*
              
              Syntax of While loops:
                    while(condition){
                        body/statment
                    }
            */
            // int num = 1;
            // while(num<=n){
            //     System.out.println(num);
            //     num ++;
            // }

        /*
                Syntax of do while loop:
                 
                 do{

                 } while (condition);
         */
              int num=1;
              do{
                System.out.print(num + " ");
                num++;
              } while (num<=n);
           }
        
    }
    

