package sec01;
import java.util.Scanner;
public class SRP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ã¶¼ö : ");
		String a = in.next();
		System.out.print("¿µÈñ : ");
		String b = in.next();
		System.out.printf("%s", result(a,b));
		
	}
	public static String result(String a, String b) {
		String win;
		
		if(a.equals(b)) return win = "¹«";
		else if(a.equals("r") && b.equals("s") || a.equals("s") && b.equals("p") || a.equals("p")&&b.equals("r")) return win = "Ã¶¼ö, ½Â!";
		else return win = "¿µÈñ, ½Â!";
		
	}

}
