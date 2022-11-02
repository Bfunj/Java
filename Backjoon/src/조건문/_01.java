package 조건문;

import java.util.Scanner;
/*
 * 
 * 
 * 2022/08/19
 * 백현조
 * 두 수 비교하기
 * 
 */

public class _01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	
	if(a>b) {
		System.out.println(">");
	}
	else if(a<b) {
		System.out.println("<");
	}
	else System.out.println("==");
	sc.close();
}

}
