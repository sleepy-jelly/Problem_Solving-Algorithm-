import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int nSizeLocal = 0;
		String nString ="Null";
		for(int i = 0; i<nSize;i++) {
			nSizeLocal=sc.nextInt();
			nString = sc.next();
			int j =0;
			for(j=0; j<nString.length();j++) {
				for(int z=0; z<nSizeLocal;z++) {
				System.out.print(nString.charAt(j));
				}
				
			}
			System.out.printf("\n");
				
		}
		
		
		
		
		sc.close();
	}

}