
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
		int nData=stringTokenizer.countTokens();

		System.out.println(nData);


		System.out.println();

		
	}

}
