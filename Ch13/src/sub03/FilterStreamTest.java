package sub03;

import java.util.Arrays;
import java.util.List;

/*
 * 2022.09.20
 * 백현조
 * 필터스트림
 * 
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("김유신","김춘추", "장보고", "강감찬", "이순신","김춘추");
		System.out.println(names);
		
		names.stream().distinct().forEach((name) -> {System.out.println(name+" ");});
		System.out.println();
		
		names.stream().filter( name -> name.startsWith("김") ).forEach( name-> System.out.println(name + " ") );
		System.out.println();
	}
}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int  sum=0;
        int x1=x;
        while(true){
            sum+= x%10;
            x=x/10;
            if(x<1)break;
        }
        
        if (x1%sum ==0 ) answer = true;
        else answer = false;
        return answer;
    }
}