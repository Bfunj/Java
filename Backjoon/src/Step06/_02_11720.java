package Step06;


/*
 * 
 * 2022.08.26
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

public class _02_11720 {
	
	public static void main(String[] args) throws IOException {
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int sum=0;
	
	int set = Integer.parseInt(bf.readLine());
	int[] ii= new int[set];
	
	String s =bf.readLine();
	for(int j=0; j<ii.length;j++) {
		ii[j] =  Integer.parseInt(s.substring(j,j+1));
		sum += ii[j];
	}
	
	bw.write(sum+"\n");
	bw.close();
	
	}
}
