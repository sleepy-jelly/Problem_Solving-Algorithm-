import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        
       Scanner sc = new Scanner(System.in);

        
        
        
            while(true){
                int nData= sc.nextInt();
                int nData2= sc.nextInt();
                if(nData==0&&nData2==0){
                    break;
                }
                if (nData>nData2){
                    
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }

            sc.close();
            
        }
     
    }
