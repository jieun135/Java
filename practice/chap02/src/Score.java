import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int score = in.nextInt();
		String result;
		switch(score) {
		case 1 -> result = "���� ���߽��ϴ�";
		case 2, 3 -> result = "���߽��ϴ�.";
		case 4,5,6 -> result = "�����Դϴ�.";
		default -> result = "����ؾ߰ڽ��ϴ�.";
		}
		System.out.print(result);
		}

	}
