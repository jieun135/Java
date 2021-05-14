package sec01;

public class Pythagorean {

	public static void main(String[] args) {
		int sum =20;
		
		for(int a = 1; a < sum/2; a++) {
			for(int b = 1; b <sum/2; b++) {
				for(int c = 1; c<sum/2; c++) {
					if(a*a+b*b==c*c)
						System.out.printf("%d %d %d \n", a,b,c);
				}
			}
		}
	}

}
