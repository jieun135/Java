package sec01;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double w,h,result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = sc.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = sc.nextDouble();
		
		result = w * h;
		
		System.out.print("직사각형의 넓이는 " + result + "입린다.");
		
		
	}

}