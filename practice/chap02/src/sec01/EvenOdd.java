package sec01;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int num = in.nextInt();
		if(num%2 == 0) {
			System.out.print(num +"�� ¦���Դϴ�.");
		}
		else {
			System.out.print(num + "�� Ȧ���Դϴ�.");
		}

	}

}