package sub06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _06 {
	public static void PrintArray (String tit, int[] array) {
		System.out.println(tit);
		for(int i=0; i<array.length; i++) {
			System.out.printf("%5d%s", array[i], (i%10==9) ? "\n" : "");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random =new Random();
		int[] value = new int[30];
		
		for (int i=0 ;i<30;i++)
			value[i]=random.nextInt(1000);
			
		PrintArray("정렬 전", value);
		Arrays.sort(value);
		PrintArray("정렬 후", value);
	
		System.out.print("=>  검색할 숫자 입력 :");
		int findNum= sc.nextInt();
		int count =0;
		
		for(int i=0; i<value.length;i++) {
			count++;
			if(value[i] == findNum) {
				System.out.printf("value[%d] = %d\n", i, findNum);
				System.out.printf("선형탐색 비교 횟수 %d회\n",count);
				break;
			}
		}
		
		count=0;
		int low=0;
		int high = value.length-1;
		
		while ( low<= high) {
			count++;
			int mid = (low + high)/2;
			
			if(value[mid] == findNum) {
				System.out.printf("value[%d] = %d\n", mid, findNum);
				System.out.printf("선형탐색 비교 횟수 %d회\n",count);
				break;
				
			}
			else if ( findNum > value[mid])
				low = mid+1;
			else high = mid-1;
			
		}
	}
	
}
