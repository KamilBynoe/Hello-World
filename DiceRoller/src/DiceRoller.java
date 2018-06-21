import java.util.Random;

public class DiceRoller {
	Random rng = new Random();
	public static void main (String[]args) {
		
		
		System.out.println(this.rollDice(10));
		
	}
	
	public int rollDie (int MaxNum) {
		return rng.nextInt(MaxNum);
	}
}
