package test;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("이름 : ");
		String str = name.nextLine();
		System.out.print("Hello, ");
		System.out.println(str);
		name.close();
	}

}
