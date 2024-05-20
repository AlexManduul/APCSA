import java.util.Scanner;

public class csa6_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String n = scanner.nextLine();
        if(validPass(n)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean validPass(String password){
        int letterCount = 0;
        int numberCount = 0;
        String numberList = "1234567890";
        String letterList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < password.length(); i++){
            if(numberList.indexOf(password.substring(i,i+1)) > -1){
                numberCount++;
            }
            if(letterList.indexOf(password.substring(i,i+1)) > -1){
                letterCount++;
            }
        }
        if(password.length() < 10){
            return false;
        }
        if((letterCount+numberCount) == password.length()){
            return false;
        }
        if(numberCount < 3){
            return false;
        }
        return true;
    }
}