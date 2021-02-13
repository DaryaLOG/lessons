import com.sun.jdi.PathSearchingVirtualMachine;

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

        les2();//////Урок2
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

    ////////////ДЗ2


    public static void les2() {

        //////задание1
        int[] elementsArray = {1,1,0,0,1,0,1,1,0,0};
        replace(elementsArray);

        //////задание2
        int[] array2 = new int[8];
        fill(array2);

        /////Задание3
        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        multiply(array3);

        System.out.println();

        /////Задание4
        int[] array4 = {17,58,39,24,119,42,54,21,43,80,95,12};
        int min = findMin(array4);
        System.out.println("min=" + min);
        int max = findMax(array4);
        System.out.println("max=" + max);

    }
    public static void replace (int [] array) { //////Задание1
        for (int i=0; i < array.length; i++) {
            array[i]=(array[i]==1) ? 0 : 1;
            System.out.println(array[i]);
        }
    }
    public static void fill (int [] array) {   ////////Задание2
        int x = 1;
        for (int i=0; i < array.length; i++) {
            array[i]=x;
            x+=3;
            System.out.println(array[i]);
        }
    }
    public static void multiply (int [] array) { /////////Задание 3
        for (int i=0; i < array.length; i++) {
            if (array [i] < 6) {
                array [i] *=2;

            }
            System.out.print(array[i] +"\t");
        }
    }
    public static int findMin (int [] array) {
        int min = array [0];
        for (int i=1; i < array.length; i++) {
            int cur = array[i];
            if (cur < min) {
                min = cur;

            }

        }
        return min;

    }
    public static int findMax (int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int cur = array[i];
            if (cur > max) {
                max = cur;

            }

        }
        return max;

    }






}
