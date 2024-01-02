import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String Str = br.readLine();
        int nTotalTime = 0;
        for(int i=0; i<Str.length();i++){
            char change =Str.charAt(i);
            int nNum= change;
            switch (nNum){
                case 65:
                case 66:
                case 67:
                    nTotalTime+= 3;
                    break;


                case 68:
                case 69:
                case 70:
                    nTotalTime+= 4;
                    break;
                case 71:
                case 72:
                case 73:
                    nTotalTime+= 5;
                    break;
                case 74:
                case 75:
                case 76:
                    nTotalTime+= 6;
                    break;
                case 77:
                case 78:
                case 79:
                    nTotalTime+= 7;
                    break;
                case 80:
                case 81:
                case 82:
                case 83:
                    nTotalTime+= 8;
                    break;
                case 84:
                case 85:
                case 86:
                    nTotalTime+= 9;
                    break;
                case 87:
                case 88:
                case 89:
                case 90:
                    nTotalTime+= 10;
                    break;
                default:
                    break;
            }
        }
        System.out.println(nTotalTime);
    }
}
