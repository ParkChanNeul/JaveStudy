package com.kh.b_condition;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 메뉴 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		// 메뉴 번호 입력 받아 저장
		int menu = sc.nextInt();
		
		// 해당 메뉴 정보 출력
		switch(menu) {
		case 1: 
			System.out.println("입력 메뉴입니다."); 
			break;
		case 2: 
			System.out.println("수정 메뉴입니다."); 
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
//		default:
//			System.out.println("없는 메뉴입니다.");
		}
	}

}




