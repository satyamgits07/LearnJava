import java.util.*;
public class OverLoading {
    public static void main(String[] args){
        // fun(45);
        // fun(34,23);
        // fun("Rahul");
       int ans = sum(23,45,89);
       System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int b){
        System.out.println(a + " "+b);
    }

    static void fun(String name){
        System.out.println(name);
    }
    }

