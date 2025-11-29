import java.util.*;   //TO know the Itarations of the loop (Do While Loop)in the program.
public class SimpleDoWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        do{
            System.out.println("Value:"+n);
            n++;
        }while(n<=5);
    }
}