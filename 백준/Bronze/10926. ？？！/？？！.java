import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String newId = br.readLine();
		System.out.printf("%s??!\n",newId);
	}

}
