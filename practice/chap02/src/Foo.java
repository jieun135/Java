public class Foo {

	public static void main(String[] args) {
		foo("?ȳ?",1);
		foo("?ȳ??ϼ???", 1,2);
		foo("?? ?־?");
	}
	
	public static void foo(String s, int a){
		System.out.printf("%s %d\n", s,a);
	}
	public static void foo(String s, int a, int b) {
		System.out.printf("%s %d %d \n", s,a,b);
	}
	public static void foo(String s) {
		System.out.printf("%s \n", s);
	}

}
