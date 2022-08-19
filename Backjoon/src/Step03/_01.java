package Step03;
/*
 * 
 * 2022.08.19
 * 백현조
 * 구구단 출력하기 
 * 
 * 
 */

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		for(int j=1; j<=9; j++) {
				System.out.println(num+" * "+j+" = "+num*j);
			}sc.close();
	}
}
