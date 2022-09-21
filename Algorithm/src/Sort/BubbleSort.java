package Sort;
/*
 * 
 * 2022.09.21
 * 버블정렬
 * 
 */
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {100,55,75,121,0,0,1,5,15,22,10000,521,798,10000};
		Bubble_Sort_up(arr);
		System.out.println(Arrays.toString(arr));
		Bubble_Sort_down(arr);
		System.out.println(Arrays.toString(arr));
	}//main end
	
	// 버블정렬 오름차순
	public static void Bubble_Sort_up(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(j+1 < arr.length && arr[j] > arr[j+1]) {
					  arr[j] = arr[j] + arr[j + 1];	
	                    arr[j + 1] = arr[j] - arr[j + 1];
	                    arr[j] = arr[j] - arr[j + 1];
				}//if 끝
			}//for j끝
		}//for i 끝
	}//method 끝
	
	//버블정렬 내림차순
	public static void Bubble_Sort_down(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(j+1 < arr.length && arr[j] < arr[j+1]) {
					  arr[j] = arr[j] + arr[j + 1];	
	                    arr[j + 1] = arr[j] - arr[j + 1];
	                    arr[j] = arr[j] - arr[j + 1];
				}//if 끝
			}//for j끝
		}//for i 끝
	}//method 끝
	
}//class end

