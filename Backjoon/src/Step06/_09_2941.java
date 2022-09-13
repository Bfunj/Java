package Step06;

/*
 * 
 * 2022.09.13
 * 백현조
 * 2941번 문제
 * 
 * 크로아티아 알파벳
 * 
 * 입력
 * - 첫째 줄에 최대 100글자의 단어가 주어진다.
 * - 알파벳 소문자와 '-', '='로만 이루어져 있다.
 * - 단어는 크로아티아 알파벳으로 이루어져 있다.
 * - 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 * 
 * 
 * 출력
 * - 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _09_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		String str = bf.readLine();
		int count =0;
		
			for(int i=0; i<str.length(); i++) {
				count++;
				if( i+1<str.length()) {
					switch(str.substring(i,i+2)) {
					case "c=":
					case "c-":
					case "d-":
					case "lj":
					case "nj":
					case "s=":
					case "z=":
						count--;
					break;
					}
				} 
				if( i+2<str.length()) {
					switch(str.substring(i,i+3)) {
					case "dz=": count--;
					break;
							}
						}
				}
			System.out.println(count);

	}//main end
}//class end 



