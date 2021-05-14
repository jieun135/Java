package sec01;
import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		
		String test[] = word.split(" ");
		
		for(int i = 0; i <= test.length; i++) {
			System.out.print(test[i]);
		}
	}

}
