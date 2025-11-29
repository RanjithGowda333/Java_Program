import java.util.*;
public class PresentAge {
    public static void main ( String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Year of Birth:");
    int yob;
    yob=sc.nextInt();
    int ag=2025-yob;
    System.out.println("The present age is: "+ag);
    }
}