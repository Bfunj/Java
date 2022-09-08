package Step06;

/*
 * 
 * 2022.08.26
 * 백현조
 * 1157번 문제
 * 단어 공부
 * 제일 많이 중복된 알파벳 출력 . 제일 많은 알파벳이 두개 이상이면 ? 출력
 * 
 * 
 * 메모리... 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _05_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine();
		
		int[] stack = new int[26];
		Arrays.fill(stack , 0);
		for(int i=0 ;i<str.length() ; i++)
		{
			if('A'<= str.charAt(i) && str.charAt(i)<='Z') {
				stack[str.charAt(i)-'A']++;
			}else {stack[str.charAt(i)-'a']++;}
		}
		System.out.println(stack[0]);
		
	}//main end
}//class end 





/*

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