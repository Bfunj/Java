package sub05;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 
 * 2022.09.23
 * 백현조
 * 자바 총정리 연습문제
 * 
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		
		int year = sc.nextInt();
		
		if( year%4 ==0 && year%100 !=0 || year %400 ==0) {
			System.out.printf("%d는 윤년 입니다. \n" ,year);
		}else System.out.printf("%d는 평년 입니다. \n", year);
	
		
		GregorianCalendar greCal = new GregorianCalendar();
		if(greCal.isLeapYear(year)){
			System.out.printf("%d는 윤년 입니다. \n" ,year);
		}else System.out.printf("%d는 평년 입니다. \n", year);
		
		sc.close();
	}
	

}
