package Step06;


/*
 * 
 * 2022.08.25
 * 백현조
 * 11720번 문제
 * 숫자의 합
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _02_11720 {
	
	public static void main(String[] args) throws IOException {
	

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int i=0;
	int sum=0;
	
	int set = Integer.parseInt(bf.readLine());
	StringTokenizer st = new StringTokenizer(bf.readLine(),"");
	
	while(st.hasMoreTokens()) {
	i = Integer.parseInt(st.nextToken());
	sum +=i;
	}
	bw.write(sum+"\n");
	bw.close();
	
	
	}
}
