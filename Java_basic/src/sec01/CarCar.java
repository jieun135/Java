package sec01;

public class CarCar {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		Car c4 = new Car("white");
		
		System.out.printf("자동차수 :%d, 빨간색 자동차 수 :%d", Car.getNumOfCar(),
				Car.getNumOfRedCar());
	}
}

class Car{
	public static int count, NumOfRedCar;
	private String color;
	
	public Car(String color) {
		this.color = color;
		count++;
		if(color.equalsIgnoreCase("red")) NumOfRedCar++;
	}
	public static int getNumOfCar() {
		return count;
	}
	public static int getNumOfRedCar() {
		return NumOfRedCar;
	}
}
