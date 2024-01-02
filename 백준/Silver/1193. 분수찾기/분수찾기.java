import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSize = sc.nextInt();

        int cross_num = 1, prev_num_sum = 0;


        while (true) {

            if (nSize <= prev_num_sum + cross_num) {
                if (cross_num % 2 == 1) {
                    System.out.print((cross_num - (nSize - prev_num_sum - 1)) + "/" + (nSize - prev_num_sum));
                    break;
                } else {
                    System.out.print((nSize - prev_num_sum) + "/" + (cross_num - (nSize - prev_num_sum - 1)));
                    break;
                }


            } else {
                prev_num_sum += cross_num;
                cross_num++;
            }


        }
    }
}