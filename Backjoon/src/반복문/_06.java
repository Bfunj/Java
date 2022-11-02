package 반복문;


/*
 * 
 * 2022.08.21
 * 백현조
 * 빠른 A+B 응용 1
 * BufferedReader 사용하기
 * Buffersdwriter 사용하기
 * StringTokenizer 사용하기
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int set = Integer.parseInt(bf.readLine());
		for(int i=1;i<=set;i++) {
		StringTokenizer st = new StringTokenizer(bf.readLine());
		bw.write("Case #"+i+": "+ (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
		}
		bw.close();
	}				
}



