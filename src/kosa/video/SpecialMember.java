package kosa.video;

public class SpecialMember extends GeneralMember{
	int point;
	String[] spMember = {"김첨지", "김철수"};
	public SpecialMember() {
		
	}

	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);
		this.point = point;
	}
	
	public void pointMember(String name, int point) {
		boolean spMem = false;
		for(int i=0; i<spMember.length; i++) {
			if(name.equals(spMember[i])) {
				point += 10;
				System.out.println("회원의 보너스 포인트 적립 : " + point);
				spMem = true;
			}
		}
		
		if(!spMem) System.out.println("회원은 특별회원이 아닙니다.");
	}
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void rental(Video video) {
		super.rental(video);
		this.point += 100;
		
	}

	@Override
	public void show () {
		super.show();
		System.out.println("보너스 포인트 : " + point);
	}
	
	public void specialPrint() {
		System.out.println("스폐셜 멤버");
	}
}
