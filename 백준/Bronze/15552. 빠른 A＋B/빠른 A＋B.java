import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader; //BufferedReader kind of Similar to Scanner
import java.io.BufferedWriter; //BufferedWriter kind of Similar to println
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader nBufferReader1 = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter nBufferWriter1 = new BufferedWriter(new OutputStreamWriter(System.out));


	int N = Integer.parseInt(nBufferReader1.readLine());
    
	StringTokenizer st;

	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(nBufferReader1.readLine()," ");
		nBufferWriter1.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
	}
	nBufferReader1.close();
	nBufferWriter1.flush();
	nBufferWriter1.close();
	
}
}