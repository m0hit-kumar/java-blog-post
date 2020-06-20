import java.util.Scanner;
public class Calc{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		float a,b,z;
String retry;    
int operator;
do{    
System.out.printf("Enter two numbers two perform operation" +"\n");    
a= in.nextInt();
b=in.nextInt();

System.out.println("1. addition");
System.out.println("2. subtratcion");
System.out.println("3. division");
System.out.println("4. multiplication");
System.out.println("choose your operator:");

operator =in.nextInt();
if (operator==1)    
{z=a+b;
  System.out.printf("\n" + "Sum=" +z);
 }
  else if (operator==2)    
{z=a-b;
    System.out.printf("\n" +"Diffrence="+z);
 }  
  else if (operator==3)    
{z=a/b;
      System.out.printf("\n" +"Division="+z);
 }   
 else if (operator==4)
 { z= a*b;
      System.out.printf("\n" + "Multiplication=" + z);
  }   
 else    
{
     System.out.printf("\n" + "not an option");
 } 
  System.out.printf("\n" +"press y to retry use it and n to exit");  
  retry =in.nextLine();
  } while(retry=="y" && retry!="n");    

	}
}
