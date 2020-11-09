package zad3.TV;

public class TV {

	public int channel;
	public int volumeLevel;
	public boolean on;
	
	TV(){
		channel = 1;
		volumeLevel = 3;
		on = false;
	}
	
	public void turnOn() {
			on = true;
	}
	
	public void turnOff() {
		on = false;
    }

	
	public void setChannel (int newChannel) {
		if (newChannel > 120 || !on) {
		return;
	}
	 channel = newChannel;
	}
	
	public void setVolume(int newVolume) {
		if (newVolume > 7 || !on) {
		return;
	}
	volumeLevel = newVolume;
	}

	
	public void channelUp() {
		
		if (channel == 120 || !on) {
			return;
		}
		channel ++;
	}
	
	public void channelDown() {
		
		if (channel == 1 || !on) {
			return;
		}
		channel --;
	}
	
	
	public void volumeUp() {		
		if (volumeLevel == 7 || !on) {
         return;
		}
		volumeLevel ++;
	}
	
	public void volumeDown() {
		if (volumeLevel == 1 || !on) {	
			return;
		}
		volumeLevel --;
	}
			
}
