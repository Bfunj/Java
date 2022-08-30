package Test_2022_08_30;

import java.util.Scanner;

/*
 * 
 * 
 * 2022.08.30
 * 백현조
 * 첫째 줄에는 별 1개 , 둘째 줄에는 별 2개 N번째 줄에는 별 N개를 찍는 문제
 * 추가사항 : 오른쪽 정렬로 출력할 것
 * 추가사항 : 공백에 색없는 별 추가
 * 추가사항 : 가운데 정렬 그리고 1. 3. 5 순으로 2개씩 증가하는 모양 추가
 * 입력 조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력 조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 */
public class Star_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N= sc.nextInt(); // 입력받은 숫자 N에 저장
		if(N>=1 && N<=100)	// N이 1 이상 100 이하 일때만 동작 수행
		{
			for (int i=0 ; i< N; i++) {		//N번 동작 수행
				for(int k=1; k<N-i;k++) {	//N-i 번만큼 ☆ 출력
					System.out.print("☆");
				}
				for(int j=0; j<=i;j++) {	// i번만큼 ★ 출력
					System.out.print("★");
				}
			System.out.println();	// 줄바꿈
			} // for문 완료
			System.out.println();	//줄바꿈
			// 중앙 정렬 시작
			for (int i=0 ; i< N; i++) {	// N번 동작 수행
				for(int k=1; k<N-i;k++) {
					System.out.print("☆");	//중앙을 기준으로 좌측 N-i번 만큼  ☆ 출력
				}
						for(int j=0; j<=2*i;j++) {
					System.out.print("★");	// 중앙 ★ 출력
				}
				for(int k=1; k<N-i;k++) {
					System.out.print("☆");	//중앙을 기준으로 우측 N-i번 만큼 ☆ 출력
				}
			System.out.println(); // 줄 바꿈
			}
		}	
		sc.close();
	}
}
