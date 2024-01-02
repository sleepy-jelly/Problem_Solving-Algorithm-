import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j =sc.nextInt();
		int nTotal=0;
		int nMin=0;
		boolean flag =false;
		for(;i<j+1;i++) {
			if(isPrimeNumber(i)==true&&flag==false) {
				nTotal=nTotal+i;
				nMin=i;
				flag=true;
			}else if (isPrimeNumber(i)==true){
				nTotal=nTotal+i;
			}
		}
		if(flag==false) {
			System.out.println("-1");
			return;
		}
		System.out.println(nTotal);
		System.out.println(nMin);

		sc.close();
	}
	static boolean isPrimeNumber(int nData) {
		boolean primeNumber= false;
		if(nData==1) {
			return primeNumber;
		}
		for(int i =2; i<nData;i++) {
			if(nData%i==0) {
				primeNumber= false;
				return primeNumber;
			}
		}
		primeNumber = true;
		return primeNumber;
	}
}

