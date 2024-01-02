import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			
			if(b>=45) {
				System.out.printf("%d %d",a,b-45);
					}else {
						a=a-1;
						if(a<0) {
							a=23;
						}
						System.out.printf("%d %d",a,b+15);
					}
		}	
	}
}