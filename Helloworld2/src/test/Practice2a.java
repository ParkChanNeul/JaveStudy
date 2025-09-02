package test;

import java.util.Scanner;

public class Practice2a {
	public static void main(String[] args) {
		System.out.print("첫 번째 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	
	}
}
