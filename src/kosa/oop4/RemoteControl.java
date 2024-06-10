package kosa.oop4;

public interface RemoteControl {
	// �������̽� �ʵ�� public static final Ư�� 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	//public abstract�� �����ص� �� ������ �������� ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("���� ����");
		}
	}
}
