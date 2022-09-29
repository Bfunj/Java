package sub04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 2022.09.16
 * 백현조
 * 문자열처리 연습문제
 * 
 */



public class _08 {
	public static void main(String[] args) {
		
		for(int count=1; count<=5; count ++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {
			Set<Integer> lottoSet = new HashSet<>();
			
	for(;;) {
		int num = (int) (Math.random()*45 ) +1;
		lottoSet.add(num);
		if(lottoSet.size()==6) {
			break;
		}
	}
	Set<Integer> treeSet = new TreeSet<>(lottoSet);
	return treeSet;
	}

}// class end


