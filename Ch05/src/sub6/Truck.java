package sub6;

public class Truck extends Car{
	
	
	private int capacity;
	
	
	public Truck(String name , String color, int speed,int capacity ) {
		super(name, color, speed);
		this.capacity= capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	@Override
	public void speed_up(int speed) {
		this.speed += speed-10;
	}
	
	public void show() {
		System.out.println("트럭명 :"+name);
		System.out.println("트럭색 :"+color);
		System.out.println("속도 :"+speed);
		System.out.println("적재량 :"+capacity);			
	}	
}
