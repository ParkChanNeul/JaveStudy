package com.kh.d_object.practice2.model.vo;

public class Book {
	
	// 필드부
	/*
	 * title: String
	 * publisher : String
	 * author : String
	 * price : int
	 * discountRate : double
	 * 
	 * 접근 제한자 : private
	 *  
	 */

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
		
	// 생성자부
	/*
	 * Book()
	 * Book(title:String, publisher:String, author:String)
	 * Book(title:String, publisher:String, author:String, price:int, discountRate:double)
	 * 
	 * 접근 제한자 : public
	 *  
	 */
	
	public Book() {}
	public Book(String title, String publisher, String author) {
		
	}
	public Book(String title, String publisher, String author, int price , double discountRate) {
		
	}
		
	// 메소드부
	/*
	 * inform() : void
	 * 
	 * 접근 제한자 : public
	 * 
	 */
	
	public void inform() {
		System.out.printf("%s,%s,%s,%d,%f\n"
				, title, author, publisher, price, discountRate);
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
