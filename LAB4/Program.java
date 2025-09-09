//WRITE A PROG IN JAVA TO ADD MULTIPLY SUBTRACT 2 NUMBER AND THE PROGRAM SHLD HAVE CONSTRUCTOR OVERLOADING, OVERIDING AND INHERITANCE
class MyA {
    int x, y;

    // Default constructor
    MyA() {
        this.x = 0;
        this.y = 0;
        System.out.println("Default constructor of MyA called");
    }

    // Parameterized constructor
    MyA(int a, int b) {
        this.x = a;
        this.y = b;
        System.out.println("Parameterized constructor of MyA called");
    }

    // Method to add two numbers
    int add() {
        return x + y;
    }

    // Method to subtract two numbers
    int subtract() {
        return x - y;
    }

    // Method to multiply two numbers
    int multiply() {
        return x * y;
    }
}

// Derived class MyB
class MyB extends MyA {

    // Default constructor
    MyB() {
        super(); // Calls default constructor of MyA
        System.out.println("Default constructor of MyB called");
    }

    // Parameterized constructor
    MyB(int a, int b) {
        super(a, b); // Calls parameterized constructor of MyA
        System.out.println("Parameterized constructor of MyB called");
    }

    // Overriding add method
    @Override
    int add() {
        System.out.println("Overridden add method in MyB");
        return super.add(); // You can modify this logic if needed
    }
}

// Main class to run the program
public class Program {
    public static void main(String[] args) {
        // Using default constructor
        MyB obj1 = new MyB();
        System.out.println("Add: " + obj1.add());
        System.out.println("Subtract: " + obj1.subtract());
        System.out.println("Multiply: " + obj1.multiply());

        System.out.println("-----------------------------");

        // Using parameterized constructor
        MyB obj2 = new MyB(10, 5);
        System.out.println("Add: " + obj2.add());
        System.out.println("Subtract: " + obj2.subtract());
        System.out.println("Multiply: " + obj2.multiply());
    }
} 
