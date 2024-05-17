public class csa5_15 {
    public static void main(String[] args) {

        int lineCount = 0;
        System.out.println("Character Table ASCII");
        
        for(int i = 33; i <= 126; i++){
            if(lineCount % 10 == 0){
                System.out.println("");
            }
            lineCount++;
            System.out.print((char)i + " ");
        }

    }
}