package kosa.board;

public class Board {
	
	private int id;
	private String name;
	private String str;
	private String nickName;
	private int password;
	
	public Board() {
		
	}
	
	public Board(int id, String name, String str, String nickName, int password) {
		this.id = id;
		this.name = name;
		this.str = str;
		this.nickName = nickName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
