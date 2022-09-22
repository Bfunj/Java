package Sort;

import java.util.Arrays;

/*
 * 2022.09.22
 * 백현조
 * 삽입정렬
 * 
 * 
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {100,55,75,121,0,0,1,5,15,22,10000,521,798,10000};
		Insertion_Sort_up(arr);
		System.out.println(Arrays.toString(arr));
		Insertion_Sort_down(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void Insertion_Sort_up(int[] a) {
		for(int i=1; i<a.length;i++) {
			for(int j=i;j>=1;j--) {
				if(a[j]<a[j-1]) {
					a[j]=a[j]+a[j-1];
					a[j-1]=a[j]-a[j-1];
					a[j]=a[j]-a[j-1];
				}else break;
			}
		}
	}
	public static void Insertion_Sort_down(int[] a) {
		for(int i=1; i<a.length;i++) {
			for(int j=i;j>=1;j--) {
				if(a[j]>a[j-1]) {
					a[j]=a[j]+a[j-1];
					a[j-1]=a[j]-a[j-1];
					a[j]=a[j]-a[j-1];
				}else break;
			}
		}
	}
	
	
	
}
