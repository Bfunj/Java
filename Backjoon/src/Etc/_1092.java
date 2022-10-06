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
			Collections.sort(list,Collections.reverseOrder());
		
			int N2=Integer.parseInt(br.readLine());
			ArrayList<Integer> list2 = new ArrayList<>();
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int i=0; i<N2 ; i++) {
				list2.add(Integer.parseInt(st2.nextToken()));
			}
			Collections.sort(list2,Collections.reverseOrder());
			
			for(int value : list2) {
				sb2.append(value).append(' ');
			}
			
			for(int value : list) {
				sb.append(value).append(' ');
			}
			
			System.out.println("list :"+sb);
			System.out.println("list2 :"+sb2);
			int idx_1 =0;
			int idx_2 =0;
			int count =0;
			
			if(list.get(0)<list2.get(0)) {
				System.out.println("-1");
			}
			else {
			
			
			while(list2.size()>0) {
				if(list.get(idx_1) >= list.get(idx_2)) {
					list2.remove(idx_2);
					idx_1++;
				}else idx_2++;
				if(list.size() == idx_1) {
					idx_1 =0;
					idx_2 =0;
					count++;
				}
			}
			}
			System.out.println(count);

	
	}
}
	
	


