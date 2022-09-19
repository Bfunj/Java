package sub02;

public class CountTread extends Thread{
	
	
	private Count count;
	
	public CountTread(Count count) {
		this.count =count;
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=1000;i++) {
			count.setNum();
		}
	}
}
