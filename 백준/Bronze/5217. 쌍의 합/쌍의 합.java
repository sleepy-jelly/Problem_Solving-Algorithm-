
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        
       Scanner sc = new Scanner(System.in);
        int nTotalSize= sc.nextInt();
        int nData1=0;
        int nToggle = 0;

       for(int i=0; i<nTotalSize;i++){
        nData1=sc.nextInt();
        nToggle =0;
            System.out.print("Pairs for " + nData1+ ": ");
            for(int j=1; j<nData1;j++){
                for(int z=1; z<nData1;z++){
                    if(j+z==nData1&& j<z){
                        if(nToggle==0){
                            nToggle++;
                            System.out.print(j + " " + z);
                        } else{
                            System.out.print(", "+j+" "+z);
                        }
                        
                    }
                   
                }
        }
            System.out.println();
       }
   sc.close();
    }        
}
     