package 조건문;
/*
 * 
 * 2022.08.19
 * 백현조
 * 윤년 판별
 * 윤년은 4의배수 and ( 100의 배수 not or 400의 배수)
 * 
 */

import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int year=sc.nextInt();
	if( year%4 ==0 && ( year%100 != 0 || year%400 ==0 ) ) {
		System.out.println("1");
	}
	else {
		System.out.println("0");
	}sc.close();
	}	
}