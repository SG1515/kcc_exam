package kosa.video;

public class SpecialMember extends GeneralMember{
	int point;
	String[] spMember = {"��÷��", "��ö��"};
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
				System.out.println("ȸ���� ���ʽ� ����Ʈ ���� : " + point);
				spMem = true;
			}
		}
		
		if(!spMem) System.out.println("ȸ���� Ư��ȸ���� �ƴմϴ�.");
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
		System.out.println("���ʽ� ����Ʈ : " + point);
	}
	
	public void specialPrint() {
		System.out.println("����� ���");
	}
}
