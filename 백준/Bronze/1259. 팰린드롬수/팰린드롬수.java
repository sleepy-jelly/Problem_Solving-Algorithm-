import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args)throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

        while(true){
            String nData = br.readLine();
            int nNum = Integer.parseInt(nData);

            if(nNum==0){
                break;
            }

            char[] charArr = nData.toCharArray();

            boolean checkFlag = true;
            
            for(int i = 0 ; i < charArr.length/2; i++){
                if(charArr[i]!=charArr[charArr.length-1-i]){
                    checkFlag = false;
                }else{
                }
            }
            
            if(checkFlag){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
        br.close();
    }

}