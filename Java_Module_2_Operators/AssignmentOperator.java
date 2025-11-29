import java.util.*;   //TO know the assignment and Not equalto Relational operaters in the program.
public class AssignmentOperator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b value :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The assignment operation for a and b is:"+(a==b) );
        System.out.println("The Not equal operation for a and b is:"+ (a!=b));
    }
}