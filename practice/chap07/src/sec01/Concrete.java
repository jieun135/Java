package sec01;

class Concrete extends Abstract {
	
	int j;
	
	public Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	void show() {
		System.out.println("i = "+i+" j = "+j);
		
	}
		
}
