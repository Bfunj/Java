package 문자열;

/*
 * 
 * 2022.09.13
 * 백현조
 * 1152번 문제
 * 단어 갯수
 * 
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 
 * -입력
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
 * 이 문자열의 길이는 1,000,000을 넘지 않는다.
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
 * 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 
 * 
 * -출력
 * 첫째 줄에 단어의 개수를 출력한다.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class _06_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		int count = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			count ++;
		}
		System.out.println(count);	
	}//main end
}//class end 





/*
// 메모리 문제 코딩
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			String str = br.readLine();
			int[] co = new int['z'-'a'+1];
			int max=0;
			int count=0;
			int count2=0;
			char A = 'A';
			for(int i=0 ; i<str.length(); i++) {
				for(int j=0; j<co.length; j++) {		
				if( (str.substring(i,i+1)).charAt(0) == A +j || (str.substring(i,i+1)).charAt(0) == A +j +32 ){
							co[j]++;
					}
				}
			}	
			
			for(int i = 0 ; i < co.length; i++) {
				if(co[i]>max) {
				max = co[i];
				count = i;
				}
			}
			for(int i = 0 ; i < co.length; i++) {
				if(max == co[i]) {	
				count2 ++;
				}
			}
			if(count2 == 1)System.out.println((char)(A+count));
			else System.out.println("?");


*/