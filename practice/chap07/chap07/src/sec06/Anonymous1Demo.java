package sec06;

public class Anonymous1Demo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("�������� ����~~~.");
		}
		
		public void sound() {
			System.out.println("����~~~.");
		}
	};
	
	public static void main(String[] args) {
		Anonymous1Demo m = new Anonymous1Demo();
		m.e.move();
		//m.e.sound();
	}

}
