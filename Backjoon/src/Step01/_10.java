package Step01;

import java.util.Scanner;

/*
 * 
 * 2022/08/19
 * 백현조
 * 체스판
 * 검정 체스 다있음 흰색 체스 몇개 없음
 * 킹1 퀸1 룩2 비숍2 나이트2 폰 8 구성
 * 흰수 갯수가 주어질때 몇개를 더하고 빼야하는지 출력
 * 
 */
public class _10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int[] chess = new int[6]; // 입력 받는 체수의 수
	int[] chess_su = {1,1,2,2,2,8}; // 체스 기본 구성 수
	
	// 체스의 피스 개수를 입력 받기
	for(int i =0;i<chess.length;i++) {
		chess[i] = sc.nextInt();
	}
	// 입력받은 피스 개수와 올바른 체스 개수를 비교
	for(int i=0 ; i<chess.length;i++) {
		chess_su[i] = chess_su[i]-chess[i];
		System.out.print(chess_su[i]+" ");
	}
	
	sc.close();
}
}
