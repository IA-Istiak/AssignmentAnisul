package brocode;

import java.util.Random;

public class DiceRoller {
	
	DiceRoller(){
		Random ran = new Random();
		int number = 0;
		Roll(ran,number);
	}
	
	public void Roll(Random ran, int number) {
		number = ran.nextInt(6)+1;
		System.out.println(number);
	}

}
