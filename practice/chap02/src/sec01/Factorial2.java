package sec01;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		result = factorial(n);
		
		System.out.print(result);
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