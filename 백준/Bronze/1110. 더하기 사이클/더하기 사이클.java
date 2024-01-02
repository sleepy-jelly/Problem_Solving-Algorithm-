import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,nCounter=0;
		a=sc.nextInt();
		int copy =a;
		while(true) {
			a = ((a%10)*10) + (((a/10)+(a%10))%10);
			nCounter++;
			if(a==copy) {
				break;
			}
		}
		 System.out.println(nCounter);
	}
}
