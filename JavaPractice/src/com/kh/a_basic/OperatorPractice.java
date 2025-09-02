package com.kh.a_basic;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// practice1();
		practice2();
	}
	
	public static void practice1() {
		// 키보드로 입력받은 정수가 양수이면 "양수다"
		//			, 양수가 아니면 "양수가 아니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
	}
	
	public static void practice2() {
		// 양수인 경우 "양수다",
		// 그렇지 않은 경우 중 0이면 "0이다", 그렇지않으면 "음수다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : 
							( num == 0 ? "0이다" : "음수다" );
		System.out.println(result);
	}

}





