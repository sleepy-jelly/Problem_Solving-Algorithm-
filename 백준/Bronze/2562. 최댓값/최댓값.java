import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nInputSize=9;
		int nLine= 0;
		Scanner sc = new Scanner(System.in);
	
		int[] nArrayInt = new int[nInputSize];
		int[] nArrayIntCopy = new int[nInputSize];
		
		for(int i =0; i<nInputSize;i++){
		if(nInputSize < -1) {
			break;
		}
			nArrayInt[i]=sc.nextInt();			
			 nArrayIntCopy[i]= nArrayInt[i];
		}
		Arrays.sort(nArrayInt);
		for(int j=0;j<nInputSize;j++) {
			if(nArrayInt[nInputSize-1]==nArrayIntCopy[j]) {
				nLine = j+1;
			}
		}
	
		System.out.printf("%d\n", nArrayInt[nInputSize-1]);
		System.out.printf("%d\n",nLine);
			
	}

}
