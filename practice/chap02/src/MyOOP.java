class Print{
    public String delimiter = "";
    
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
public class MyOOP {
    public static void main(String[] args) {
        Print p1 = new Print();
        Print p2 = new Print();
        p1.delimiter = "----";
        p1.A();
        
        p2.delimiter = "****";
        p2.B();
    }
}