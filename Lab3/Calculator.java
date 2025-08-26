public class Calculator {

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract two integers
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Divide two integers
    static int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: java Calculator num1 num2 [num3]");
            return;
        }

        // Parse command line input
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Addition (2 nums): " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // Optional third number for overloaded add
        if(args.length >= 3) {
            int num3 = Integer.parseInt(args[2]);
            System.out.println("Addition (3 nums): " + add(num1, num2, num3));
        }
    }
}
