package zooKeeper1;

public class GorillaTest {

	public static void main(String[] args) {
		//Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

		Gorilla myGorilla = new Gorilla();//instantiate a gorilla
		
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.eatBananas();
		myGorilla.eatBananas();
		myGorilla.climb();
		
		//display
		myGorilla.displayEnergy();
		
		
	}

}
