package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        // Create an instance of ArithmeticBase
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        // Get user input for the two numbers
        System.out.println("Enter first number: ");
        double n = in.nextDouble();
        
        System.out.println("Enter second number: ");
        double m = in.nextDouble();
        
        // Get user input for the operation
        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next().toUpperCase();
        
        // Parse the input into an enum value
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationInput);

        // Calculate the result using the selected operation
        double result = r.calculate(m, n, operation);
        
        // Print the result
        System.out.println("Result: " + result);
    }
}
