import java.util.Scanner;

public class Kids {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int age = in.nextInt();
		String result;
		if (age >= 19 ) result = "����";
		else result = "�̼���";
		System.out.print(result);
	}

}