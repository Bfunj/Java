package sub04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 2022.09.16
 * 백현조
 * 문자열처리 연습문제
 * 
 */





public class _07 {

	public static void main(String[] args) {	
		printList(createList());
	
	}//main end
	
	
	public static void printList(List<Integer> scoreList) {
		int total =0 ;
		int size = scoreList.size();
		
		for(int i=0; i<size;i++) {
			int score = scoreList.get(i);
			
			total +=score;
			System.out.print(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}System.out.println(total);
	}
	
	public static List<Integer> createList() {
		List<Integer> scorelist = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1; i<=10 ; i++) {
			int num = rand.nextInt(41)+60;
			scorelist.add(num);
		}
		return scorelist;
		
	}
}// class end


