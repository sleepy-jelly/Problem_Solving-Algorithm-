import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main{

    static int MAXCARD;
    static int MAXNUM;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int maxCard = Integer.parseInt(st.nextToken());
        int maxNum = Integer.parseInt(st.nextToken());

        MAXCARD = maxCard;
        MAXNUM = maxNum;


        int[] card = new int[maxCard];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i =0; i <maxCard;i++){
            card[i] = Integer.parseInt(st.nextToken());



        }        


        
        System.out.println(check(card));










    }

    static public int check(int[]arr){
        int result = 0;
        int temp =0;
        for(int i =0; i <MAXCARD-2;i++){
            for(int j = i+1; j <MAXCARD-1;j++){
                for(int z=j+1; z<MAXCARD;z++){

                    temp= arr[i]+arr[j]+arr[z];


                    if(temp==MAXNUM){
                        
                        return temp;
                    }
                    if(result <temp &&temp <MAXNUM){
                        result= temp;
                    }

                }






            }



        }





        return result;
    }




}