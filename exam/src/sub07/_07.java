package sub07;

interface Player{
	public void play();
}

class BaseBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("야구중");
	}
}
class FootBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("축구중");
	}
}


public class _07 {
	public static void main(String[] args) {
		
		Player p1 =new BaseBallPlayer();
		Player p2 =new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
