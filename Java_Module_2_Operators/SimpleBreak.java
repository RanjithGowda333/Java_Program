import java.util.*;   //TO know the Break statement in the program.
public class SimpleBreak{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            if(i==n){
                System.out.println("Breaking the loop at i= "+i);
                break;
            }
            System.out.println(" i= "+i);
        }
    }
}