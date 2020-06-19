import java.util.Scanner;
public class largerNumber {
	public static void main(String[] args) {
	
Scanner in =new Scanner(System.in);
    
            Double num1, num2, num3;
            System.out.println("enter number three numbers");
            num1=in.nextDouble();
              num2=in.nextDouble();
                num3=in.nextDouble();
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    

	}
}
