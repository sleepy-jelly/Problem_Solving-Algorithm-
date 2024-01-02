import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int int1 =sc.nextInt();
        int int2= sc.nextInt() + sc.nextInt();
  
        

        int hour= 24;
        int min =60;
        while(int2>=min){
            int1=int1+1;
                int2=int2-60;
        }
        while(int1>=hour){
            int1= int1-24;
        }

        System.out.println(int1+" "+(int2));
    }
}