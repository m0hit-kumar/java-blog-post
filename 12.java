import java.util.Scanner ;
public class Main {
 public static void main(String[] args) {
 
Scanner in = new Scanner(System.in);
int num,fact=1;
System.out.print( " enter integer :");
num = in.nextInt();
for(int i=num;i>0;i-- )
{
fact*=num;
--num;
}
System.out.printf("the factorial is" + fact+"\n");
 }
}
