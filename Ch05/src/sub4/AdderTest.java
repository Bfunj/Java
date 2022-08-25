package sub4;

class Adder{
	
	public static int x;
	
	public  void add(int _x) {
		x=_x;
	}
	public  void add(int[] arr) {
		arr[0]++;
	}
	public static void add(Adder a1) {
		a1.x += 20;
	}
	public static Adder add(Adder a2, int value) {
		return new Adder();
	}
		
	
}


public class AdderTest {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		Adder adder = new Adder();
		adder.add(1);
		System.out.println("1) x : " +Adder.x);
		
		adder.add(arr);
		System.out.println("2) x : " +Adder.x);
		
		Adder.add(adder);
		System.out.println("3) x : " +Adder.x);
		
		Adder a2 =Adder.add(adder,0);
		System.out.println("4) x : " +Adder.x);
		
		
	}
}
