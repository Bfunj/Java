package sub3;

/*
 * 
 * 2022/08/17
 * BHJ
 * FOR문
 * 
 */
public class ForTest {

public static void main(String[] args) {
	
	// for
	int i;
	for(i=1 ; i<=5 ; i++)
	System.out.println("i : " +i);
	
	// 1부터 10까지의 합
	int j, sum_1=0;
	for(j=1; j<=10 ; j++)
	{
	sum_1 += j;
	}
	System.out.println("1부터 10 까지의 합 : "+sum_1);
	
	// 1부터 10까지 짝수의 합
	int tot=0;
	for(int k=1; k<=10; k++)
	{
	if( k%2 == 0 )
		tot += k;
	}
	System.out.println("1 부터 10까지 짝수 합 :"+ tot);
	
	//중첩 for
	
	for(int a=1; a<=3;a++) {
		System.out.println("a:"+a);
		for(int b=1; b<=5; b++) {
			System.out.println("b:"+b);
		}
	}
		
	//구구단
	int dot;
	for(int c=1; c<=9; c++) {
		System.out.println(c+"단");
		for(int d=1; d<=9;d++) {
			dot = c*d;
			System.out.println(c + "x" + d +"=" +dot );
		
		}
	}
	
	//별삼각형
	
	for(int z=9 ; z>=1; z--) {
		for(int m=1; m<=z; m++) {
			System.out.print("☆");
		}System.out.print("\n");
	}
}



}
