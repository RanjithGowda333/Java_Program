import java.util.*;   //TO know the leftshift, Rightshift,Unsignedright operaters in the program.
public class ShiftOperators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b value :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int left=a<<3;
        int right=b>>3;
        int unsi=a>>>2;
        System.out.println("The value of a is:"+ a);
        System.out.println("After Leftshift operation for a is:"+ left);
        System.out.println("After Rightshift operation for a is:"+ right);
        System.out.println("After Unsigned Rightshift operation for a is:"+ unsi);
    }
}