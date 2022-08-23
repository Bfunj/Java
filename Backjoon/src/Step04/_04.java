package Step04;



/*
 * 
 * 2022.08.23
 * 백현조
 * 평균
 * 점수중 가장 높은 점수 M을 구하고 모든 점수를 받은 점수/M*100 고침
 * 
 */

import java.util.Scanner;
public class _04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int exam_su=sc.nextInt();
		double[] num = new double[exam_su];
		double max=0;
		double sum=0;
		double result=0;
		for(int i=0; i<num.length; i++) {
			num[i]= sc.nextInt();
		} // 배열 위치에 과목 점수 할당
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) max= num[i];
		} // 점수 최댓값 구하기
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		} // 점수 합
		result = sum*100/max/exam_su;

		System.out.println(result);
		sc.close();
	}
}
