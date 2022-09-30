package Sort;

import java.util.Arrays;

/*
 * 2022.09.22
 * 백현조
 * 삽입정렬
 * 
 * 뒤에 있는 수와 앞에 있는 수를 비교하여 뒤에 있는 수가 더 크면 앞으로 이동한다.
 * 이렇게 반복되어지면 n번째 수가 n-1보다 더 크다면 이미 앞은 정렬이 끝났기에 다음번 n+1부터 비교를 해주면 된다.
 * 따라서 앞쪽에 정렬되어 있는 수가 많을 수록 시간복잡도가 줄어들게 된다.
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
