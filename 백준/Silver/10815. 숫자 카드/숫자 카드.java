import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        int nCount = 0;
        nCount = sc.nextInt();  

        HashSet<Integer> cardHashSet = new HashSet<Integer>();

    
        for (int i= 0; i <nCount; i++){
            int curNum = sc.nextInt();
            cardHashSet.add(curNum);    
        }

        int mCount = 0;
        mCount = sc.nextInt();  

        for (int i= 0; i <mCount; i++){
            int numForChk = sc.nextInt();
            if(cardHashSet.contains(numForChk)){
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

        sc.close();

    }
}
