package sec01;

import java.util.Scanner;

public class URL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("URL을 입력하세요 : ");
			String URL = in.next();
			String end = "com";
			String word = "java";
			boolean q;
			
			if(q = URL.endsWith(end)) {
				System.out.println(URL +"은 'com'으로 끝납니다. ");
			}
			else if(q = URL.contains(word)) {
				System.out.println(URL + "은 'java'를 포함합니다.");
			}
			
			if(q = URL.equals("bye")) break;
		}
	}
}