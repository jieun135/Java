import java.util.Scanner;

public class Kids {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int age = in.nextInt();
		String result;
		if (age >= 19 ) result = "성년";
		else result = "미성년";
		System.out.print(result);
	}

}
