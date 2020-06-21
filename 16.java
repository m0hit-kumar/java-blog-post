
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
double a,b;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

         a = reader.nextDouble();
        b = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double solution;

        switch(operator)
        {
            case '+':
                solution = a + b;
                 System.out.printf("solution =" + solution);
                break;

            case '-':
                solution = a - b;
                 System.out.printf("solution =" + solution);
                break;

            case '*':
                solution = a * b;
                 System.out.printf("solution =" + solution);
                break;

            case '/':solution=a/b;
             System.out.printf("solution =" + solution);
                break;

           
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
    }
}
