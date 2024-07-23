import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Link: https://neetcode.io/problems/duplicate-integer
        int[] numbers = {1, 2, 3, 4};
        Set<Integer> results = new HashSet<>();
        boolean isDuplicate = false;

        for (int i = 0; i < numbers.length; i++) {
            if (results.contains(numbers[i])) {
                isDuplicate = true;
                break;
            }
            results.add(numbers[i]);
        }

        if (!isDuplicate) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}