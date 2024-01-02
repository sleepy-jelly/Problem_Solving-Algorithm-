import java.util.Scanner;
public class Main{
	public static void main(String[]args) {

try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			double result = (a*1.0)/b;
			System.out.println(result);
			}		
		}
	}		