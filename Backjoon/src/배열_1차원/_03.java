package 배열_1차원;



/*
 * 
 * 2022.08.23
 * 백현조
 * 10개의 값을 받고 42로 나눴을때 나머지가 다른 수의 갯수
 * 
 * 
 */

import java.util.Scanner;
public class _03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] num = new int[10];
		int[] num2 = new int[42];
		int[] num3 = new int[42];
		int count=0;
		for(int i=0; i<num.length ; i++) {
			num[i]= sc.nextInt()%42;
		}
		for(int i=0; i<num2.length ; i++) {
			num2[i]= i;
		}
		for(int i=0; i<num3.length ; i++) {
			num3[i]= 0;
		}
		for(int j=0;j<num.length; j++) {
			for(int k=0;k<42;k++) {
				if(num[j] == num2[k])num3[k]++;
			}
		}
		for(int k=0;k<42;k++) {
				if(num3[k]>=1)count++;
		}
		System.out.println(count);
		sc.close();
	}
}
