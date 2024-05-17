import java.util.Scanner;

public class csa5_16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter interger value: ");
        int num = scanner.nextInt();
        int div = 2;

        while(num/div != -1){
            if(num % div == 0){
                System.out.print(div + ", ");
                num/=div;
            }
            else{
                div+=1;
            }
        }
        System.out.println(num + ".");

    }
}