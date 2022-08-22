package Step03;



/*
 * 
 * 2022.08.22
 * 백현조
 * A+B_4
 * EOF 사용하기
 * hadNext(); 입력된 토큰이 있으면 true 없으면 false
 * 
 */


import java.util.Scanner;
public class _12 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum= A+B;
		System.out.println(sum);
	
		}sc.close();
		

}
}



