import java.util.Scanner;

public class csa5_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number of lines: ");
        int n = scanner.nextInt();
        while(n > 15 || n < 1){
            System.out.println("Input has to be between 1 and 15. Try again!");
            n = scanner.nextInt();
        }
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            if(i > 1){
                for(int a = 2; a <= i; a++){
                    System.out.print(a+" ");
                }

            }
            System.out.println("");
        }
    }
}