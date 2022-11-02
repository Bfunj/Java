package 반복문;
/*
 * 
 * 2022.08.20
 * 백현조
 * 정해진 수 만큼 반복해서 입력 받은 두 수를 더하기 
 * 
 * 
 */

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int set = sc.nextInt();
		int sum=0;
		for(int j=1; j<=set; j++) {
			int A= sc.nextInt();
			int B= sc.nextInt();
			sum = A+B;
			System.out.println(sum);
			}
		sc.close();
	}
}
