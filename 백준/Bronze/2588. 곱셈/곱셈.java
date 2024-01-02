import java.util.Scanner;
public class Main {
	public static void main(String[]args) {		
		try (Scanner UserTextInput1 = new Scanner(System.in)) {			
			int a=UserTextInput1.nextInt();
			int b=UserTextInput1.nextInt();
			int resultab= a*b;
			String strNum =Integer.toString(b);
			int[]arrayNum= new int[strNum.length()];
			for(int i=0; i<strNum.length();i++) {
				arrayNum[i]=strNum.charAt(i)- '0';
				}
			for(int j=strNum.length()-1; j>-1;j--){
				System.out.println(a*arrayNum[j]);
			}		
			System.out.println(resultab);
		}	
	}
}

