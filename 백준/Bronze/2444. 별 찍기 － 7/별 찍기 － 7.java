

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int totalLine= 0;
        int currentLine =1;
        totalLine= sc.nextInt();


        for(int i=0; i<totalLine; i++){
            
            for(int space=totalLine-currentLine;space>0;space--){
                System.out.print(" ");


            }
             

           
            for(int star =0; star<currentLine*2-1; star++){
                System.out.print("*");


            }
            

            System.out.println();


            currentLine++;
        }

        currentLine--;


        for(int i =0; i<totalLine-1; i++){
            currentLine--;
            for(int space=totalLine-currentLine;space>0;space--){
                System.out.print(" ");
            }
            for(int star =currentLine*2-1; star>0; star--){
                System.out.print("*");


            }
            System.out.println();

           
        }













        sc.close();
    }

}
