package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _10_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		int alpa_num=0;
		int count=0;
		boolean bk=false;
		char[] alpa = new char[30];
	
		for(int t=0 ; t<test; t++) {
		String str = bf.readLine();
		for(int i=0; i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i) != str.charAt(i+1)) { // 수정 해야함
				alpa[alpa_num]=str.charAt(i);
				alpa[alpa_num+1]=str.charAt(i+1);
				alpa_num++;
			}
			
			for(int j=0; j<alpa_num-1;j++) {
				if(alpa[j] == alpa[alpa_num]) {
					count--;
					bk=true;
				}
			}
			if(bk) {
				bk=false;
				break;
			}
		}
		alpa_num=0;
		Arrays.fill(alpa , ' ');
		}
		
		
		System.out.println(test+count);
	
	}//main end
}//class end 



