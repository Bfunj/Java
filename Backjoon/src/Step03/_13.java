package Step03;



/*
 * 
 * 2022.08.22
 * 백현조
 * 더하기 사이클
 * 각 자리의 숫자를 더하기르 반복하여 처음 수로 돌아오는 사이클 측정
 * 
 */


import java.util.Scanner;
public class _13 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 0;
		int ten =0;
		int one =0;
		int sum =0;
		int count =0;
		boolean result=false;
		num2=num1;

		do{
			if(num2<10) {
			ten =0;
			one = num2%10;
			}
			else {
				ten = num2/10;
				one = num2%10;
				}
			sum = ten + one;
			num2 = (num2%10)*10 + sum%10;
			count ++;
			result = num1 == num2 ? true : false;
		}
		while(!result);
		System.out.println(count);
		sc.close();
	}
}
	



