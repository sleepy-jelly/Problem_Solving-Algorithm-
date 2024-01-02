import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int nUserInput =Integer.parseInt(br.readLine());
		double[] newDouArray = new double[nUserInput];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");	
	    double sum = 0.0;	
		for(int i=0;i<nUserInput;i++) {
			newDouArray[i] =Double.parseDouble(st.nextToken());	 
		}	
		Arrays.sort(newDouArray);
		for(int i=0;i<nUserInput;i++) {
			sum +=newDouArray[i]/newDouArray[nUserInput-1]*100; 	
		}	
		System.out.printf("%f", sum/nUserInput);		
	}
}
