import java.util.*;
public class EqualOrNot{
    public static void main(String[] args){
         /*String a="Hello";
        System.out.println( "String is: "+a);
        System.out.println("String to Upper: "+a.toUpperCase());
        System.out.println("String to Lower: "+a.toLowerCase());
        System.out.println("String Length: "+a.length());
        */
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string 1:");
        String a=sc.nextLine();
        System.out.println("Enter string 2:");
        String b=sc.nextLine();
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.equals(b)){
            System.out.println("it is equal");
        }
        else{
            System.out.println("Not equal");
        }

    }
}
