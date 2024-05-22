import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      

        Scanner sc  = new Scanner(System.in);

        int totalSize = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < totalSize; i++){

            
            int nData = sc.nextInt();

            map.put(nData, nData);

        }   

        int totalCheck = sc.nextInt();

        for(int i = 0; i <totalCheck; i++){

            if(map.containsKey(sc.nextInt())){
                System.out.println("1");
            }else{
                System.out.println("0");
            }

        }

        sc.close();

    }
}