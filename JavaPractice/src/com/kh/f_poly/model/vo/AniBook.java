package com.kh.f_poly.model.vo;

public class AniBook extends Book {
	private int accessAge; // 제한 나이
	
	public AniBook() {}
	
	public AniBook(String title, String author
					, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	//+ toString() : String
	@Override
	public String toString() {
		return "AniBook ["+ super.toString()	
				+", accessAge=" + accessAge + "]";
	}
	
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
}





