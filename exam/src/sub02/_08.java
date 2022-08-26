package sub02;

import java.util.Scanner;

/*
 * 
 * 2022.08.26
 * 백현조
 * 자바 팩토리얼 재귀 메서드 연습문제
 *  
 * 
 */
public class _08 {
	public static void main(String[] args) {
		System.out.println("  3! "+Fac(3));
		System.out.println("  4! "+Fac(4));
		System.out.println("  5! "+Fac(5));
	
	}
	
	
	public static int Fac(int n) {
		
		if(n<=1) {
			return 1;
		}		
		return n*Fac(n-1);
	
	}
	
	
}