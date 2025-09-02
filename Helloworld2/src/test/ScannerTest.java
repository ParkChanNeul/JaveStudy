package test;

import java.util.Scanner;

public class ScannerTest {
	//자바 프로그램 실행 시 반드시 필요한 것(시작점)
	// => main 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 단어나 입력하세요 :");
		String str= sc.nextLine();
		System.out.print("당신이 입력한 단어는 다음과 같습니다.");
		System.out.println(str);
		sc.close();
		
	}

}
