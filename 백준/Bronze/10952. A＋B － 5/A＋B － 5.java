import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b =0;
		int c= 1;
		while(c!=0) {
			a=sc.nextInt();
			c=a;
			b=sc.nextInt();
			if(a!=0||b!=0)
			 System.out.println(a+b);
		}
		

	}

}
