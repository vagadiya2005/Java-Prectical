import java.util.Arrays;
import java.util.List;

public class AverageUsingStream {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        
        // Use stream to calculate the average
        double average = numbers.stream()
                                .mapToInt(Integer::intValue) // Convert to IntStream
                                .average()                   // Calculate the average
                                .orElse(0);                  // Default value if list is empty
        
        // Print the result
        System.out.println("The average is: " + average);
    }
}
