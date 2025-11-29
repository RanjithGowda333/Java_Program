import java.util.*;   //TO know the Continue statement in the program.
public class SimpleContinue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            if(i==n){
                //System.out.println("Skipping the loop at i= "+n);
                continue;
            }
            System.out.println(" i= "+i);
        }
    }
}