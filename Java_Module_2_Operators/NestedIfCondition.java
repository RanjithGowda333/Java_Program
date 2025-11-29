import java.util.*;   //TO know the Selection Operators (Nested if condition)in the program.
public class NestedIfCondition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Marks :");
        int mar=sc.nextInt();
        if(mar>=50){
            System.out.println("You Passed in the exam. ");
            if(mar>=90)  System.out.println("Grade:A+ ");
            else if(mar>=75)  System.out.println("Grade:A");
            else  System.out.println("Grade:B ");
        }
        else  System.out.println("You Failed in the exam. ");

    }
}