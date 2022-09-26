package Step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
 * 2022.09.15
 * 백현조
 * 11659번 구간 합 구하기-4
 * 
 */
public class _11659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(bf.readLine()); 
		StringTokenizer st2 = new StringTokenizer(bf.readLine()); 
		Scanner sc = new Scanner(System.in);
		int[] arry = new int[Integer.parseInt(st1.nextToken())];
		int test = Integer.parseInt(st1.nextToken());
		String[] str= new String[test];
		
		for(int i=0; i<arry.length; i++) {
			arry[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0 ;i<str.length ; i++) {
			for(int j=0; j<2;j++) {
				
				
			}
			int result = su(sc.nextInt(), sc.nextInt(), arry);
				
		}
	sc.close();	
	}
	public static int su(int a , int b, int[] arry) {
		int sum=0;	
		for(int i=a-1;i<b;i++ ) {
			sum += arry[i];
		}	
		return sum;
	}
}
