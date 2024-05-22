import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      

        Scanner sc  = new Scanner(System.in);

        int totalSize = sc.nextInt();

       	Queue<Integer> que = new LinkedList<>();



        for(int i = 0 ; i < totalSize; i++){

            que.offer(i+1);
        
        }   

        while(que.size() > 1){
            
            que.poll();
            que.offer(que.poll());

        }   

        System.out.println(que.poll());


        sc.close();

    }
}