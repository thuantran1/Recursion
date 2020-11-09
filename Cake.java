
public class Cake {
	private int bites = 10;
	
	public Cake() {
		// nothing to implement
	}
	
	public void takeABite() {
		--bites;
		System.out.println("Hmm.. ");
	}
	
	public boolean isEmpty() {
		return bites == 0;
		// looks like an empty cake
	}
}
