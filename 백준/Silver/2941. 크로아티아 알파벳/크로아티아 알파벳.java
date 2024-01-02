import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    static int nCounter;

    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str1 = str;
        char ch = 'c';


        for (int i = 0; i < str1.length(); i++) {

            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'c' && str1.charAt(i + 1) == '=') {

                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'c' && str1.charAt(i + 1) == '-') {

                    i++;

                }
            }
            if (str1.length() > (2 + i)) {
                if (str1.charAt(i) == 'd' && str1.charAt(i + 1) == 'z' && str1.charAt(i + 2) == '=') {

                    i++;
                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'd' && str1.charAt(i + 1) == '-') {

                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'l' && str1.charAt(i + 1) == 'j') {

                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'n' && str1.charAt(i + 1) == 'j') {

                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 's' && str1.charAt(i + 1) == '=') {

                    i++;

                }
            }
            if (str1.length() > (1 + i)) {
                if (str1.charAt(i) == 'z' && str1.charAt(i + 1) == '=') {

                    i++;
                }
            }
            nCounter++;
        }
        System.out.println(nCounter);
    }
}
