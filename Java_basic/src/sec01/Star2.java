package sec01;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();

		for(int i = 1; i <= num; i++) {
			
			for(int j = i; j<num; j++) {
				System.out.print(" ");
			}
			for(int k = i; k > 0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
