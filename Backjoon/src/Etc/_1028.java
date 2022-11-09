package Etc;



/*
 * 
 * 다이아몬드 광산
 * 1028
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class _1028 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int result=0;
		int[][] diamond = new int[R][C];
		String[] str= new String[R];
		for(int i=0; i<R ;i++) {
			str[i]=br.readLine();
			for(int j=0;j<C;j++) {
				diamond[i][j]=str[i].charAt(j)-48;
			}
		}
		int diamond_size = 0;	
		if(R>C) {
			diamond_size =(C+1)/2;
		} else diamond_size =(R+1)/2;	
		
		for(int i=diamond_size; i>=0;i--) {
		
			int range = i*2-1;
			int mid =0;
			
			if(range<0)break;
			for(int u=0 ;u<=diamond.length-range;u++ ) {
				for(int j=0; j<=diamond[0].length-range;j++) {	
					mid = j+range/2;
					int q=0;
					for(int k=0;k<range/2+1;k++) {
						if(diamond[u][mid] != 1) break;
						if(diamond[k+u][mid-q] ==1 && diamond[k+u][mid+q] ==1 ) {						
							if(diamond[range-k-1+u][mid-q] ==1 && diamond[range-k-1+u][mid+q] ==1 ) {
								q++;
							}
						}
					}if(q == i && result<i) { result =i; break;}
					if(result != 0) break;
				}if(result != 0) break;
			}if(result != 0) break;
				
		}	
		System.out.println(result);
	
	}
}
