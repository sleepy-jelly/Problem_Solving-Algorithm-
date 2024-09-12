import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalCustomer = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
      

        int[] sizeArr = new int[totalCustomer];


        for(int i = 0; i<totalCustomer; i++){
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(sizeArr);
        

        int prev = 0;	
		int sum = 0;	
				
		for(int i = 0; i < totalCustomer; i++) {	
			sum += prev + sizeArr[i];
		    
			prev += sizeArr[i];
		}
		System.out.println(sum);

    }
}