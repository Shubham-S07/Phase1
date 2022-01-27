import java.util.Scanner;

public class Calculator
{
   public static void main(String args[])
   {
       float x, y, result;
       char operation, ch;
       Scanner scan = new Scanner(System.in);

       do
       {
           System.out.print("1. Add\n");
           System.out.print("2. Sub\n");
           System.out.print("3. Mul\n");
           System.out.print("4. Div\n");
           System.out.print("5. Exit\n");
           System.out.print("Enter operation: ");
           operation = scan.next().charAt(0);
           switch(operation)
           {
               case '1' : System.out.print("Enter Two Number: ");
                   x = scan.nextFloat();
                   y = scan.nextFloat();
                   result = x + y;
                   System.out.print("Addition of numbers is " + result);
                   break;
               case '2' : System.out.print("Enter Two Number: ");
                   x = scan.nextFloat();
                   y = scan.nextFloat();
                   result = x - y;
                   System.out.print("Subtraction of numbers is " + result);
                   break;
               case '3' : System.out.print("Enter Two Number: ");
                   x = scan.nextFloat();
                   y = scan.nextFloat();
                   result = x * y;
                   System.out.print("Multiplication of numbers is " + result);
                   break;
               case '4' : System.out.print("Enter Two Numbers: ");
                   x = scan.nextFloat();
                   y = scan.nextFloat();
                   result = x / y;
                   System.out.print("Division of numbers is " + result);
                   break;
               case '5' : System.exit(0);
                   break;
               default : System.out.print("Invalid operation");
                   break;
           }
           System.out.print("\n");
       }while(operation != 5);       
   }
}
