package sub08;

interface MyLamda<T>{
	public T what(T t);
}
public class _06 {
	public static void main(String[] args) {
		 MyLamda<Integer> factorial = (n) -> {
			 
			 int result =1;
			 
			 for( int i=1; i<=n; i++) {
				 result *=i;
			 }
			 return result;
		 };
		
		System.out.println();
		System.out.println();
		
		// reverse = (n) -> {};
		
		System.out.println();
		System.out.println();
	}
}
