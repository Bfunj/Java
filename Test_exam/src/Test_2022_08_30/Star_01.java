package Test_2022_08_30;
/*
 * 
 * 
 * 2022.08.30
 * 백현조
 * 첫째 줄에는 별 1개 , 둘째 줄에는 별 2개 N번째 줄에는 별 N개를 찍는 문제
 * 입력 조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력 조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 */
import java.util.Scanner;
public class Star_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt(); // N에 입력받은 숫자가 저장
		if(N>=1 && N<=100) // 입력 받은 숫자의 범위를 설정
		{
			for (int i=0 ; i< N; i++) { // N번 반복
				for(int j=0; j<=i;j++) { // i가 증가함에따라 별의 출력횟수 증가
					System.out.print("★");
				}
			System.out.println();
			}
		}
		sc.close();
	}
}
