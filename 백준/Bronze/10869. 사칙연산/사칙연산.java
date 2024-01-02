import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
        
        try (Scanner UserTextInput1 = new Scanner(System.in)) {
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			int result = a/b;
			System.out.println(result);		
			result =a%b;
			System.out.println(result);
			}		
		}
}
				  	 