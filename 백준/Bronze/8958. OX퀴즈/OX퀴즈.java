import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int nUserInputSize= Integer.parseInt(br.readLine());
	String nUserInput[] = new String[nUserInputSize];
	StringBuilder sb = new StringBuilder();
	
	for(int z=0;z<nUserInputSize;z++) {
		nUserInput[z]= br.readLine();
	}
	int sum =0;
	for(int i=0;i<nUserInputSize;i++) {
		int cnt =0;
		sum = 0;
		for(int j =0; j< nUserInput[i].length();j++) {
			if(nUserInput[i].charAt(j)=='O') {
				cnt++;
			}else {
				cnt = 0;
			}
			sum+= cnt;		
		}		
		sb.append(sum).append('\n');	
	}
	System.out.print(sb);
	}
}
