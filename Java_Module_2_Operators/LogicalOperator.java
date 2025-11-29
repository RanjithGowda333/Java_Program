import java.util.*;   //TO know the AND, OR, XOR, Compliment operaters in the program.
public class LogicalOperator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b value :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int and=a&b;
        int or=a|b;
        int xor=a^b;
        int comp=~a;
        System.out.println("The AND operation for a & b is:"+ and);
        System.out.println("The OR operation for a | b is:"+ or);
        System.out.println("The XOR operation for a ^ b is:"+ xor);
        System.out.println("The NOT operation for a(~) is:"+ comp);
    }
}