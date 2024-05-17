public class csa5_5 {
    public static void main(String[] args) {

        System.out.println("Celsius Fahrenheit      |       Fahrenheit  Celsius");
        int x = 0;
        int y = 20;
        while(x<=100)
        {
            double cToF = x *9.0/5.0 + 32.0;
            double fToC = (y-32.0) *5.0/9.0;
            System.out.println(x + "        " + cToF + "    |   " + y + "       " + fToC);
            x+=2;
            y+=5;
        }
    }
}