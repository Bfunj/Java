package Step08;


/*
 * 
 * 2022.09.02
 * 백현조
 * 1929번 소인수분해
 * 
 * 소수구하기
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class _04_1929 {
	public static void main(String[] args)  throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		
		int number_start = Integer.parseInt(st.nextToken());
		int number_end =Integer.parseInt(st.nextToken());
		int count=0;
	
		for(int j=0;j<=number_end-number_start;j++) {
			
			for(int i=1; i<=Math.sqrt(number_start+j); i++ ) {
				if((number_start+j)%i==0) count ++;
				if(count >1) break;
				}
			if(count ==1) {
				if(number_start+j>1) {
				System.out.println(number_start+j);}
				}
			count=0;
		}
	}
}
