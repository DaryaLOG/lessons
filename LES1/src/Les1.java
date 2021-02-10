import java.awt.*;

public class Les1 {
    //Задание 1
    public static void main(String[] args) {

        int a = 72;
        int b = 43;
        int c = 56;
        int d = 91;
        float e = a * (b + ((float) c / d));
        System.out.println(e);


        //Задание 2
        //boolean result = Second(8, 12);
        //System.out.println(result);
        System.out.println(Second(8, 12));

        PositiveNegative(-567);
        PositiveNegative(1);
        PositiveNegative(0);


        System.out.println(Hello("Darya"));
    }

    public static boolean Second(int f, int g) {

        if (f + g < 10) {
            //System.out.println(false);
            return false;
        } else if (f + g > 20) {
            //System.out.println(false);
            return false;
        }
        return true;
    }
    //Задание 3
    public static void PositiveNegative(int v) {
        if (v<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
    //Задание 4
    public static String Hello(String name) {
        String abc = "Hello, ";
        return abc + name;

    }
}
