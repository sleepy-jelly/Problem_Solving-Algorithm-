import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());
        int star= max;
        int blank = 0;

        for(int i =0; i<max;i++){
            for(int z=0;z<blank;z++){
                System.out.print(" ");
            }
            blank++;
            for(int j=star; j>0;j--){
                System.out.print("*");

            }
            star--;
            System.out.print("\n");

        }




    }


}
