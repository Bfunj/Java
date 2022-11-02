package 조건문;
/*
 * 
 * 2022.08.19
 * 백현조
 * 주사위 게임
 * 3개를 던져서 눈이 3개가 같을 경우 2개가 같은 경우 다를경우
 * 3개가 같다면 10,000원+(같은 눈)×1,000원의 상금
 * 2개가 같다면 1,000원+(같은 눈)×100
 * 다르다면 (그 중 가장 큰 눈)×100
 * 
 */
import java.util.Scanner;
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int joo1=sc.nextInt();
		int joo2=sc.nextInt();
		int joo3=sc.nextInt();
		
		int price=0;
		int high_num=0;
	
		if(joo1 == joo2 && joo2 == joo3) {
			price = 10000 + joo1*1000;
		}
		else if (joo1 == joo2 && joo1 != joo3){
			price =1000+joo1*100;
		}
		else if (joo1 == joo3 && joo1 != joo2){
			price =1000+joo1*100;
		}
		else if (joo2 == joo3 && joo1 != joo2){
			price =1000+joo2*100;
		}
		else {
			if(joo1-joo2>=0) {high_num=joo1;}
			else {high_num=joo2;}
			if(high_num-joo3>=0) {}
			else {high_num=joo3;	}	
			price= high_num*100;
		}
		
		sc.close();
		System.out.println(price);
	

	}
}