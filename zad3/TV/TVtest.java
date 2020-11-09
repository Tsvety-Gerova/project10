package zad3.TV;

public class TVtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv1 = new TV();
		
		System.out.println("channel " + tv1.channel + " volume "+ tv1.volumeLevel + " on: " + tv1.on);
		
		tv1.turnOn();
		tv1.channelUp();
		tv1.volumeDown();
		System.out.println("channel " + tv1.channel + " volume "+ tv1.volumeLevel + " on: " + tv1.on);

	}

}
