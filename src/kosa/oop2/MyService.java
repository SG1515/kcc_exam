package kosa.oop2;

public class MyService {
	
	private Dao dao;
	
	
	public MyService() {
	}

	

	public Dao getDao() {
		return dao;
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}


	public MyService(Dao dao) {
		super();
		this.dao = dao;
	}



	public void insertService() {
		dao.insert();
	}



}
