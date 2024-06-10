package kosa.movie;

public class Stand {
	private int popcornKcal;
	private int popcornPrice;
	private int popcornSize;
	private String popcornTaste;
	private int buyNum;
	
	
	public Stand() {
		
	}
	

	public Stand(int popcornKcal, int popcornPrice, int popcornSize, String popcornTaste) {
		super();
		this.popcornKcal = popcornKcal;
		this.popcornPrice = popcornPrice;
		this.popcornSize = popcornSize;
		this.popcornTaste = popcornTaste;
	}


	public int getPopcornKcal() {
		return popcornKcal;
	}

	public void setPopcornKcal(int popcornKcal) {
		this.popcornKcal = popcornKcal;
	}

	public int getPopcornPrice() {
		return popcornPrice;
	}

	public void setPopcornPrice(int popcornPrice) {
		this.popcornPrice = popcornPrice;
	}

	public int getPopcornSize() {
		return popcornSize;
	}

	public void setPopcornSize(int popcornSize) {
		this.popcornSize = popcornSize;
	}

	public String getPopcornTaste() {
		return popcornTaste;
	}

	public void setPopcornTaste(String popcornTaste) {
		this.popcornTaste = popcornTaste;
	}


	public void getPopcornInfo() {
		// TODO Auto-generated method stub
		System.out.println("∏¿ : " + popcornTaste);
		System.out.println("∞°∞› : " + popcornPrice);
		System.out.println("ªÁ¿Ã¡Ó : " + popcornSize);
		System.out.println("ƒÆ∑Œ∏Æ : " + popcornKcal);
	}


	public void popcorn(Person p) {
		
		// TODO Auto-generated method stub
		
	}
	


}
