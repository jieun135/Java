package sec01;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = in.nextInt();
		if(num%2 == 0) {
			System.out.print(num +"은 짝수입니다.");
		}
		else {
			System.out.print(num + "은 홀수입니다.");
		}

	}

}
