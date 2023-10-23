package lab4_3;

import Lecture5.Banking;

public class MyMain {

	public static void main(String[] args) {

		Thread louis = new Thread(new PingPong("Louis", "PING!"));
		Thread marie = new Thread(new PingPong("Marie", "PONG!"));

		louis.start();
		marie.start();
	}

}
