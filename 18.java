import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
int choice;
double temp,countemp;
	
	System.out.printf("Temperatur conversion menu (°C to F) \n");
System.out.printf("1. fahrenheit to Celsius " + "\n");
System.out.printf("2. Celsius to fahrenhiet " +"\n");
System.out.printf("enter your choice:" );
	choice = in.nextInt();
	switch(choice)
	{
		
case  1:System.out.printf("\n" + "enter
temperature in Fahrenheit :");
temp =in.nextDouble();
countemp = (temp -32)/1.8 ;
System.out.printf(" the temperature in clesius is :" + countemp + "\n");
		break;
		

case  2:System.out.printf("\n" + "enter temperature in centigrade :");
temp =in.nextDouble();
countemp = (1.8*temp) + 32 ;
System.out.printf(" the temperature in Fahrenheit is : " +countemp +"\n");
		break;
	
		default:System.out.printf("wrong! somethings went wrong");

			break;		
	}
	}
}
