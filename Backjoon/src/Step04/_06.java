package Step04;



/*
 * 
 * 2022.08.23
 * 백현조
 * 평균
 * ox 문제
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
		
		int[] student = new int[1001];
		int test_case = Integer.parseInt(bf.readLine());
		for (int i=0; i<test_case;i++) {
		StringTokenizer st = new StringTokenizer(bf.readLine()); // 입력받은 버퍼가 tokenizer st에 저장
		
		for(int i )
		student[i] = Integer.parseInt(st.nextToken());	
		
		
		
		}
		bw.write(min+" ");
		bw.write(max+"\n");
			
		bw.close();
	}				
}
