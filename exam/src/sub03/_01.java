package sub03;

public class _01 {
	private String name;
	private int age;
	
	public _01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("=============");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		
		_01 kim= new _01("dd",5);
		_01 lee= new _01("cc",3);
		
		kim.show();
		lee.show();
	}
}
