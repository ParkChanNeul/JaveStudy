package test;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("이름 : ");
		String str = name.nextLine();
		System.out.printf("Hello, %s !", str);
		name.close();
	}


}
