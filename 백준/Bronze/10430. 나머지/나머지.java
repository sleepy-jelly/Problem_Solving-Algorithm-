import java.util.Scanner;
public class Main {
public static void main(String[]args) {
try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			int c=UserTextInput1.nextInt();
			System.out.println((a+b)%c);
			System.out.println(((a%c)+(b%c))%c);
			System.out.println((a*b)%c);	
			System.out.println(((a%c)*(b%c))%c);
        }
    }
}	