import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			
			if(a>0) {
				if(b>0) {
					System.out.println(1);
					}
					else
					{
					System.out.println(4);
					}
				
				}
				else if(b>0) {
					System.out.println(2);
					}		
				else
					{
					System.out.println(3);
					}
		}
	}
}