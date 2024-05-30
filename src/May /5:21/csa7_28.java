import java.util.*;

public class csa7_28 {

    public static void main(String[] args) {
<<<<<<< HEAD

=======
>>>>>>> 037a5b1e7c17f5d693bc41775662ec56ce160c01
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer value: ");

        for(int i = 0; i < 4; i++){
            arr[i] = scanner.nextInt();
        }
        ArrayList<ArrayList<Integer>> number = new ArrayList<>();
        permute(arr, 0, number);

        System.out.println("All possible permutations:");
        for (ArrayList<Integer> permutation : number) {
            System.out.println(permutation);
        }
    }

    private static void permute(int[] arr, int start, ArrayList<ArrayList<Integer>> number) {
        if (start == arr.length) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            number.add(permutation);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, number);
            swap(arr, start, i); 
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
