package sec03;

public class Talkable {

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
	
	static void speak(Talkabe talkabe) {
		talkabe.talk();
	}

}
