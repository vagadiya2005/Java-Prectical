import java.time.Period;
import java.util.*;

public class practical5 {

    public static String Permutation(String str) {

        char[] characters = str.toCharArray();
        Random random = new Random();
        int i;

        for (i = 0; i < str.length(); i++) {

            int j = random.nextInt(str.length());

            char temp = characters[0];
            characters[0] = characters[j];
            characters[j] = temp;
        }

        return new String(characters);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string :");
        String str = sc.nextLine();

        String random = Permutation(str);

        System.out.println("Your Entred string : " + str);

        System.out.println("Random generated string : " + random);

    }

}
