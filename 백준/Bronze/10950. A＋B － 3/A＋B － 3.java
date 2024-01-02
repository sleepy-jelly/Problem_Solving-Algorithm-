import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		int userinputa= 0;
		int b,c =0;
		
		try (Scanner sc1 = new Scanner(System.in)) {
			userinputa=sc1.nextInt();
			for(int i=0; i<userinputa;i++) {
				b=sc1.nextInt();
				c=sc1.nextInt();
				System.out.printf("%d\n",b+c);
			}
		}
	}
}
