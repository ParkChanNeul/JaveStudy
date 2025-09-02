package com.kh.control;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		
		int num = 100;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		
		if (num % 2 != 0) {
			System.out.println("홀수");
		}
	}
	/*
	 * 제어문 : 프로그램의 흐름을 제어하는 문법
	 * 		-> 프로그램의 기본 흐름: 위에서 아래로, 왼쪽에서 오른쪽으로!
	 * 
	 * * 조건문 : 조건에 따라 흐름을 제어하는 문법
	 *   "if", switch
	 */
	
	public static void test1() {
		// * 점수에 따라 결과 출력
		//   90점 이상 "A", 80점 이상 "B", 70점 이상 "C", 그 외에는 "F"
		
		int score = 77;
		String result = "";
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {	// !(score >= 90) && (score >= 80)
			result = "B";
		} else if (score >= 70) {  // 70 <= score && score < 80
			result = "C";
		} else {		// => 모든 조건을 만족하지 않을 때!
			result = "F";
		}
		
		System.out.println(result);
	}

}










