package sec01;

class Car{
	private String color;
	static int numOfCar = 0;
	static int numOfRedCar = 0;
	
	public Car(String color) {
		this.color = color;
		numOfCar++;
		
		if(color.equalsIgnoreCase("red"))
			numOfRedCar++;
	}
	
	static public int getNumOfCar() {
		return numOfCar;
	}
	static public int getNumOfRedCar()
	{
		return numOfRedCar;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("black");
		Car c2 = new Car("blue");
		Car c3 = new Car("red");
		
		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d",
				Car.getNumOfCar(), Car.getNumOfRedCar());
	

	}

}
