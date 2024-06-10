package kosa.ifmission;

public class Student extends Man{
	
	private Man man;
	
	public Student() {
		
	}
	
	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Student(String name) {
		super();
		this.man = new Man(name);
	}

	public void speak() {
		System.out.println(man.getName() + "공부나 열심히 해");
	}

}
