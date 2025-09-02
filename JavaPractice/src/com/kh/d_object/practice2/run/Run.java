package com.kh.d_object.practice2.run;

import com.kh.d_object.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book p1 = new Book();
		p1.setTitle("객체 지향의 사실과 오해");
		p1.setAuthor("조영호");
		p1.setPublisher("위키북스");
		p1.setPrice(25000);
		p1.setDiscountRate(0.1);
		
		p1.inform();
		
		Book p2 = new Book();
		p2.setTitle("클린 코드");
		p2.setAuthor("로버트.C");
		p2.setPublisher("인사이트");
		p2.setPrice(38000);
		p2.setDiscountRate(0.15);
		
		p2.inform();

	}

}
