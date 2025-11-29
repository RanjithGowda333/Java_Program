import java.util.*;
public class CircleRadius {
    public static void main ( String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter thr radius:");
    int a;
    a=sc.nextInt();
    double area=((3.14)*(a*a));
    System.out.println("The Area of the circle is: "+area);
    }
}