import java.util.Scanner;

public class PrintArrayElements {
      public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the total number of Array Elements:");
      int n= sc.nextInt();
      int a[]  = new int[n];
      System.out.println("Enter Array Elements:");
      int i;
      for(i = 0; i <n; i++) {
         a[i] = sc.nextInt();
      }
      System.out.println(" Array Elements are:");

      for(i = 0; i <n; i++) {
         System.out.print(a[i] + " ");
      }
    }
}

