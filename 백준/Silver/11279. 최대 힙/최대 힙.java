import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalSize = Integer.parseInt(br.readLine());


        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        int nInt;
        for(int i = 0; i < totalSize; i++){
            nInt = Integer.parseInt(br.readLine());

            if(nInt>0){
                maxQueue.add(nInt);
            }else{
                if(nInt == 0){
                    if(!maxQueue.isEmpty()){
                        System.out.println(maxQueue.poll());
                    }else{
                        System.out.println(0);
                    }
                }
            }
        }
        br.close();
        
    }


}