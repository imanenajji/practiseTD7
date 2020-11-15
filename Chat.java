
public class Chat extends Animal implements Bruit{
	
	public void seDeplacer(int x, int y) {
		super.seDeplacer(x, y);
		System.out.println("Je bouge, Miaou!!!");
	}
	
	public void faireDuBruit() {
		System.out.println("Miaou!!!");
	}
}
 