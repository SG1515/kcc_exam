package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		
		// TV �͸� ���� Ŭ������ �����غ���.
		RemoteControl rc = new RemoteControl() {
		private int volume;
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV�� �Ҵ�.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV�� ���ϴ�.");
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
				System.out.println("���� TV�� ������ " + this.volume);
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		
		// Audio ��ü�� ���� (��ü) 
		// RemoteControl - ���� ��ü�� �Ǿ� �־ rc�� �ٸ� ������ü�� �ٲ� �� ����.
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		
//		System.out.println("������ �ִ� ���� " + RemoteControl.MAX_VOLUME);
//		System.out.println("������ �ּ� ���� " + RemoteControl.MIN_VOLUME);
	}

}
