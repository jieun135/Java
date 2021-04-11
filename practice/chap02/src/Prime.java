import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		@SuppressWarnings("resource")
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num))
			System.out.println(num+"는 소수");
		else 
			System.out.println(num + "는 소수가 아님");
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