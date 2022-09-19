package Etc;


import java.util.Scanner;

public class _1107_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Move_ch = sc.nextInt();
		int[] DontButton = new int[sc.nextInt()];
		for(int i=0;i<DontButton.length;i++) {
			DontButton[i] = sc.nextInt();
			}
		Boolean Button =false;
		String result_su="";
		int Start_ch=100; // 현재 채널
		String Move_ch_S = Integer.toString(Move_ch); // 이동할 채널을 문자열로 변환
		char[] Move_ch_C = new char[Move_ch_S.length()]; // 문자열을 문자로 변환
		for(int i = 0; i<Move_ch_S.length();i++) {
			Move_ch_C[i]=Move_ch_S.charAt(i);
		}
		
		
		// 첫째 자리에 움직일수 없는 버튼이 있는가?
		for(int i=0;i<DontButton.length;i++) {
			if(DontButton[i] == Move_ch_C[0]) Button=true;
		}
			if(Button =false) result_su+=Move_ch_C[0];
			else {
				
				
				
			}
			
		

		sc.close();
	}
	
	
	
	
}
