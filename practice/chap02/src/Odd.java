import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		int num;
		int result = 0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = in.nextInt();
			if(num % 2 ==0) {
				result += num;
			}
		}while(num >=0);
		System.out.print(result);

	}

}
