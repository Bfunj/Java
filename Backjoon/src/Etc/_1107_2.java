package Etc;

import java.util.Arrays;
/*
 move_ch : 이동할 채널(String)
dont_bt.length : 고장난 버튼의 수(String)
dont_bt[] : 고장난 버튼의 배열(String)

1. 고장난 수랑 같은가?

1.1 같으면 
비교하는 숫자에 +1, -1 이후 1번 시작

1.2 없으면 숫자 저장


 */
import java.util.Scanner;

public class _1107_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int move_ch = sc.nextInt();
		int min=500000;
		
		int now_ch =100;
		boolean[] moving_ch = new boolean[1000000];
		int broken_button_su = sc.nextInt();
		int[] broken_button =new int[broken_button_su];
		Arrays.fill(moving_ch, true);
		for(int i=0; i<broken_button_su; i++) {
			broken_button[i]=sc.nextInt();
		}
	
		for(int i =0 ; i<1000000;i++) {	
			String num =String.valueOf(i);	// 0부터 50만까지 문자열로변환	
			String num2 = String.valueOf(move_ch);
			if(num2.length()+1 == num.length()) break;
			for(int n =0;n<num.length();n++) { // 자리수 체크
				for(int j =0; j<broken_button_su; j++) { // 고장난 버튼이랑 각 자리수 비교			
					if(broken_button[j] == Character.getNumericValue(num.charAt(n))) {
						moving_ch[i]=false;				
					}	
				}
			}
		}

		for(int i =0 ; i < 500001; i++) {
			if(moving_ch[i] == true) {
				if(min>Math.abs(move_ch-i)) {
					min = Math.abs(move_ch-i);
				}
			}
			
		}
		
		System.out.println(min);
		
	
		
		
		
		
	

	
	}
	
}
