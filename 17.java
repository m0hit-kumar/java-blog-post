
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
	int month;
	int days;
	
	System.out.printf("Enter month in digits : ");
	month = in.nextInt();
	
	switch(month)
	{
		case  4:
		case  6:
		case  9:
		case 11:
			days=30;
			break;
		case  1:
		case  3:
		case  5:
		case  7:
		case  8:
		case 10:
		case 12:
			days=31;
			break;
			
		case 2:
			days=28;
			break;
		
		default:
			days=0;
			break;		
	}
	if(days==0)
System.out.printf("this month don't exist\n");
	else
		System.out.printf("Number of days " +month +" is " + days);	}
}
