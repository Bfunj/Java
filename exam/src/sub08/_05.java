package sub08;


interface NumericLamda{
	boolean test(int n);
}

public class _05 {
	public static void main(String[] args) {
		
		NumericLamda isEven= n -> (n%2) ==0;
			
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		NumericLamda isNonNeg= n -> n>=0;
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		
		
		
	}
}
