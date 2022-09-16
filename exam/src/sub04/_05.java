package sub04;

import java.util.Scanner;

/*
 * 2022.09.16
 * 백현조
 * 문자열처리 연습문제
 * 
 */



public class _05 {

	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");
		
		int total=0;
		
		for(int i=0; i<scores.length; i++) {
			total += Integer.parseInt(scores[i]);
		}
		System.out.println("총점 : "+total);
		
	
	}//main end
}// class end


