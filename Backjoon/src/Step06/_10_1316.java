package Step06;

/*
 * 
 * 2022.09.13
 * 백현조
 * 1316번 문제
 * 
 * 그룹단어체커
 * 
 * 입력
 * -첫째 줄에 단어의 개수 N이 들어온다. 
 * -N은 100보다 작거나 같은 자연수이다. 
 * -둘째 줄부터 N개의 줄에 단어가 들어온다. 
 * -단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 
 * -길이는 최대 100이다.
 * 
 * 
 * 출력
 * - 첫째 줄에 그룹 단어의 개수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		String str = bf.readLine();
		int alpa_num=0;
		int count=0;
		char[] alpa = new char[30];
		for(int i=0; i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i) != str.charAt(i+1)) { // 수정 해야함
				alpa[alpa_num]=str.charAt(i);
				alpa_num++;
				System.out.println("바뀜");
				System.out.println("alpa[0]"+alpa[0]);
				System.out.println("alpa[1]"+alpa[1]);
				System.out.println("alpa[2]"+alpa[2]);
				
			}
			for(int j=0; j<alpa_num-1;j++) {
				if(alpa[j] == alpa[alpa_num-1]) {
					System.out.println("실패");
				}
			}
		}
		System.out.println(count);
		// 현재문자와 다음문자 비교 비교후 다르면 현재문자 배열에 저장
		// 문자 비교후 다르면 배열에 저장후 이전에 저장된 배열과 문자비교 
		// 저장된 문자와 비교시 같은 문자가 있을 경우fail


	}//main end
}//class end 



