package sec01;
import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int se = in.nextInt();
		System.out.printf("%d시간 %d분 %d초", se/3600, se/60, se%60);

	}

}
