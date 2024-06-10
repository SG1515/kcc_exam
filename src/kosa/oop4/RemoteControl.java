package kosa.oop4;

public interface RemoteControl {
	// 인터페이스 필드는 public static final 특성 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	//public abstract를 생략해도 됨 컴파일 과정에서 붙음
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
		}
	}
}
