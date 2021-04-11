package sec01;

import java.util.Scanner;

public class CaseWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A,B;
		
		while(true) {
			A = in.nextInt();
			B = in.nextInt();
			
			if(A == 0 && B ==0) break;
			
			System.out.println(A+B);
		}

	}

}
