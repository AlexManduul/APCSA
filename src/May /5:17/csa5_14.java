import java.util.Scanner;

public class csa5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer values: ");
        int valOne = scanner.nextInt();
        int valTwo = scanner.nextInt();
        
        int min;
        if(valOne > valTwo){
            min = valTwo;
        }
        else{
            min = valOne;
        }

        while (valOne % min != 0 || valTwo % min != 0) {
			min--;
		}
        System.out.println("Greatest Common Divisor: " + min);


    }
}