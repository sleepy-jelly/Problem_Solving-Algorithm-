import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] strArr = new char[5][15];
        String result = "";

        for(int i=0; i<5; i++){
            String currentString = br.readLine();

            for(int j=0; j<currentString.length(); j++){
                strArr[i][j] = currentString.charAt(j);
            }
        }

        for(int j = 0; j<strArr[0].length; j++){
            for(int i=0; i<5; i++){
                if(strArr[i][j] == '\0'){
                    continue;
                } 
                result += strArr[i][j];
            } 
        }

        System.out.println(result);
        br.close();
        
    }
}
            // ex input             ex output
            // ABCDE                Aa0FfBb1GgCc2HhDd3IiEe4Jj
            // abcde
            // 01234
            // FGHIJ
            // fghij