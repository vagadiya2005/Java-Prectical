import java.util.*;

public class Overloading {

    public void StringOpration(String str) {

        String replacedString = str.replace('A', 'Z');
        System.out.println("Modified String: " + replacedString);
        System.out.println("Length of the string: " + replacedString.length());
    }

    public void StringOpration(String str, boolean isContainSpace) {

        int midIndex = str.length() / 2;

        String firstHalf = str.substring(0, midIndex);

        System.out.println("Modified String: " + firstHalf + "CHARUSAT");

        if (str.length() > 10 && isContainSpace == true) {
            System.out.println("Modified String(With length more than 10): " + str.toLowerCase());
        }

    }

    public static void main(String[] args) {

        Overloading obj = new Overloading();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        boolean isSpace = false;

        if (str.contains(" ")) {
            isSpace = true;
            obj.StringOpration(str, isSpace);

        } else {
            obj.StringOpration(str);
        }

    }

}
