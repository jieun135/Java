package sec01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < num-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}