package Sort;
/*
 * 
 * 2022.09.21
 * 선택정렬
 * - 맨 앞의 인덱스부터 차례대로 비교를하면서 조건을 만족하면 서로의 위치를 바꾸는 방식
 * - n번 인덱스와 n+1, n+2 ... end까지 비교하면서 조건에 맞으면 변경
 * - n번째 인덱스 비교가 끝나면 n+1을 기준으로 그 뒤로 순차적으로 진행 
 * - 선택정렬의 시간복잡도 N x (N + 1)
 * - 빅오표기법 O(N^2)
 * 
 */
import java.util.Arrays;

public class SelectionSort {
	
	static int tmp=0;	
	
	public static void main(String[] args) {
		int[] arr = {100,55,75,121,0,0,1,5,15,22,10000,521,798,10000};
		Selection_Sort_up(arr);
		System.out.println(Arrays.toString(arr));
		Selection_Sort_down(arr);
		System.out.println(Arrays.toString(arr));
	}//main end

	public static void Selection_Sort_up(int[] arr) {
		//오름차순
		for(int i=0; i<arr.length ;i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] >= arr[j]) {
						tmp =arr[i];
						arr[i] = arr[j];
						arr[j]= tmp;
				}	
			}
		}
	}
	public static void Selection_Sort_down(int[] arr) {	
		// 내림차순
		for(int i=0; i<arr.length ;i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] <= arr[j]) {
						tmp =arr[i];
						arr[i] = arr[j];
						arr[j]= tmp;
				}	
			}
		}
	}
	
	
}//class end

