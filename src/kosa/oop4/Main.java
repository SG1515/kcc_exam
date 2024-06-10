package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		
		// TV 익명 내부 클래스로 구현해보기.
		RemoteControl rc = new RemoteControl() {
		private int volume;
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV를 켠다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV를 끕니다.");
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
				System.out.println("현재 TV의 볼륨은 " + this.volume);
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		
		// Audio 객체를 대입 (교체) 
		// RemoteControl - 상위 객체로 되어 있어서 rc에 다른 하위객체로 바꿀 수 있음.
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		
//		System.out.println("리모콘 최대 볼륨 " + RemoteControl.MAX_VOLUME);
//		System.out.println("리모콘 최소 볼륨 " + RemoteControl.MIN_VOLUME);
	}

}
