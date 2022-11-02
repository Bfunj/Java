package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _baek_10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		int N = Integer.parseInt(bf.readLine());
		int[] arry= new int[201];
		int su=0;
		StringTokenizer st = new StringTokenizer(bf.readLine()); // 입력받은 버퍼가 tokenizer st에 저장
		while( st.hasMoreTokens() ) {		
			 su=Integer.parseInt(st.nextToken());			 
			 if(su<0) {
				 su=su*(-1);
				 arry[su+100]++;
			 }
			 else arry[su]++;
			}
		int v = Integer.parseInt(bf.readLine());
		if(v<0) {
			v=v*(-1);
			System.out.println(arry[v+100]);
		}else {
			System.out.println(arry[v]);
		}
	}
}
