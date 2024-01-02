import java.util.Scanner;
public class Main{
public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        int N2 =in.nextInt();
		int N3[] = new int[N];
		for(int i=0; i<N; i++) {
			N3[i]=in.nextInt();
		}
		in.close();
		
		for(int i=0; i<N; i++) {
			if(N3[i]<N2) {
				System.out.printf("%d ",N3[i]);
		}	
		}
		
}
}
