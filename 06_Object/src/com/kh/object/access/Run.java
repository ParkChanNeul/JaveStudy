package com.kh.object.access;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		// public 멤버 접근
		System.out.println( test.publicField );
		test.publicMethod();
		
		//protected 멤버 접근
		System.out.println( test.protectedField );
		test.protectedMethod();
		
		//default 멤버 접근 => 같은 패키지로 접근 가능
		System.out.println( test.protectedField);
		test.defaultMethod();
		
		// private 멤버 접근 => 같은 클래스로 접근 불가
//		System.out.println( test.privateField );
//		test.privateMethod();
		// => private 제한자 사용 이유
		//	  : 객체의 데이터를 외부로부터 안전하게 보호하기 위함 (정보 은닉)
		//	    객체 지향 핵심 원리 중 하나인 캡슐화를 실현하는 데 사용!
	}

}
