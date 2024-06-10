package kosa.oop4;

public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ÄÒ´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ²ö´Ù."); 
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) 
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else 
			this.volume = volume;
		System.out.println("ÇöÀç AudioÀÇ º¼·ýÀº " + this.volume);		
	}

}
