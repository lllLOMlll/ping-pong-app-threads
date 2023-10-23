package lab4_3;

import java.util.Random;

import Lecture5.BankAccount;

public class PingPong implements Runnable{
	private String name;
	private String sound;
	private boolean infinite = true;
	private Random random = new Random();
	
	
	public PingPong(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
		
	
	@Override
	public void run() {
		while (true) {
		infinite = true;
		try {
			int randomNumber = random.nextInt(100);
			if (randomNumber < 10) {
				System.out.println(this.name + ": MISS!");
				
				if (randomNumber < 90 ) {
					System.out.println(this.name + ": SMAAAAAASHHHHHHH!" );
				}
			} else {
				System.out.println(this.name + ": " + sound);
			}
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
	}

}
