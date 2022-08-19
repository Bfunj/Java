package sub01;
import java.util.Scanner;
public class Test06 {
	
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println(" X 값 입력 : ");
			int x=sc.nextInt();
			System.out.println(" Y 값 입력 : ");
			int y=sc.nextInt();
			
			String result = x >y ? " x가 y보다 큽니다" : "y가 x보다 큽니다.";
			System.out.println(result);
			
			sc.close();
	}

	

}
