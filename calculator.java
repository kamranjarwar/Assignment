
import java.util.Scanner;

public class calculator  {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter  arithmetic expression: ");
        String input = ob.nextLine();

        try {
            int result = Expression(input);
            
            System.out.println("Result after the expression u input: " + result);
        } catch (Exception m ) {
            System.out.println("Error: ");
        }

      ob.close();
    }

    public static int Expression(String expression) {
        String[] parts = expression.split(" "); 
        if (parts.length != 3) {
           System.out.println("Invalid expressin. \n please input valid expression");
        }

        int num1 = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int num2 = Integer.parseInt(parts[2]);

        switch (operator) {
            case '+':
                return num1 + num2;
               
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
               
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

