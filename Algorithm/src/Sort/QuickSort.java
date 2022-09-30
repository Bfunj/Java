package Sort;
/*
 * 
 * 2022.09.28
 * 퀵정렬 ( Quick Sort )
 * 
 * -피벗(pivot)을 기준으로 피벗보다 큰 값, 작은 값들로 리스트를 나누고 정렬한 다음 이 과정을 재귀적으로 수행한다.
 * - 퀵 정렬은 데이터를 비교하며 정렬하므로 비교 정렬이다.
 * - 데이터 외의 추가적인 공간을 필요로 하지 않으므로 제자리 정렬이다.
 * 
 * 1. 피벗을 하나 선택한다.
 * 2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다.
 * 		왼쪽에서부터는 피벗보다 큰 값을 찾고, 오른쪽에서부터는 피벗보다 작은 값을 찾는다.
 * 3. 양 방향에서 찾은 두 원소를 교환한다.
 * 4. 왼쪽에서 탐색하는 위치와 오른쪽에서 탐색하는 위치가 엇갈리지 않을 때 까지 2번으로 돌아가 위 과정을 반복한다.
 * 5. 엇갈린 기점을 기준으로 두 개의 부분리스트로 나누어 1번으로 돌아가
 * 		해당 부분리스트의 길이가 1이 아닐 때 까지 1번 과정을 반복한다. (Divide : 분할)
 * 6. 인접한 부분리스트끼리 합친다. (Conqure : 정복)
 * 
 * 참조 사이트 : https://st-lab.tistory.com/250
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuickSort {
	
	public static void sort(int[] a) {
		l_pivot_sort(a, 0, a.length-1);
		
	}
	
	private static void l_pivot_sort(int[] a , int lo, int hi) {
		if(lo >= hi) {
			return;
		}
		int pivot =partition(a, lo, hi);
		l_pivot_sort(a, lo, pivot-1);
		l_pivot_sort(a, pivot +1,hi );
		
	}
	private static int partition(int[] a , int left, int right) {
		int lo =left;
		int hi = right;
		int pivot = a[left];
		
		while(lo<hi) {
			while( a[hi] > pivot && lo < hi) {
				hi--;
			}
			while(a[lo] <= pivot && lo <hi) {
				lo++;
			}
			swap(a,lo,hi);
		}
		swap(a,left,lo);
		return lo;
	}
	
	private static void swap(int[] a ,int i, int j ) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
			
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		int[] src =new int[test];
		
		for(int i =0 ; i<test ; i++) {
			src[i] = Integer.parseInt(bf.readLine());
		}
		
		sort(src);
		
		for(int i =0 ; i<test ; i++) {
			System.out.println(src[i]);
		}
	}
	
	
}//class end

