import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nData1=sc.nextInt();
        int nData2=sc.nextInt();
        int nData3=sc.nextInt();
        int nPrize =0;


        if(nData1==nData2&&nData2==nData3){
            nPrize=10000+(nData1*1000);
        } else if(nData1==nData2||nData1==nData3||nData2==nData3) {
            if (nData1 == nData2 || nData1 == nData3) {
                nPrize = 1000 + (nData1 * 100);
            } else {
                nPrize = 1000 + (nData2 * 100);
            }
        }
        else{
            nPrize=Math.max(Math.max(nData1,nData2),nData3)*100;
        }
        System.out.println(nPrize);



    }
}