package com.kh.a_basic;

import java.util.Scanner;

public class VariablePractice {
	
	public static void main(String[] args) {
		// practice1();
		
		practice4();
	}
	
	public static void practice1() {
		// 입력 -> Scanner
		Scanner sc = new Scanner(System.in);
		
		// 이름, 성별, 나이, 키를 입력받아 출력하기
		System.out.print("이름을 입력하세요 : ");
		// "아무개" --> String
		String name = sc.nextLine();
		
		// "남" 또는 "여" --> String
		System.out.print("성별을 입력하세요 (남/여) : ");
		String gender = sc.nextLine();
		// sc.next(), sc.nextLine() : String 형태로만 읽어옴
		// => 문자타입으로 추출하고자 할 경우 : 문자열.charAt(위치) : char 형태로 추출
		char gen = gender.charAt(0);
		
		// 20 --> int
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		// 180.5 --> double
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		// 결과 출력
		/*
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^"
							, height, age, gender, name);
		*/
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^"
				, height, age, gen, name);
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		// apple --> "apple" --> String
		String str = sc.nextLine();
		// String str = "apple";
	
		char ch1 = str.charAt(0);
		System.out.println("첫 번째 문자 : " + ch1);
		
		char ch2 = str.charAt(1);
		System.out.println("두 번째 문자 : " + ch2);
		
		char ch3 = str.charAt(2);
		System.out.println("세 번째 문자 : " + ch3);
	}
}





