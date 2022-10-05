package Step09;



/*
 * 2022.09.14
 * 수 정렬하기
 * 백현조
 * 
 * 입력
 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 * - 둘째 줄부터 N개의 줄에는 수 주어진다.
 * - 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
 * - 수는 중복되지 않는다.
 * 
 * 출력
 * - 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _02_2751 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N=sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N ; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		sc.close();
	}
	
	
}// class end








/*
 * 	public static int[] src;
	public static int[] tmp;

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		src =new int[test];
		tmp = new int[src.length];
		for(int i =0 ; i<test ; i++) {
			src[i] = Integer.parseInt(bf.readLine());
		}
		mergeSort(0, src.length-1);
		printArray(src);
	
	}//main end
	
	public static void mergeSort(int start, int end) {
		if(start < end) {
			int mid = (start +end)/2;
			
			mergeSort(start, mid);
            mergeSort(mid+1, end);
			int p = start;
			int q = mid +1;
			int idx =p;
			while(p<=mid || q<=end) {
				if(q>end || (p<=mid && src[p]< src[q] )) {
					tmp[idx++] = src[p++];
				}else {
					tmp[idx++] = src[q++];
				}
			}//while end
			for(int i=start ;i<=end;i++) {
				src[i]=tmp[i];
			}
		}
	}
	
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			System.out.println();
		}
	}
 */
