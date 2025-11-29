import java.util.*;
public class GreatestOfTwo {
    public static void main ( String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a two numbers:");
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b){
        System.out.println(a+" is greater than "+b);
    }
    else if(b>a){
        System.out.println(b+" is greater than "+a);
    }
    else{
        System.out.println(a+" is equal to "+b);
    }
    }
}