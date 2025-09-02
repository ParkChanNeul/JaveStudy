package com.kh.g_collection.list.music.view;

import java.util.Scanner;

import com.kh.g_collection.list.music.model.controller.MusicController;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 가수 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("\n메뉴 번호 입력 : ");
			
			String in = sc.nextLine().trim();
			int menu;
			try {
				menu = Integer.parseInt(in);
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력했습니다. 1~9 숫자를 입력하세요.");
				continue;
			}
		}
		
	}
	
}
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out,print("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		
	}

	