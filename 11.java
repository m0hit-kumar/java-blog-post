import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n, num, digit, rev = 0;

    System.out.printf( "Enter a positive number: ");
     num = in.nextInt();

     n = num;

     do
     {
         digit = num % 10;
         rev = (rev * 10) + digit;
         num = num / 10;
     } while (num != 0);

     System.out.print(" The reverse of the number is: " + rev + "\n");

     if (n == rev)
       System.out.printf(" The number is a palindrome.");
     else
         System.out.printf(" The number is not a palindrome.");

    

 
 }
}
