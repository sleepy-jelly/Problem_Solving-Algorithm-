import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int maxNum = getGcd(num1, num2); 
		
        System.out.println(maxNum);
        System.out.println(num1*num2/maxNum);


        sc.close(); 
    

    }

    public static int getGcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		return getGcd(num2, num1 % num2);
	}

}