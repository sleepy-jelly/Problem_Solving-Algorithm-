import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nTotalDataSize= Integer.parseInt(br.readLine());
	
		double nCounter =0;
		double nSum= 0;
		double nAverage =0.0;
	for(int i =0; i<nTotalDataSize;i++) {	
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int nDataLineSize = Integer.parseInt(st.nextToken());
		int[] nData= new int[nDataLineSize];
		nSum=0;
		nCounter=0;
			for(int j = 0; j<nDataLineSize;j++) {
				nData[j] =Integer.parseInt(st.nextToken());
				nSum += nData[j];		
				}
		nAverage= nSum/nDataLineSize;
			for(int z=0; z<nDataLineSize;z++) {
			if(nData[z]>nAverage) {
				nCounter++;
			}
			}
			double b=nCounter/nDataLineSize*100;
			System.out.printf("%.3f%%\n",b);
		}	
	}

}
