package sub01;

public class Test03 {
public static void main(String[] args) {
	int result;
	int num=1;
	
	result =num++;
	System.out.println("tesult : " +result);
	result =++num;
	System.out.println("tesult : " +result);
	result =num--;
	System.out.println("tesult : " +result);
	result =--num;
	System.out.println("tesult : " +result);
}
}
