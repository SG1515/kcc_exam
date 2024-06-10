package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		OracleDao dao = new OracleDao();
		MySQLDao mysql = new MySQLDao();
		MyService service = new MyService(dao);
//		MyService service = new MyService(mysql);
		service.insertService();
		
		
	}

}
