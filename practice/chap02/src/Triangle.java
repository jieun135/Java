
public class Triangle {

	public static void main(String[] args) {
		TriangleF t1 = new TriangleF(10.0, 5.0);
		TriangleF t2 = new TriangleF(5.0, 10.0);
		TriangleF t3 = new TriangleF(8.0, 8.0);
		System.out.println(t1.findArea());
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}

class TriangleF{
	private double side;
	private double height;
	
	public TriangleF(double height, double side) {
		this.height = height;
		this.side = side;
	}
	
	public double getHeight() {
		return height;
	}
	public double getSide() {
		return side;
	}
	public double findArea() {
		return side * height * 0.5;
	}
	public boolean isSameArea(TriangleF triangleF1) {
		double area = findArea();
		double area1 = triangleF1.findArea();
		
		if(area == area1)
			return true;
		else
			return false;
	}
}