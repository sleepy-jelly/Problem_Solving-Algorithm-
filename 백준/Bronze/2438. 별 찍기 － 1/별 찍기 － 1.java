import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		int j = 0;
		int nUserIntInput1,nUserIntInput2,nUserIntInput3 =0;
		try (Scanner newUserIntInput = new Scanner(System.in)) {
			nUserIntInput1=newUserIntInput.nextInt();
			for(int i=0; i<nUserIntInput1;i++) {
				j++;
				for(int a=0; a<j;a++) {
				System.out.printf("*");		
				}
				System.out.printf("\n");
			}
		}

	}
}

