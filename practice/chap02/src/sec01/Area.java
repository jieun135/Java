package sec01;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		double w,h,result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		w = sc.nextDouble();
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		h = sc.nextDouble();
		
		result = w * h;
		
		System.out.print("���簢���� ���̴� " + result + "�Ը���.");
		
		
	}

}