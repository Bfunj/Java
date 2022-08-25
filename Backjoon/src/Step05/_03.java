package Step05;
/*
 * 
 * 2022.05.28
 * 백현조
 * 한수
 * 
 */
import java.util.Scanner;

public class _03 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int c =han_count(sc.nextInt());
	
	System.out.println(c);

	sc.close();
	}
	
	public static int han_count(int x) {
		int count=0;
		int su_1=0;
		int su_10=0;
		int su_100=0;
		for(int i=1;i<=x;i++)
		{
			if(i<100) count++;
			else {
				su_100 = i/100;
				su_10 = (i/10)%10;
				su_1 = i%10;
				if (su_1 - su_10 == su_10 -  su_100) {
					count++;
				}
			}
		}
		return count;
	}
}

