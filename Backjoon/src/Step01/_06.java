package Step01;

import java.util.Scanner;

/*
 * 
 * 2022/08/19
 * 백현조
 * a b를 입력받아 결과 값 출력
 * 
 */
public class _06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	double num3 = (double)num1 / (double)num2;
	System.out.println(num3);
	sc.close();
}
}