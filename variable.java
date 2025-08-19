import java.util.Scanner;
public class variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Variable: ");
        int variable = scanner.nextInt();
        System.out.println("Value of Variable is: " + variable);
        if (variable>10){
            System.out.println("Variable is greater than 10");
        }
        else if (variable<10){
            System.out.println("Variable is less than 10");
        }
        else {
            System.out.println("Variable is equal to 10");
        }
    }
}
