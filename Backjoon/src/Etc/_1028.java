package Etc;

/*
 * 
 * 다이아몬드 광산
 * 1028
 * 
 */


import java.util.Scanner;

public class _1028 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R= sc.nextInt();
		int C= sc.nextInt();
		int[][] Diamond = new int[R][C];
		String[] str = new String[R];
		int diamond_size = 0;
		
		if(R>C) {
			diamond_size =(C+1)/2;
		} else diamond_size =(R+1)/2;
			
		for(int i=0;i<R;i++) {
			str[i] = sc.next();
		}
		
		for(int i=diamond_size; i>=1;i--) {
			if(dia_size(str,i)) {
				System.out.println(i);
				break;
			}
		}
	
	
	}
	public static boolean dia_size(String[] str, int size) {
		
		int start_R=0;
		int start_C=0;
		int end = size*2-2;
		int i=0;
		for(start_R=0;start_R<str.length;start_R++) {
			for(start_C=0;start_C<str[0].length();start_C++) {
				for(i=0;i<size;i++) {
			
			if(str[start_R+i].charAt(start_C+i) ==  1 && str[start_R+end-i].charAt(start_C+i) == 1) {
				if(str[start_R+i].charAt(start_C-i) ==  1 && str[start_R+end-i].charAt(start_C-i) == 1) {
					if(i==size-1) return true;
					}
				}
				}
			}
		}
		return false;
	}
	
}
