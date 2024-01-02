import java.util.*;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader; //BufferedReader kind of Similar to Scanner
import java.io.BufferedWriter; //BufferedWriter kind of Similar to println
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader nBufferReader1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter nBufferWriter1 = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(nBufferReader1.readLine());
		
		
		for (int i = 1; i < N+1; N--) {
			System.out.println(N);
		}
		nBufferReader1.close();
		nBufferWriter1.flush();
		nBufferWriter1.close();

	}

}