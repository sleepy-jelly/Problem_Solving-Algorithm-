import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTotal =sc.nextInt();
		int nResult =0;
		
		int i= sc.nextInt();
		for(int j=0;j<i;j++) {
			nResult+= sc.nextInt()*sc.nextInt();	
		}
		if(nTotal==nResult)
			System.out.println("Yes");
		else {
			System.out.println("No");

		}
		sc.close();
	}

}
