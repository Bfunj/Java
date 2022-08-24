package Step04;



/*
 * 
 * 2022.08.24
 * 백현조
 * 평균
 * 점수 평균내기
 * tokenizer 참조 사이트 https://itdeveloper.tistory.com/53
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
		int i=0;
		int[] student = new int[1001];
		int sum=0;
		int rever=0;
		float rever2=0.0f;
		float count=0.0f;
		
		// 반복할 수 입력
		int test_case = Integer.parseInt(bf.readLine());
		
		for(int j=0; j<test_case;j++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()); // 입력받은 버퍼가 tokenizer st에 저장
			
			while(st.hasMoreTokens()) {
				student[i] = Integer.parseInt(st.nextToken());
				i++;
			} i=0;
			
			for(int k=1;k<student.length;k++) {
				sum += student[k];
				}
			rever=sum/student[0];		
			for(int k=1;k<student.length;k++) {
				if(student[k]>rever) {count++;}		
				}	
			rever2= (count*100)/student[0];
			count=0;
			bw.write(String.format("%.3f",rever2)+"%"+"\n");
			sum=0;
			rever=0;
			rever2=0;
			for (int k=1; k<student.length;k++) {
				student[k]=0;
			}	
		}

		bw.close();
	}				
}
