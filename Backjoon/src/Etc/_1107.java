package Etc;


import java.util.Scanner;

public class _1107 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Move_ch= sc.nextInt(); // 이동할 채널
		int unmove_num_su= sc.nextInt(); // 사용불가한 버튼의 수
		int[] unmove_num = new int [unmove_num_su]; // 사용불가한 버튼
		int[] move_num = {0,1,2,3,4,5,6,7,8,9};
		int[] M_num= new int [10-unmove_num_su]; //사용 가능한 버튼
		String result="";
		int M=0;
		// 사용불가능한 버튼 입력
		for(int i=0; i<unmove_num.length;i++) {
			unmove_num[i] = sc.nextInt(); // 사용불가한 버튼	
			}
		// 사용불가능한 버튼 정의
		for(int i=0 ;i<unmove_num.length;i++) {
			move_num[ unmove_num[i] ] =100;
		}
		// 사용가능한 버튼 배열 설정
		for(int i=0;i<10;i++) {
				if(move_num[i]<100) {
					M_num[M] = move_num[i];
					M++;
			}
		}
	
		int Start_ch=100; // 현재 채널
		String Move_ch_S = Integer.toString(Move_ch); // 이동할 채널을 문자열로 변환
		char[] Move_ch_C = new char[Move_ch_S.length()]; // 문자열을 문자로 변환
		for(int i = 0; i<Move_ch_S.length();i++) {
			Move_ch_C[i]=Move_ch_S.charAt(i);
		}
		
		for( int i = 0 ; i <M_num.length;i++) {
			if(Move_ch_C[0]-48 == M_num[i]) {
				System.out.println("첫번째 자리 버튼 눌러짐");
				result += Integer.toString(M_num[i]);
			}
		}
		for( int i = 0 ; i <M_num.length;i++) {
			if(Move_ch_C[1]-48 == M_num[i]) {
				System.out.println("두번째 자리 버튼 눌러짐");
				result += Integer.toString(M_num[i]);
			}
		}
		
		System.out.println(result);
		
	
		sc.close();
	}
	
	

}
