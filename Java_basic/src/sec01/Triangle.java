package sec01;

public class Triangle {

	public static void main(String[] args) {
		TriangleTest t = new TriangleTest(10.0, 5.0);
		System.out.println(t.findArea());
	}
}

class TriangleTest{
	private double weight;
	private double height;
	
	public TriangleTest(double weight, double height) {
		this.height = height;
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public double getheight() {
		return height;
	}
	
	public double findArea() {
		return height * weight/2;
	}
}
