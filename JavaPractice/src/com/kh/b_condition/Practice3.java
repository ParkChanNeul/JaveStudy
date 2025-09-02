package com.kh.b_condition;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0-100) : ");
		int score = sc.nextInt();
		
		if (0 <= score && score <= 100) {
			
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				// score >= 90 를 만족하지 않고
				// 		score >= 80 을 만족하는 경우
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("F");
			}
			
		} else {
			System.out.println("점수를 올바르게 입력해주세요.");
		}
		
		sc.close();
	}

}





