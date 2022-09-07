package Step09;



/*
 * 2022.09.07
 * 백현조
 * 팩토리얼 문제
 * -0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 * 출력 : 첫째 줄에 N!을 출력한다.
 * 
 */

import java.util.Scanner;
public class _01_10872 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println( Factorial(num) );
		sc.close();
	}
	public static int Factorial(int a) {
		if(a==0) {
			return 1;
		}
		else
		return a*Factorial(a-1);
	}
}