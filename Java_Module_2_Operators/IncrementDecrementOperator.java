import java.util.*;   //TO know the increment and decrement operaters in the program.
public class IncrementDecrementOperator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Original:"+ a);
        System.out.println("Post-increment:"+ a++ );
        System.out.println("After post-increment:"+a);
        System.out.println("Pre-increment:"+(++a));
        System.out.println("Post-decrement:"+(a--));
        System.out.println("Pre-decrement:"+(--a));
    }
}