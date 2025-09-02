package test;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		// 1) 출력 "첫 번째 숫자 : "
		System.out.print("첫 번째 숫자 : ");
		
		// 2) 입력 . 숫자를 입력받기 => nextInt()
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		// 3) 출력 "두 번째 숫자 : "
		System.out.print("두 번째 숫자 : ");
		
		// 4) 입력. 숫자
		int num2 = sc.nextInt();
		
		// 5) 출력 {num1} + {num2} = {num1+num2}
		// System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
	}
}





