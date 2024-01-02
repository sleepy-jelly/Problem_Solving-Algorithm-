
public class Main {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		int n =0 ;
		for(int i=0; i<10001; i++) {
		n= findSelfNum(i);
		if(n<10001) {
			check[n]=true;
		}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}	
		}
		System.out.println(sb);
	}
public static int findSelfNum(int number) {
	int sum= number;
	while(number != 0){
		 sum =sum+(number%10);
		 number= number/10;	 
	}
	return sum;	
}
}