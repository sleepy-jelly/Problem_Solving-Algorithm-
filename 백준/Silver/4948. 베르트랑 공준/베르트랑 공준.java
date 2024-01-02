import java.util.Scanner;
public class Main {

	public static boolean[] dp;
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int primeCnt = 0;
		int n = 1;
		while(n!=0) {
			n= sc.nextInt();
			int nMax = n*2;
			dp = new boolean[n*2+1];

			isPrimeQuick(dp);
		
			primeCnt=0;
			
			for(int i=n+1;i<=nMax;i++) {
				if(dp[i]==false) {
					primeCnt++;
				}
			}
			if(n!=0) {
				System.out.println(primeCnt);
			}
			primeCnt=0;
		}
		
			
		
		
		
		
		
		
		sc.close();
		
	}
	static void isPrimeQuick(boolean[] dp) {
		
		dp[0] =true;
		if(dp.length>1) {
		dp[1] = true;
		}
			for(int i =2; i<Math.sqrt(dp.length);i++){
				if(dp[i]) {
					continue;
				}
					for(int j=i*i; j<dp.length;j=j+i) {
					dp[j]=true;
					}
				
				
			}
	}
}