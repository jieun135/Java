package sec01;

import java.util.Scanner;

public class URL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			String URL = in.next();
			String end = "com";
			String word = "java";
			boolean q;
			
			if(q = URL.endsWith(end)) {
				System.out.println(URL +"�� 'com'���� �����ϴ�. ");
			}
			else if(q = URL.contains(word)) {
				System.out.println(URL + "�� 'java'�� �����մϴ�.");
			}
			
			if(q = URL.equals("bye")) break;
		}
	}
}