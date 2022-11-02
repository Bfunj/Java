package 입출력과_사칙연산;

import java.util.Scanner;
/*
 * 
 * 2022/08/19
 * 백현조
 * 세자리수 곱셈에서 
 * 각 자리 수 출력
 * 
 * 
 * 
 */
public class _12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(); 						//--1
	int b = sc.nextInt(); 						//--1
	int result=0;								//--2
	for(int i = 0 ; i <3 ; i++) {				//--3
		System.out.println(a*(b%10));			//--4.1
		result += (a*(b%10))*Math.pow(10, i); 	//--5
		b/=10;									//--4.2
	}
	System.out.println(result);					//--6
	sc.close();
}
}

/*
 
 	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(); 						//--1
	int b = sc.nextInt(); 						//--1
	int result=0;								//--2
	
	for(int i = 0 ; i <3 ; i++) {				//--3
		System.out.println("반복문 i의 값은 : "+i);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("a와 곱해질 b의 값은 : "+b%10);
		System.out.println((i+1)+"번째 출력 값 :"+a*(b%10));			//--4.1
		result += (a*(b%10))*Math.pow(10, i); 	//--5
		System.out.println("result :"+ result);
		b/=10;									//--4.2
		System.out.println();
	}
	System.out.println("--반복문 종료 최종 결과 값--");
	System.out.println(result);					//--6
	sc.close();
 */

