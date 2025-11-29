import java.util.*;
public class EvenOrOdd {
    public static void main ( String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a;
    a=sc.nextInt();
    if(a%2==0){
        System.out.println("It is Even number");
    }
    else{
        System.out.println("It is odd number");
    }
    }
}