package 정렬;

import java.util.Scanner;

/*
 * 2022.10.17
 * 통계학
 * 백현조
 * 
 * 입력
 * - 첫째 줄에 정렬하려고 하는 수 N이 주어진다.
 * - N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * - 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * 
 *  공략
 *  - 람다식 활용
 * 
 */


public class _07_11650 {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] xy = new int[num][2];	
		for(int x=0; x<num ; x++) {
			for(int y=0;y<2;y++) {
				xy[x][y]=sc.nextInt();
			}
		}
		
		
		
		//출력
		for(int x=0; x<num ; x++) {
			System.out.print(xy[x][0]+" ");
			System.out.println(xy[x][1]);
		}
		sc.close();

	}
}// class end






