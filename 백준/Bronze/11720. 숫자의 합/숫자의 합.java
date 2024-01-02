import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int nTotalSizeOfLines = sc.nextInt();
		String nSize = sc.next();
		int sum= 0;
		for(int i =0;i<nTotalSizeOfLines;i++) {
			sum+=(nSize.charAt(i)-48);	
		}
		System.out.println(sum);		
		sc.close();

	}

}
