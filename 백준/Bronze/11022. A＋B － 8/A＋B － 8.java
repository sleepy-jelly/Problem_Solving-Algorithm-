import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		int nUserIntInput1,nUserIntInput2,nUserIntInput3 =0;
		try (Scanner newUserIntInput = new Scanner(System.in)) {
			nUserIntInput1=newUserIntInput.nextInt();
				for(int i=0; i<nUserIntInput1;i++) {
				nUserIntInput2=newUserIntInput.nextInt();
				nUserIntInput3=newUserIntInput.nextInt();
				System.out.printf("Case #%d: %d + %d = %d\n",i+1,nUserIntInput2,nUserIntInput3,nUserIntInput2+nUserIntInput3);
		}
		

			
			
		}
	}

}