package sec01;
import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� �ظ� ��������? : ");
		int a = in.nextInt();
		System.out.print("������� ���̴�? : ");
		int b = in.nextInt();
		
		System.out.printf("������� ���Ǵ� %4.1f", 3.14*a*a*b);

	}

}
