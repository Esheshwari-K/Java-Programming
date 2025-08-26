// Wap in java to take 2 num in command line and to add them
public class Addition {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Please provide 2 numbers as command line arguments.");
            return;
        }

        // Convert command line arguments from String to int
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
