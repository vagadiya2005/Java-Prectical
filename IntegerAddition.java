import java.util.Scanner;

public class IntegerAddition {
  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputCorrect = true;

        try {
            System.out.print("Enter the first integer: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);
        } catch (Exception e) {
            inputCorrect = false;
            System.out.println("You did not type an integer!");
        } finally {
            scanner.close();
        }

        System.out.println("Input Status: " + inputCorrect);
    }
}
