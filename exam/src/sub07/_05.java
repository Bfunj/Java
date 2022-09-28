package sub07;

class Member{
	private String name;
	public Member(String name) {
		this.name=name;
	}
	public void show() {
		System.out.println("----------");
		System.out.println(name +"입니다.");
	}
}

class Employee extends Member{
	public Employee(String name) {
		super(name);
	}
	public void show() {
		super.show();
		System.out.println("작업을 합니다.");
	}
}

class Developer extends Member{
	public Developer(String name) {
		super(name);
	}
	public void show() {
		super.show();
		System.out.println("개발을 합니다");
	}
}
class Professor extends Member{
	public Professor(String name) {
		super(name);
	}
	public void show() {
		super.show();
		System.out.println("연구를 합니다");
	}
}

public class _05 {
	public static void main(String[] args) {
		
		Employee emp = new Employee("김유신");
		Developer de = new Developer("김춘추");
		Professor pro = new Professor("장보고");
		
		Member[] people = { emp, de, pro };
		
		for(Member human : people) {
			human.show();
		}
	}
}



