import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int nMax = Integer.parseInt(br.readLine());

        int result =0;

        int[][] arr = new int[100][100];


        for(int i=0; i<nMax;i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken()); 
            int y = Integer.parseInt(st.nextToken()); 
            for(int j=x; j<x+10;j++){
                for(int z=y;z<y+10;z++){
                        arr[j][z] = 1;
                }
            }    
        }

        for(int i =0; i<100;i++){
            for(int j=0;j<100;j++){
                result= result +arr[i][j];
            }
        }

        System.out.println(result);




    }
    
}
