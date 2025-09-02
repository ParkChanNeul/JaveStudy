package com.kh.b_loop;

import java.util.Scanner;

public class Practice5 {
	/**
	 * 다음과 같은 결과가 출력되도록 구현하세요.
	 * 
	 * 출력 예시)
	 * 정수 입력 : 4
	 * ****
	 * ***
	 * **
	 * *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
