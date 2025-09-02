package test;

import java.util.Scanner; // import 패키지경로.클래스명;

public class Practice1 {
	// 프로그램 시작은 main 메소드!
	public static void main(String[] args) {
		// "이름 : " 출력
		System.out.print("이름 : ");
		
		// 입력 받기! -- Scanner
		// 1) 포함시키기 2) 준비시키기 3) 사용하기
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		// "Hello, {이름}!" 출력하기
		/*
		System.out.print("Hello, ");
		System.out.print(name);
		System.out.print("!");
		
		System.out.print("Hello, " + name + "!\n");
		*/
		// System.out.println("Hello, " + name + "!");
		System.out.printf("Hello, %s!", name);
	}
}
