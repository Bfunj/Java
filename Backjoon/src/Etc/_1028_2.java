package Etc;

/*
 * 
 * 다이아몬드 광산
 * 1028
 * 
 */


import java.util.Scanner;

public class _1028_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R= sc.nextInt();
		int C= sc.nextInt();
		String[] str = new String[R];
		int diamond_size = 0;
		
		if(R>C) {
			diamond_size =(C+1)/2;
		} else diamond_size =(R+1)/2;
			
		for(int i=0;i<R;i++) {
			str[i] = sc.next();
		}
		
		for(int i=diamond_size; i>=0;i--) {
			System.out.println("i :" +i);
			if(dia_size(str,i)) {
				System.out.println(i);
				break;
			}
			if(i==0) System.out.println(0);
		}
		sc.close();
	}
	public static boolean dia_size(String[] str, int size) {
		
		int range = size*2-1;
		int mid =0;
		for(int i=0 ;i<=str.length-range;i++ ) {
			for(int j=0; j<=str[0].length()-range;j++) {
				
				mid = j+range/2;
				int q=0;
				for(int k=0;k<range/2+1;k++) {
					if(str[k+i].charAt(mid-q) =='1' && str[k+i].charAt(mid+q) =='1' ) {
						if(str[range-k-1+i].charAt(mid-q) =='1' && str[range-k-1+i].charAt(mid+q) =='1' ) {
							q++;
						}
					}
				}if(q == size ) return true;
			}
		}
			
		return false;
	
	}
	
}
