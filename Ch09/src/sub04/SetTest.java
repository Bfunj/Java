package sub04;

import java.util.HashSet;
import java.util.Set;

/*
 * 2022.09.08
 * 백현조
 * 자료구조 집합 실습하기
 * 
 * SET
 * 
 */
public class SetTest {
	public static void main(String[] args) {
		
		//집합 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		//집합 개수
		System.out.println("set 집합 원소 갯수 : "+set.size());
		
		//집합 출력
		System.out.println(set);
	
		for(int n : set) {
			System.out.print(n+", ");
		}
		
		//집합 연산
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		
	}
}
