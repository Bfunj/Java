package Step08;

/*
 * 
 * 2022.09.01
 * 백현조
 * 11653번 소인수분해
 * 
 * 소수인지 먼저 판별하고 2부터 순차 증가 하면서 결과값 출력
 * 
 */

import java.util.Scanner;
public class _03_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int number = sc.nextInt();
		int count=0;
			for(int j=0;j<100;j++) {
			for(int i=1; i<Math.sqrt(number)+1; i++ ) {
				if(number%i==0) count ++;
				}
			if(count ==1) {
				if(number>1) {
				System.out.println(number);}
				break;
				}
			else {count=0;
					for(int i=2; i<Math.sqrt(number)+1; i++ ) {
						if(number%i==0) {
							System.out.println(i);
							number=number/i;
							break;
							}
						}
				}
			}
		sc.close();
	}
}
