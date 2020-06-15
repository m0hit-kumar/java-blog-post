import java.util.Scanner;
public class fibonacciSeries {

 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int x1,x2,x3,n;
 System.out.print("enter the first number of series"); 
 x1= in.nextInt();
 System.out.print("enter the first number of series"); 
 x2= in.nextInt();
 System.out.print("enter the size of Fibonacci series"); 
 n= in.nextInt();
   System.out.print(x1);  
 for(int i=0;i<n;++i)
{
        x3=x1+x2;    
        
           System.out.print(" "+x3);    
        
            x1=x2;    
            x2=x3 ;
}
 }
}

