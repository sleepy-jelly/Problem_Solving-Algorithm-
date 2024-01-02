import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		int a= 0;
		try (Scanner sc1 = new Scanner(System.in)) {
			a=sc1.nextInt();
		}
		for(int i=1; i<10 ;i++) {
		System.out.printf("%d * %d = %d\n", a, i, a*i);
		}		
	}
}
