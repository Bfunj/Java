package Step03;


/*
 * 
 * 2022.08.21
 * 백현조
 * 빠른 A+B 응용
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


public class _07 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int set = Integer.parseInt(bf.readLine());
		for(int i=1;i<=set;i++) {
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.close();
	}				
}



