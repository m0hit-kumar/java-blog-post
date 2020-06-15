public class fibonacciSeries {
 public static void main(String[] args) {
 int x1=0,x2=1,x3,n=10;
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
