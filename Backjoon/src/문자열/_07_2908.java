package 문자열;

/*
 * 
 * 2022.09.13
 * 백현조
 * 2908번 문제
 * 단어 갯수
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class _07_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
	
		StringBuffer sb1 = new StringBuffer(st.nextToken());
		StringBuffer sb2 = new StringBuffer(st.nextToken());
		String str1 = sb1.reverse().toString();
		String str2 = sb2.reverse().toString();
		
		if (Integer.parseInt(str1)> Integer.parseInt(str2)) {
				System.out.println(str1);	
		}
		else System.out.println(str2);	
	}//main end
}//class end 



