import java.util.Scanner;
public class Main {

	public static boolean[] dp;
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int nMin = sc.nextInt();
		int nMax = sc.nextInt();
		
		dp = new boolean[nMax+1];

		isPrimeQuick(dp);
				
		for(int i=nMin;i<nMax+1;i++) {
			if(dp[i]==false) {
				System.out.println(i);
			}
		}
		sc.close();
		
	}

	static void isPrimeQuick(boolean[] dp) {
		
		dp[0] =true;
		dp[1] = true;
		
			for(int i =2; i<Math.sqrt(dp.length);i++){
				if(dp[i])continue;
					for(int j=i*i; j<dp.length;j=j+i) {
					dp[j]=true;
					}
				
				
			}
	}
}