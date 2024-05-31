import java.util.*;

public class csa8_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 0 to 511: ");
        int num = scanner.nextInt();


        int[][] array = new int[3][3];
        int count = 0;
        for(int row = 0; row < array.length; row++){
            for(int col= 0; col < array[row].length; col++){
                array[row][col] = decToBinary(num).get(count);
                count++;
            }
        }

    

        for(int row = 2; row >=0; row--){
            for(int col= 0; col < 3; col++){
                if(array[row][col] == 0){
                    System.out.print(" H ");
                }
                else{
                    System.out.print(" T ");
                }
                
            }
            System.out.println("");
        }






    }
    public static ArrayList<Integer> decToBinary(int number){
        int num = number;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i <= 8; i++){
            arr.add(0);
        }
        for(int i = 8; i >= 0; i--){
            int twoNum = (int)Math.pow(2,i);
            if(num >= twoNum){
                num-=twoNum;
                arr.set(i,1);
            }
            if(num==0){
                return arr;
            }
        }
        return arr;
    }
}
