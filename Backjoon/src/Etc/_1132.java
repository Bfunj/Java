package Etc;

import java.util.Scanner;

/*
 * 
 * 1132 합
 * N개의 수 
 * A부터 J가 각 자릿수를 대처
 * 0으로 시작하는 수는 없음
 * 이때 합이 가장 큰 수는?
 * 수의 길이는 최대 12
 */
public class _1132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N<=50
		char[] NUM= {'9','8','7','6','5','4','3','2','1','0'};
		String[] alpha = new String[N];
		char a;
		char c;
		int sum=0;
		String[] Str = new String[N];
			
		for(int i = 0 ; i<N ; i++) {
			alpha[i] = sc.next();
		} // 입력
		
		
		
		for(int k=0; k<N;k++) {
			for(int i=0; i<alpha[k].length();i++) {
				c =alpha[k].charAt(i);
				a=num(c,NUM);
				if(i==0) {
				Str[k]=String.valueOf(a);
				}else Str[k]+=String.valueOf(a);
			}
		}
		
		
		
		// 결과값 출력
		for(int i=0; i<N;i++) {
			sum+=Integer.parseInt(Str[i]);
		}
		System.out.println(sum);
		
		
		sc.close();
	}
	
	public static char num(char c, char[] NUM) {
		
		switch(c) {
		case 'A' :  return NUM[0];
		case 'B' :  return NUM[1];
		case 'C' :  return NUM[2];
		case 'D' :  return NUM[3];
		case 'E' :  return NUM[4];
		case 'F' :  return NUM[5];
		case 'G' :  return NUM[6];
		case 'H' :  return NUM[7];
		case 'I' :  return NUM[8];
		case 'J' :  return NUM[9];
		}
		return 0;
	}
	
}
