import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		@SuppressWarnings("resource")
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num))
			System.out.println(num+"�� �Ҽ�");
		else 
			System.out.println(num + "�� �Ҽ��� �ƴ�");
	}

	public static boolean isPrime(int n) {
		int t = 0;
		for(int i = 2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}