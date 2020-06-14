
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a,b,c,d,x,y;
	System.out.print("Enter the first number \n");	 x = in.nextInt();
			
	System.out.print("Enter the second number \n");
	 y = in.nextInt();
		a= x+y ;
		b=x-y;
		c=x*y;
		d=x/y;
		System.out.print(a +"\n");
		System.out.print(b + "\n");
		System.out.print(c +"\n");
		System.out.print(d);
		
	}
}
