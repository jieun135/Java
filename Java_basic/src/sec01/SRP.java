package sec01;
import java.util.Scanner;
public class SRP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ö�� : ");
		String a = in.next();
		System.out.print("���� : ");
		String b = in.next();
		System.out.printf("%s", result(a,b));
		
	}
	public static String result(String a, String b) {
		String win;
		
		if(a.equals(b)) return win = "��";
		else if(a.equals("r") && b.equals("s") || a.equals("s") && b.equals("p") || a.equals("p")&&b.equals("r")) return win = "ö��, ��!";
		else return win = "����, ��!";
		
	}

}
