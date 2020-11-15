
public class Chien extends Animal implements Bruit {
	
	public void seDeplacer(int x, int y) {
		//TODO Auto-generated method stub
		super.seDeplacer(x,y);
		System.out.println("Je bouge, Wouf!!!");
	}
	
	public void faireDuBruit() {
		System.out.println("Wouf!!!"));
	}
}
