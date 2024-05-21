import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();



        for(int testCase = 0; testCase < totalSize; testCase++){
            TreeMap<Integer,Integer> tMap = new TreeMap<>();

            int nInt = Integer.parseInt(br.readLine());

            for(int i = 0; i < nInt; i ++){
                
                String[] inputArr = br.readLine().split(" ");
                char operFlag = inputArr[0].charAt(0);

                int num = Integer.parseInt(inputArr[1]);

                if(operFlag=='I'){

                    tMap.put(num, tMap.getOrDefault(num, 0) + 1);

                }else if(operFlag=='D'){

                    if(tMap.size()==0){
                        continue;
                    }

                    int flagInt =  num == 1 ? tMap.lastKey() : tMap.firstKey() ;    // if flagInt -== 1  delete the last Key else delete first Key
                   
                    if (tMap.put(flagInt, tMap.get(flagInt) - 1) == 1 ){ 
                                    // can be store duplicate integer  
                        tMap.remove(flagInt);
                    }
                    
                }
            }
            
            if (tMap.isEmpty()||tMap.size()==0) sb.append("EMPTY").append('\n');                           
            else sb.append(tMap.lastKey()).append(' ').append(tMap.firstKey()).append('\n'); 
        }

        System.out.println(sb);
        br.close();

    }
}