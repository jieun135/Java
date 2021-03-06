package sec01;

import java.util.Scanner;

public class Factorial3 {

	public static void main(String[] args) {
		int result, n, k;
		Scanner in = new Scanner(System.in);
		
		System.out.print("처음 정수를 입력하세요 : ");
		n = in.nextInt();
		System.out.print("마지막 정수를 입력하세요 : ");
		k = in.nextInt();
		result = factorial(n, k);
		
		System.out.println(result);
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		result = factorial(n);
		
		System.out.println(result);
	}
	
	static int factorial(int x, int y) {
		int j = 1;
		
		while(x <= y) {
			j *= y;
			y--;
		}
		return j;
	}
	
	static int factorial(int x) {
		int j = 1;
		
		while(x > 0) {
			j *= x;
			x--;
		}
		return j;
	}
}