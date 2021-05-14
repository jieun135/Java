package sec01;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[9];
		for(int i = 0; i < 9; i++) {
			num[i] = in.nextInt();
		}
		
		int count = 0;
		int max = 0;
		
		for(int j = 0; j < 8; j++) {
			if(num[j] > max) {
				max = num[j];
				count++;
			}
			else {
				max = max;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}
