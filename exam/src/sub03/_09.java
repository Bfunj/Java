package sub03;


abstract class Shape{
	public abstract void draw();

}

class Triangle extends Shape{
	public void draw() {
		
		System.out.println("draw Triangle !");
	}
}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("draw Circle!");
	}
}




public class _09 {
	public static void main(String[] args) {
	
	_09 here = new _09();
	
	Circle circle = new Circle();
	Triangle triangle = new Triangle();
	
	here.draw(circle);
	here.draw(triangle);
		
	}
	public void draw(Shape obj) {
		obj.draw();
	}
	
}