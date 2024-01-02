import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nSizeOfInt=sc.nextInt();
		int[] nCase = new int[nSizeOfInt];	
		for(int i =0; i<nSizeOfInt;i++) {
			nCase[i]=sc.nextInt();		
		}
		sc.close();
		Arrays.sort(nCase);
		System.out.printf("%d %d",nCase[0], nCase[nSizeOfInt-1]);
	}
}
