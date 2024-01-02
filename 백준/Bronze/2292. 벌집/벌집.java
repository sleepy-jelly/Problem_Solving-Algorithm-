import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nData = sc.nextInt();
        int range = 2;
        int layer = 1;
        int switch1 = 0;


        if (nData == 1) {
            System.out.print(1);
            switch1 = 1;
        } else
            while (range <= nData) {
                range = range + (6 * layer);
                layer++;
            }
        if (switch1 == 0) {
            System.out.print(layer);
        }
    }
}
