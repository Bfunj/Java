package Step08;



/*
 * 
 * 2022.09.01
 * 백현조
 * 2581번 문제 N 부터 M 사이의 소수 찾기 그리고 소수의 합과 최댓값 구하기
 * 
 */

import java.util.Scanner;
public class _02_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int start_number = sc.nextInt();
		int last_number = sc.nextInt();

		int[] sosu = new int[last_number-start_number];
		
		int count =0;
		int sum =0;
		int min =100001;
		
		for(int i=0; i<=sosu.length; i++) {
			
			if(start_number + i >1) {
			for(int j=1 ;j<=Math.sqrt(start_number + i);j++) {
				if( (start_number + i) %j ==0) count ++;
				}
			}
			if (count == 1) { 
				sum += (start_number + i);
				if( start_number + i < min ) min = start_number + i ;
			}
			count =0;
		}
		if(sum==0)System.out.println(-1);
		else {
		System.out.println(sum);
		System.out.println(min);
		}
		sc.close();
	}
}
