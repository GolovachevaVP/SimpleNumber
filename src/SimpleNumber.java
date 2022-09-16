import java.util.ArrayList;
import java.util.List;

public class SimpleNumber {
    public static void main(String[] args) {

        simpleNumber();

        simpleNumber2();
    }

    public static void simpleNumber() {
        int count = 0, m=0;
        for (int i = 2; i <= 100; i++) {
            int k = 0;
            for (int j = 2; j <= i; j++) {

                count++;
                if ((i % j) == 0) k++;
            }
            if (k == 1) {
                System.out.println(i);
                m++;
            }

        }
        System.out.println("кол-во чисел "+m);
        System.out.println("счетчик: "+ count);
    }

    public static void simpleNumber2() {
        int count =0, m=0;
        for (int i = 2; i <= 100; i++) {
            boolean isHard = false;
            for (int j = 2; j < 100; j++) {

                count++;
                if (j != i && i % j == 0) {
                    isHard = true;
                    break;
                }
            }
            if (!isHard) {
                System.out.println(i);
                m++;
            }
        }
        System.out.println("кол-во чисел "+m);
        System.out.println("счетчик: "+ count);
    }

}
