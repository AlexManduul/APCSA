
public class csa8_16 {
  public static void main(String[] args) {
      int[][] array = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
      sort(array);
      for(int[] num : array){
        System.out.print("{");
        for(int number: num){
          System.out.print(number + " ");
        }
        System.out.print("} ");
      }
  }
  public static void sort(int[][] arr){
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j][0] > arr[minIndex][0]) {
                minIndex = j;
            } else if (arr[j][0] == arr[minIndex][0]) {
                for (int k = 1; k < arr[0].length; k++) {
                    if (arr[j][k] > arr[minIndex][k]) {
                        minIndex = j;
                        break;
                    } else if (arr[j][k] < arr[minIndex][k]) {
                        break;
                    }
                }
            }
        }
        int[] temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
  }
}
