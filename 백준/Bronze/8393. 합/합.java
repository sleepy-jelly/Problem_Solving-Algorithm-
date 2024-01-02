import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int anresult = 0;
		int ncounter =0;
		try (Scanner sc1 = new Scanner(System.in)) {
			for(int n=sc1.nextInt(); 1<n;n--) {
				anresult += n-1;
				ncounter++;
			}
			anresult +=ncounter+1;
		}
		System.out.println(anresult);
	}

}
