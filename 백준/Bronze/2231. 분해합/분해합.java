import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main (String[] args)throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int nData = Integer.parseInt(br.readLine());
        int result =0;

        for(int i=0; i <nData;i++){
            int num = i;
            int sum = 0;

            while(num != 0){
                sum = sum+num%10;
                num = num/10;

            }

            if(sum+i==nData){
                result=i;
                break;
            }
            

        }
        System.out.println(result);


    }
    
   
    
}
