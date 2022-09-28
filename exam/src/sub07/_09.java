package sub07;

interface Tv{
	public void TurnOn();
	public void TurnOff();
}

public class _09 {
	public static void main(String[] args) {
		
	Tv tv = new Tv() {
			@Override
			public void TurnOn() {
				System.out.println("Tv를 킴");
			}
			public void TurnOff() {
				System.out.println("Tv를 끔");
			}
		};
		
		tv.TurnOff();
		tv.TurnOn();
	}
}
