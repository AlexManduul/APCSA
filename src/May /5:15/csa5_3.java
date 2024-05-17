public class csa5_3{
    public static void main(String[] args) {
        System.out.println("Celcius             Fahrenheit");
        System.out.println("_______________________________");

        for(int i = 0; i <= 100; i+=2){
            double cToF = i * 9.0/5.0 + 32;
            System.out.println(i + "                        " + cToF);
        }
    }
}