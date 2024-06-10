package kosa.ifmission;

public class Reader extends Man implements Speakable{

	private Man man;
	
	public Reader(String name) {
		super();
		this.man = new Man(name);
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Reader() {
		
	}
	
	

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(man.getName() + " 자바 화이팅");
	}

}
