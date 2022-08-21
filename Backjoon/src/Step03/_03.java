package Step03;
/*
 * 
 * 2022.08.20
 * 백현조
 * 0 부터 n까지의 합 
 * 
 * 
 */

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int set = sc.nextInt();
		int sum=0;
		for(int j=1; j<=set; j++) {
			sum+=j;
			}System.out.println(sum);
		sc.close();
	}
}
