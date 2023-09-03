import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // System.out.println(num);

        //narrowing conversion:- it means that mainly type casting.
        // int num = (int)(69.676);
        // System.out.println(num);

        //Automatic type promotion in expressions
        // int a = 257;
        // byte b= (byte)(a); // 257 % 256 = 1
        // System.out.println(b);

        // byte a = 90;
        // byte b=9;
        // byte c = 30;   // java automatic performed these in integers.
    
        // int d= a - b + c;

        // System.out.println(d);

        //  int number='a';
        //  System.out.println(50000/(number));

        byte b = 45;
        char c = 'a';
        int i = 678;
        short s = 194;
        float f = 5.67f;
        double d= 0.567;
        double result = ( c * i) + (f/s) - (b*d);
        System.out.println(( c * i) + " " + (f/s) + " " +(b*d));
        // int + float - double = double
        System.out.println(result);

    }
}
