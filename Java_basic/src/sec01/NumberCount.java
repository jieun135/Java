package sec01;
import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Count f1 = new Count();
		System.out.print("N������ ���� ���ϰ� ���� ������ �Է��ϼ��� : ");
		int num = in.nextInt();
		
		f1.test = num;
		int result = f1.test(num);
	}
}

public class Count{
	public void test(int n) {
		int result;
		for (int j = 0; j<=n; j++) {
			result +=j;
		}
		return result;
	}
}