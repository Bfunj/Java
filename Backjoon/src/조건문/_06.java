package 조건문;
/*
 * 
 * 2022.08.19
 * 백현조
 * 오븐구이
 * 현재 시간 및 조리 시간 입력을 받아 완성되는 시간 출력
 * 
 */
import java.util.Scanner;
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h=sc.nextInt();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		
		int m2_h=0;
		int m2_m=0;
		
		m2_h=(m1+m2)/60;
		m2_m=(m1+m2)%60;
		
		h=h+m2_h;
		m1=m2_m;
		
		if(h>=24) {
			h=h-24;
		}
		sc.close();
		System.out.println(h+" "+m1);
	

	}
}