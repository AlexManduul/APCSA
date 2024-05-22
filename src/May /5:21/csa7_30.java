import java.util.*;

public class csa7_30 {

    public static void main(String[] args) {
        // Get input for the number of values
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = scanner.nextInt();

        // Create an array to store the values
        int[] values = new int[size];

        // Prompt user to enter the values
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        // Check if the array has four consecutive numbers with the same value
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) return false;

        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}