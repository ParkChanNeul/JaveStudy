package com.kh.b_loop;

import java.util.Scanner;  // Ctrl + Shift + O

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 두 개의 값을 입력받아
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		// 입력된 값들이 1 미만인 경우 안내 문구 출력
		if(n1 < 1 || n2 < 1) {
			// n1이 1보다 작거나 n2가 1보다 작은 경우
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			// n1, n2가 모두 1보다 크거나 같을 경우
			
			// [1] 첫번째 숫자가 두번째 숫자보다 작다고 가정
			//     첫번째 숫자부터 두번째 숫자까지 출력
			/*
			for(int i=n1; i<=n2; i++) {
				System.out.print(i + " ");
			}
			*/
			// [2] 입력된 두 값중 큰값, 작은값을 비교
			int max = n1 > n2 ? n1 : n2;
			int min = n1 > n2 ? n2 : n1;
			
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
			
		}

	}

}






