import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X =Integer.parseInt(br.readLine());
		int nCounterNum=0;
		int nTemp = 0;
		int[] arr;
		if(X<=99) {
			nCounterNum=X;
		}
		else {
			
		for(int i=X; i>=100;i--) {
			nTemp = i;
			 arr = new int [3];
			
			for(int j=2; j>=0;j--) {
				arr[j]= nTemp%10;
				nTemp=nTemp/10;
			}			
			if(arr[2] - arr[1] == arr[1] - arr[0] || arr[0] - arr[1] == arr[1] - arr[2]) {
				nCounterNum++;
			}
		}
		nCounterNum +=99;
		}
		if(X==1000) {
			nCounterNum--;
		}
		System.out.println(nCounterNum);
		
	}
}


