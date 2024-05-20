import java.util.*;

public class csa6_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int num){
        for(int row = 0; row < num; row++){
            for(int col = 0; col < num; col++){
                int number = (int)(Math.random()*2);
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}