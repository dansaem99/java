package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) { // 달리고 싸우는걸 알려준다.
			autobot.run();
			autobot.fight();
			//autbot.guard();
			
			if(autobot instanceof Bumblebee bot) bot.guard(); //보호하는게 나온다.
			if(autobot instanceof Prime bot) bot.command(); //지휘하는게 나온다.
		}
	}
}
