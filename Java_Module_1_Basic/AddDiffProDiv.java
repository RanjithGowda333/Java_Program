import java.util.*;
public class AddDiffProDiv {
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a,b,sum;
        a=s.nextInt();
        b=s.nextInt();
        sum=a+b;
        System.out.println("Sum:"+sum);
        int diff=a-b;
        System.out.println("Difference:"+ diff);
        int mul=a*b;
        System.out.println("Product:"+mul);
        int div=a/b;
        System.out.println("Divide:"+div);
    }
}