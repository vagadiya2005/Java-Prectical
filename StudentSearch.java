import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 23),
                new Student("David", 21)
        );

        // Define the name to search for
        String searchName = "Bob";

        // Use stream to find the student with the exact name match
        Optional<Student> matchingStudent = students.stream()
                                                    .filter(student -> student.getName().equals(searchName))
                                                    .findFirst();

        // Print the result
        if (matchingStudent.isPresent()) {
            System.out.println("Student found: " + matchingStudent.get());
        } else {
            System.out.println("No student found with the name: " + searchName);
        }
    }
}
