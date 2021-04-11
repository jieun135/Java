import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int score = in.nextInt();
		String result;
		switch(score) {
		case 1 -> result = "아주 잘했습니다";
		case 2, 3 -> result = "잘했습니다.";
		case 4,5,6 -> result = "보통입니다.";
		default -> result = "노력해야겠습니다.";
		}
		System.out.print(result);
		}

	}
