package sec01;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();
		
		result = 1;
		while(n > 0) {
			result *= n;
			n--;
		}
		
		System.out.println(result);
	}

}
