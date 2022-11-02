package 배열_1차원;



/*
 * 
 * 2022.08.23
 * 백현조
 * 최대값 찾고 몇번째 인지 확인하기
 * 
 * 
 */

import java.util.Scanner;
public class _02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] num = new int[9];
		int max=0;
		int count=0;
		for(int i=0; i<num.length ; i++) {
			num[i]= sc.nextInt();
		}
		
		for(int j=0;j<num.length; j++) {
			if(num[j]>max) {max= num[j]; count=j+1;}
		}
		
		System.out.println(max);
		System.out.println(count);
		
		sc.close();
	}
}
