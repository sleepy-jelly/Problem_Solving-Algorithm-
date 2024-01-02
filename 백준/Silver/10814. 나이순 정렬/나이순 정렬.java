import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;
public class Main {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nMax =Integer.parseInt(br.readLine());
		
		String[][] arr = new String[nMax][2];
		
		for(int i =0; i<nMax;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0]= st.nextToken();
			arr[i][1]= st.nextToken();
		}
		Arrays.sort(arr,new Comparator<String[]>(){
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
		});
		
		StringBuilder sb= new StringBuilder();
		
		for(int i =0; i <nMax;i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
		

	}

}
