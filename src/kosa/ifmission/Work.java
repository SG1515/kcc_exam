package kosa.ifmission;

public class Work extends Man implements Speakable{

	private Man man;
	
	public Work(String name) {
		super();
		this.man = new Man(name);
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Work() {
		
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(man.getName() + " 열심히 일해야한다.");
	}

}
