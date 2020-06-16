import java.util.Scanner;
public class primeNumber{
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int num;
 System.out.printf("enter number to check for prime number");
 
 num=in.nextInt();
 
 if(num%2==0)
 System.out.print(num +"is prime");
 else
 System.out.print(num + "is not a prime number");
 
 }
}
