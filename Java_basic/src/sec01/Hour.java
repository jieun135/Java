package sec01;
import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int se = in.nextInt();
		System.out.printf("%d�ð� %d�� %d��", se/3600, se/60, se%60);

	}

}
