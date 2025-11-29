import java.util.*;   //TO know the Itarations of the loop (For Loop)in the program.
public class SimpleForLoop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a end number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }
}