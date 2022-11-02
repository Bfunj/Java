package 반복문;



/*
 * 
 * 2022.08.21
 * 백현조
 * x보다 작은 수
 * 
 */


import java.util.Scanner;
public class _11 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
	while(true) {
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum= A+B;
		if(sum == 0) {break;
	}
		System.out.println(sum);
	}	sc.close();		
}
}



