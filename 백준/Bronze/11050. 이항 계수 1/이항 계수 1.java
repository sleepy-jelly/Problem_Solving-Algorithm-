import java.util.Scanner;

public class Main{
public static void main(String[]args){
    

        Scanner sc = new Scanner(System.in);
        
        int N, K;

        N = sc.nextInt();
        K = sc.nextInt();
        
	    System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));

        
        sc.close();
    }   

    static int factorial(int N) {
        if(N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }

}