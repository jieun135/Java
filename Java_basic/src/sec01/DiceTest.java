package sec01;

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("�ֻ����� ���� : " + d.roll());
	}
}

class Dice{
	private double num;
	
	public int roll() {
		this.num = (Math.random() * 10%6) + 1;
		return (int)num;
	}
}