package 배열_1차원;

import java.util.Scanner;

public class _baek_2738 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A =new int [N][M];
		int[][] B =new int [N][M];
		
		for(int i=0 ; i<N ; i++) {
			for(int k=0 ; k<M ; k++) {
				A[i][k] = sc.nextInt();
			}
		}
		for(int i=0 ; i<N ; i++) {
			for(int k=0 ; k<M ; k++) {
				B[i][k] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int k=0 ; k<M ; k++) {
				A[i][k] = A[i][k]+B[i][k];
				System.out.print(A[i][k]+" ");
			}System.out.println();
		}
		
		sc.close();
	}
}
