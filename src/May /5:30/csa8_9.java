import java.util.Scanner;

public class csa8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = new String[3][3];
        String player = "";
        int count = 0;

        for(int i = 0; i < 3; i++){
            for(int a = 0; a < 3; a++)
            {
                arr[i][a] = " ";
            }
        }

        printArr(arr);
        while(checkForNull(arr)){
            if(count % 2 == 0){
                player = "O";
            }
            else{
                player = "X";
            }
            System.out.print("Enter a row (0, 1, 2) for player " + player);
            int rPos = scanner.nextInt();
            System.out.print("Enter a column (0, 1, 2) for player " + player);
            int cPos = scanner.nextInt();
            if(!arr[rPos][cPos].equals(" ")){
                arr[rPos][cPos] = player;
                count++;
                printArr(arr);
            }
            else{
                System.out.println("Try again, spot taken!");
            }
            if(checkWinner(arr)){
                System.out.println("Player " + player + " wins!");
                break;
            }



        }
        System.out.println("Draw!");




    }

    public static boolean checkWinner(String[][] array){
        for(int i = 0; i < 3; i++){
            if(array[i][0] == array[i][1] && array[i][1] == array[i][2]){
                if(array[i][0].equals(" ")){
                  return false;
                }
                else{
                  return true;
                }
            }
            if(array[0][i] == array[1][i] && array[1][i] == array[2][i]){
                if(array[0][i].equals(" ")){
                  return false;
                }
                else{
                  return true;
                }
            }
            if(array[0][0] == array[1][1] && array[1][1] == array[2][2]){
                if(array[0][0].equals(" ")){
                  return false;
                }
                else{
                  return true;
                }
            }
            if(array[0][2] == array[1][1] && array[1][1] == array[2][0]){
                if(array[0][2].equals(" ")){
                  return false;
                }
                else{
                  return true;
                }
            }
            return false;
        }
    }
    public static boolean checkForNull(String[][] arr){
        for(String[] a: arr){
            for(String str: a){
                if(str.equals(" ")){
                    return true;
                }
            }
        }
        return false;
    }
    public static void printArr(String[][] arr){
        System.out.println("--------------");
        for(String[] a: arr){
            System.out.print("| ");
            for(String str : a){
                System.out.print(str + " | ");
            }
            System.out.println("");
            System.out.println("--------------");
        }
    }
}