package sub05;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 
 * 2022.09.23
 * 백현조
 * 자바 총정리 연습문제
 * 
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm) 입력 : ");
		double height = sc.nextInt();
		height /=100;
		
		System.out.println("체중 (kg) 입력 :");
		double weight = sc.nextInt();
		
		double bmi = weight/(Math.pow(height, 2));
		
		String result;
		
		if(bmi <20) result ="저체중";
		else if (bmi <25) result ="정상체중";
		else if (bmi <30) result = "경도비만";
		else if (bmi <40) result = "비만";
		else result = "고도비만";
		
		System.out.printf("bmi = %.2f, '%s' 입니다", bmi, result);
		sc.close();
	}
	

}
