import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args)throws IOException {		
		int[] nintArray = new int[10];
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int resultOfCalString = Integer.parseInt(br.readLine()) *Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		 String str =String.valueOf(resultOfCalString);
			for(int i =0; i<str.length();i++) {
			nintArray[(str.charAt(i)-48)]++;
			}	
			for(int v :nintArray) {
				System.out.println(v);	
			}		
	}
}
