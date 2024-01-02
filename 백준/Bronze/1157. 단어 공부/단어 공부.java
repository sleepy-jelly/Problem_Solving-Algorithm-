import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wholeLine = sc.nextLine();
		int lineSize = wholeLine.length();
		int[] nArray =  new int [26];  //0~25 = a~z;
		
		for(int i = 0; i<lineSize;i++) {
			if (65 <= wholeLine.charAt(i) && wholeLine.charAt(i) <= 90) {
				nArray[wholeLine.charAt(i) - 65]++;	
				}
		
			else {	
				nArray[wholeLine.charAt(i) - 97]++;
			}
		 
		}
		
		int max = -1;
		
		char nch = '?';
		
		for(int j=0;j<26;j++) {
			if(nArray[j]>max) {
				max = nArray[j];
				nch = (char) (j+65);
			} else 
			if(nArray[j]==max){
				nch= '?';
				
			}
			
			
			
		}
		
		
		
		System.out.print(nch);
		
		
		
		
		
		sc.close();
		
		
	}

}