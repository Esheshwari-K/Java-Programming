import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Number: ");
        int num = scanner.nextInt();
        System.out.println("Value of Number is: " + num);
        int originalNum = num;  // Save original number
        int reverse = 0;
        while(num!=0) {
            reverse=reverse*10+num%10;
            num/=10;
        }
        if (reverse==originalNum){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }

        System.out.println("Reversed Number is: " + reverse);
    }
}
