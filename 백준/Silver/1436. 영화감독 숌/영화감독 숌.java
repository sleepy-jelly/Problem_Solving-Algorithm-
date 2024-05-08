import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        int numberForLooking = 666;
        int count = 1;


        while(count != param) {
			numberForLooking++;
			if(String.valueOf(numberForLooking).contains("666")) {
				count++;
			}
		}

        sc.close();
        System.out.println(numberForLooking);





    }

}