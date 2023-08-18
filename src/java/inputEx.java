import java.util.Scanner;
 public class inputEx {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter First Number");
         int n = sc.nextInt();
         System.out.println("Enter sceonrd number");
         int m = sc.nextInt();
        // int add = n+m;
         //System.out.println("Addition =" +add);

         int div=n/m;
         System.out.println(div);

     }
 }