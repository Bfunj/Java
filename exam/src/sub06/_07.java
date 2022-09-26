package sub06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a=0, b=0, c=0;
		try {
			System.out.println("첫번째 수 :");
			a= Integer.parseInt(bf.readLine());
			System.out.println("두번째 수 :");
			b= Integer.parseInt(bf.readLine());
			System.out.println("세번째 수 :");
			c= Integer.parseInt(bf.readLine());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.printf("가장 큰수는 %d 입니다.",larger(a, larger(b, c)) );
	}
	
	public static int larger(int a , int b ) {
		return (a >=b) ? a:b;
	}
}
