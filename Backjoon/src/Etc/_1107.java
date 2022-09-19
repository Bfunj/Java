package Etc;


import java.util.Scanner;

public class _1107 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Move_ch= sc.nextInt(); // 이동할 채널
		int unmove_num_su= sc.nextInt(); // 사용불가한 버튼의 수
		int[] unmove_num = new int [unmove_num_su]; // 사용불가한 버튼
		int[] move_num = {0,1,2,3,4,5,6,7,8,9};
		int[] M_num= new int [11-unmove_num_su];
		int M=0;
		for(int i=0; i<unmove_num.length;i++) {
			unmove_num[i] = sc.nextInt(); // 사용불가한 버튼	
			}
		for(int i=0 ;i<unmove_num.length;i++) {
			move_num[ unmove_num[i] ] =100;
		}/*
		for(int i=0;i<M_num.length;i++) {
				if(move_num[i]<100) {
					M_num[M] = move_num[i];
					M++;
			}
		}*/
		System.out.println("d");
		for(int i=0;i<move_num.length;i++) {
		System.out.println(move_num[i]);
		}
	
		/*
		int Start_ch=100; // 현재 채널
		String Move_ch_S = Integer.toString(Move_ch); // 이동할 채널을 문자열로 변환
		char[] Move_ch_C = new char[Move_ch_S.length()]; // 문자열을 문자로 변환
		for(int i = 0; i<Move_ch_S.length();i++) {
			Move_ch_C[i]=Move_ch_S.charAt(i);
		}
		
		for( int i = 0 ; i <unmove_num_su;i++) {
			if(Move_ch_C[0]-48 == unmove_num[i]) {
				System.out.println("첫번째 자리 버튼이 안눌러짐");
			}
		}
		
		System.out.println(Move_ch_C[0]-48);*/
	
		sc.close();
	}

}
