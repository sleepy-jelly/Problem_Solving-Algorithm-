import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args)throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		
		int speedOfSnail = Integer.parseInt(st.nextToken());
		int fallingValue = Integer.parseInt(st.nextToken());
		int totalHeight = Integer.parseInt(st.nextToken());
		
		int day =(totalHeight-fallingValue)/(speedOfSnail-fallingValue);
		
		if((totalHeight-fallingValue)%(speedOfSnail-fallingValue)==0) {
		}else {
			day++;
		}
			System.out.println(day);
		
	}

}


/**

해답2 	17692KB	204ms
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int speedOfSnail = sc.nextInt();
		int fallingValue = sc.nextInt();
		int totalHeight = sc.nextInt();
		
		int day =(totalHeight-fallingValue)/(speedOfSnail-fallingValue);
		
		if((totalHeight-fallingValue)%(speedOfSnail-fallingValue)==0) {
		}else {
			day++;
		}
			System.out.println(day);
		
		sc.close();
	}

}

*/
