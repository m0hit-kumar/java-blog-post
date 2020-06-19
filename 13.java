public class largerNumber {
	public static void main(String[] args) {
    
            Double num1=4.4, num2=3.2, num3=6.0;
            
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    

	}
}
