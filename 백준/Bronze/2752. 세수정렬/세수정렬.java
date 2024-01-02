import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        
       Scanner sc = new Scanner(System.in);

       int nData1 = sc.nextInt();
       int nData2 = sc.nextInt();
       int nData3 = sc.nextInt();
       int nTemp = 0;
        for(int i=0; i<3;i++){
        if(nData1<nData2){
            if(nData2<nData3){
                break;
            }
            else{
                nTemp=nData2;
                nData2= nData3;
                nData3= nTemp;
                }
            }
        else{
            nTemp= nData1;
            nData1= nData2;
            nData2 = nTemp;
            }
        }
   
        
    
            System.out.printf("%d %d %d",nData1,nData2,nData3);
            

        sc.close();
    }        
}
     