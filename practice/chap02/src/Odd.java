import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		int num;
		int result = 0;
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			num = in.nextInt();
			if(num % 2 ==0) {
				result += num;
			}
		}while(num >=0);
		System.out.print(result);

	}

}