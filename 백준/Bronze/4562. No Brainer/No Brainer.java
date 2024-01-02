
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        
       Scanner sc = new Scanner(System.in);

        
        
        int nTotal = sc.nextInt();
            for(int i= 0; i<nTotal;i++){
                int nData= sc.nextInt();
                int nData2= sc.nextInt();
              
                if (nData>=nData2){
                    
                    System.out.println("MMM BRAINS");
                }else{
                    System.out.println("NO BRAINS");
                }
            }
            
          

            sc.close();
            
        }
     
    }
