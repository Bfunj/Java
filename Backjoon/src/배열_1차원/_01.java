package 배열_1차원;

/*
 * 
 * 2022.08.23
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
		StringTokenizer st = new StringTokenizer(bf.readLine()); // 입력받은 버퍼가 tokenizer st에 저장
		int[] arry= new int[set];		
		for(int i=0;i<set;i++) {		
		arry[i] = Integer.parseInt(st.nextToken());		
		}
		
		int max=arry[0];
		int min=arry[0];
		
		for(int j=0; j<arry.length;j++) {
			if(arry[j]>max)max=arry[j];
			if(arry[j]<min)min=arry[j];
		}
		bw.write(min+" ");
		bw.write(max+"\n");
			
		bw.close();
	}				
}
