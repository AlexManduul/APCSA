import java.util.*;

public class csa8_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int num = scanner.nextInt();
    int[][] arr = new int[num][num];

    for(int row = 0; row < arr.length; row++){
      for(int col = 0; col < arr[row].length; col++){
        int ranNum = (int)(Math.random()*2);
        arr[row][col] = ranNum;
      }
    }

    for(int row = 0; row < arr.length; row++){
      for(int col = 0; col < arr[row].length; col++){
        System.out.print(arr[row][col]);
      }
      System.out.println("");
    }

    int rowOne = -1;
    int rowZero = -1;
    
    for(int row = 0; row < arr.length; row++){
      boolean rowBul = true;
     for(int col = 0; col < arr[row].length-1; col++){
          if(arr[row][col] != arr[row][col+1]){
            rowBul = false;
          }
      }
      if(rowBul){
        if(arr[row][0] == 1){
          rowOne = row+1;
        }
        else{
          rowZero = row+1;
        }
      }
    }

    System.out.println("All 0s on row " + rowZero);
    System.out.println("All 1s on row " + rowOne);

    boolean mainDiagnolSame = true;
    for(int i = 0; i < arr.length - 1; i++) {
        if (arr[i][i] != arr[i + 1][i + 1]) {
            mainDiagnolSame = false;
            break;
        }
    }


    
    boolean subDiagnolSame = true;
    for(int i = 0; i < arr.length - 1; i++) {
        if (arr[i][arr.length - 1 - i] != arr[i + 1][arr.length - 2 - i]) {
            subDiagnolSame = false;
            break;
        }
    }
    boolean columnSame = true;
    for(int col = 0; col < arr.length; col++) {
        columnSame = true;
        for(int row = 0; row < arr.length - 1; row++) {
            if (arr[row][col] != arr[row + 1][col]) {
                columnSame = false;
                break;
            }
        }
        if (columnSame) {
            System.out.println("Column " + (col + 1) + " has the same value.");
        }
    }
    if(!columnSame){
      System.out.println("No same number on a column");
    }
    if (mainDiagnolSame) {
        System.out.println("Major diagonal has the same value.");
    }
    else{
      System.out.println("No same number Major Diagonal.");
    }
    if (subDiagnolSame) {
        System.out.println("Sub diagonal has the same value.");
    }
    else{
      System.out.println("No same number Sub Diagonal.");
    }

    

    
  }
  

  
}
