package Game;

public abstract class GameObject {

	public abstract void draw();
	
	public static void main(String[] args) {
		
		Player player = new Player();
		player.draw();
		
		Menu menu = new Menu();
		menu.draw();
		//GameObject myObject = new GameObject(); // abstract classes exist to be extended, they can not be instantiated
		
	}
	
}
