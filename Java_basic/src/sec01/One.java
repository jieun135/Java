package sec01;
import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? : ");
		int a = in.nextInt();
		System.out.print("원기둥의 높이는? : ");
		int b = in.nextInt();
		
		System.out.printf("원기둥의 부피는 %4.1f", 3.14*a*a*b);

	}

}
