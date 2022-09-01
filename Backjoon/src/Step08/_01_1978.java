package Step08;



/*
 * 
 * 2022.09.01
 * 백현조
 * 1978번 문제 소수 찾기
 * 
 */

import java.util.Scanner;
public class _01_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int[] sosu = new int[N];
		int count =0;
		int result =0;
		for(int i=0; i<sosu.length; i++) {
			sosu[i] = sc.nextInt();
			if(sosu[i] >1) {
			for(int j=1 ;j<=Math.sqrt(sosu[i]);j++) {
				if(sosu[i]%j ==0) count ++;
			}
			}
			if (count == 1) result ++;
			count =0;
			
		}
		
		System.out.println(result);
		sc.close();
	}
}
