package sub01;
/*
 * 
 * 2022.09.08
 * 백현조
 * 
 * 제네릭(Generic)
 * - 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 * - 제네릭 문법으로 클래스를 범용성을 갖도록 활용
 * 
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple app= new Apple("한국",3000);
		banana ban= new banana("대만",2500);
		
		FruitBox<Apple> box = new FruitBox();
		FruitBox<banana> box2 = new FruitBox();
		
		box.setFruit(app);
		box2.setFruit(ban);
		box.getFruit().show();
		box2.getFruit().show();
		
		
	}//main end
}// class end
