package Step04;

/*
 * 
 * 2022.08.22
 * 백현조
 * 최대값 최소값 찾기
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class _01 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int set = Integer.parseInt(bf.readLine());
		for(int i=0;i<set;i++) {
		int[] arry= new int[set];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		arry[i] = Integer.parseInt(st.nextToken());
		
		bw.write(arry[i]+"\n");
		}
		System.out.println(arry[0]);
		
		
		bw.close();
	}				
}
