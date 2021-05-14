package sec01;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		int numOfStudents = 0;
		int[] scores;
		
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요");
		for(int i = 0; i< scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.print(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.print("\n");
		
		String result;
		int count = 1;
		for(int i : scores) {
			if(i >= 90) result = "A";
			else if (i >=80) result ="B";
			else result = "C";
			System.out.println((count)+ "번 학생의 등급은 "+ result +"입니다.");
			count++;
		}
	}

}
