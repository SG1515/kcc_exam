package kosa.oop3;

public class Person {
	
	private String name;
	private Role role;
	
	public Person() {
		
	}
	
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void doIt() {
		// TODO Auto-generated method stub
		role.doing();
	}
}
