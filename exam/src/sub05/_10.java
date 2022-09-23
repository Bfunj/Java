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
public class _10 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int n =sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=10;i++) {
			int fact =1;
			for(int j=2;j<=i ;j++) {
				fact *=j;
			}
			if(i<=n) {
			sum+=fact;}
			
			System.out.printf("%2d! =  %,10d \n",i,fact);
		}
		System.out.printf("1! + 2! +...+ %d! = %,d\n",n,sum);
		sc.close();
	}
	
		
}

