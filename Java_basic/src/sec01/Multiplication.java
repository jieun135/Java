package sec01;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = in.nextInt();
		System.out.printf("%d의 제곱은 %d", num, num*num);

	}

}
