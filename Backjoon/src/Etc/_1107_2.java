package Etc;

import java.util.Arrays;
import java.util.Scanner;

public class _1107_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int move_ch = sc.nextInt(); //이동할 채널 입력
		int min=1000001; // 버튼의 최솟 값
		int now_ch =100; //현재 채널
		int su=0;		// 버튼의 최솟 값으로 가기 위한 채널
		int min3 = now_ch-move_ch;	//현재 채널과 이동할 채널의 차이
		boolean[] moving_ch = new boolean[1000001]; // 버튼으로 이동 가능한 채널
		int broken_button_su = sc.nextInt(); // 고장난 버튼의 수
		int[] broken_button =new int[broken_button_su];
		Arrays.fill(moving_ch, true); // 버튼으로 이동 가능한 채널 true로 선언
		for(int i=0; i<broken_button_su; i++) {
			broken_button[i]=sc.nextInt(); // 고장난 버튼 입력
		}
		for(int i =0 ; i<1000001;i++) {	// 입력 가능 한 채널의 수 100만번 까지 ( 시청 가능한 채널은 50만)
			String num =String.valueOf(i);	// i를 문자열로
			String num2 = String.valueOf(move_ch); // 이동채널을 문자열로
			if(num2.length()+2 == num.length()) break; // 입력 채널과 이동 채널 문자열길이가 2차이나면 break;
			for(int n =0;n<num.length();n++) { // 자리수 체크
				for(int j =0; j<broken_button_su; j++) { // 고장난 버튼이랑 각 자리수 비교			
					if(broken_button[j] == Character.getNumericValue(num.charAt(n))) {
						moving_ch[i]=false;	// 고장난 버튼이 포함되어 있는 i는 false로 선언해서 이동불가
						break;
					}	
				}
			}
		}
		
		for(int i =0 ; i < 1000001; i++) {
			if(moving_ch[i] == true) { // 버튼으로 이동 가능한 채널들 중에서
				if(min>Math.abs(move_ch-i)) { 
					min = Math.abs(move_ch-i); // 최소 버튼수 지정
					su=i; // 최소 버튼일 경우의 채널 값
				}
			}
		}
		
		if(Math.abs(min3)<=min) {
			System.out.println(Math.abs(min3)); // 이동할 채널이 100번 과 같이 현재 채널 근처일 경우
		}
		else System.out.println(min+String.valueOf(su).length());	// 이동할 채널이 엄청 멀어요
		// 최소 버튼수 + 이동한 채널의 자릿수 
		
		//System.out.println(" min3 : "+min3+" min : "+min+" su : "+su);
		sc.close();
	}
	
}
