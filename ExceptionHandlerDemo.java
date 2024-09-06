import java.util.Scanner;

// Custom exception for invalid string format
class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

public class ExceptionHandlerDemo {
    
    // Method to validate string format
    public static void validateStringFormat(String input) throws InvalidFormatException {
        if (!input.matches("[A-Z]{3}-\\d{3}")) {
            throw new InvalidFormatException("Invalid string format! Expected format: 'AAA-123'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handling invalid array index
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Enter array index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index! " + e.getMessage());
        }

        // Handling invalid string index
        try {
            String str = "OpenAI";
            System.out.println("Enter string index to access (0-5): ");
            int strIndex = scanner.nextInt();
            System.out.println("Character at index " + strIndex + ": " + str.charAt(strIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid string index! " + e.getMessage());
        }

        // Handling invalid string format
        scanner.nextLine(); // Consume the newline left-over
        try {
            System.out.println("Enter a string in format 'AAA-123': ");
            String input = scanner.nextLine();
            validateStringFormat(input);
            System.out.println("String format is valid.");
        } catch (InvalidFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
