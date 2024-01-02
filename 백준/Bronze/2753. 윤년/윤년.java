import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			if(a%4==0&&(a%100!=0||a%400==0)) {
				System.out.println("1");
			}else 
				System.out.println("0");
			}
			
	}

}
