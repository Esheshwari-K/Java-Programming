import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Number: ");
        int num = scanner.nextInt();
        System.out.println("Value of Number is: " + num);
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits is: " + sum);
}
}
