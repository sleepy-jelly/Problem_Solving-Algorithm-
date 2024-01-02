import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        String str_1 = "null";
        char[] arry1 = new char[3];
        String str_2 = "null";
        char[] arry2 = new char[3];
        for(int i=0;i< stringTokenizer.countTokens(); i++){
                String str = new String(stringTokenizer.nextToken());
                arry1 =new char[]{str.charAt(2), str.charAt(1), str.charAt(0)};
                 String str1 = new String(stringTokenizer.nextToken());
                arry2 =new char[]{str1.charAt(2), str1.charAt(1), str1.charAt(0)};
                str_1 = String.valueOf(arry1);
                str_2 =String.valueOf(arry2);
        }
        int nData1 =Integer.parseInt(str_1);
        int nData2 =Integer.parseInt(str_2);
        if(nData1>nData2){
            System.out.println(nData1);
        }else{
            System.out.println(nData2);
        }
        System.out.println();
    }
}