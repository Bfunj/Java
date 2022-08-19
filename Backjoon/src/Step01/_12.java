package Step01;

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
	int a = sc.nextInt();
	int b = sc.nextInt();
	int line1=0;
	int line2=0;
	int line3=0;
	line1=a*(b%10);
	line2=a*((b/10)%10);
	line3=a*(b/100);
	System.out.println(line1);
	System.out.println(line2);
	System.out.println(line3);
	System.out.println(line1 + line2*10 +line3*100);

	sc.close();
}
}