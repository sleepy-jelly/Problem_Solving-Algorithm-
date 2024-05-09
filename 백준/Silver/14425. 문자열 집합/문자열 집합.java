import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;


        int nCount = 0;
        nCount = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<String>();

        for(int i = 0 ; i < nCount; i ++){
            hashSet.add(br.readLine());
		}

        int nCount2 = Integer.parseInt(st.nextToken());

        for(int i = 0; i < nCount2; i++){
            String findThis = br.readLine();    
            if(hashSet.contains(findThis)){
                result++;
            }
        }

        System.out.println(result);

        br.close();
    }
}