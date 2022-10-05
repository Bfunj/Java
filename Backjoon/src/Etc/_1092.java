package Etc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1092 {
		
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			
			int N=Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N ; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
		
			
			
			int N2=Integer.parseInt(br.readLine());
			ArrayList<Integer> list2 = new ArrayList<>();
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int i=0; i<N2 ; i++) {
				list2.add(Integer.parseInt(st2.nextToken()));
			}
			Collections.sort(list2);
			for(int value : list2) {
				sb2.append(value).append(' ');
			}
			
			System.out.println(sb);
			System.out.println(list.get(1));
			System.out.println(sb2);
			System.out.println(list2.get(1));
			for(int i=0;;i++) {
			if(list2.get(0)>list.get(i)) {
					list.remove(0);
				}else break;
			}
			
			for(int value : list) {
				sb.append(value).append(' ');
			}
			System.out.println("list"+sb);					
	
	}
}
	
	


