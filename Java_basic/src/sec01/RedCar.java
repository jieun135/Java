package sec01;

public class RedCar {

	public static void main(String[] args) {
		Car1 c1 = new Car1("red");
		Car1 c2 = new Car1("blue");
		Car1 c3 = new Car1("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차수 :%d", Car1.getNumOfCar(), Car1.getNumOfRedCar());
	}
}

class Car1{
	static int carAccount = 0;
	static int carRedAccount = 0;
	private String color;
	
	
	public static int getNumOfCar() {
		return carAccount;
	}
	
	public static int getNumOfRedCar() {
		return carRedAccount;
	}
	
	public Car1(String color) {
		this.color = color;
		carAccount++;
		if (color.equalsIgnoreCase("red")) {
			carRedAccount++;
		}
		
	}
}
