import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Number: ");
        int num = scanner.nextInt();
        System.out.println("Value of Number is: " + num);
        if (num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
