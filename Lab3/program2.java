public class OverloadDemo {

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Please provide at least 2 numbers as command line arguments.");
            return;
        }

        // Parse command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if(args.length == 2) {
            // Call method with 2 parameters
            System.out.println("Sum of 2 integers: " + add(num1, num2));
        } else if(args.length >= 3) {
            int num3 = Integer.parseInt(args[2]);
            // Call overloaded method with 3 parameters
            System.out.println("Sum of 3 integers: " + add(num1, num2, num3));
        }
    }
}

// Wap in java to demonstrate method overloading
