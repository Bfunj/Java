package 문자열;

/*
 * 
 * 2022.09.13
 * 백현조
 * 5622번 문제
 * 다이얼
 * 
 * 입력
 * -첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다.
 * -단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 
 * 출력
 * -첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _08_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		String str = bf.readLine();
		int count =0;
		for(int i=0; i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'A': case 'B': case 'C': count +=3;
			break;
			case 'D': case 'E': case 'F': count +=4;
			break;
			case 'G': case 'H': case 'I': count +=5;
			break;
			case 'J': case 'K': case 'L': count +=6;
			break;
			case 'M': case 'N': case 'O': count +=7;
			break;
			case 'P': case 'Q': case 'R': case 'S': count +=8;
			break;
			case 'T': case 'U': case 'V': count +=9;
			break;
			case 'W': case 'X': case 'Y': case 'Z': count +=10;
			break;
			}
		}
		System.out.println(count);
	}//main end
}//class end 



