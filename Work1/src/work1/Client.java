package work1;

public class Client {
	public static void main(String a[]) {
		CellPhone p1 = new SimplePhone();
		p1.receiveCall();
		System.out.println(" ");
		CellPhone p2 = new JarPhone(p1);
		p2.receiveCall();
		System.out.println(" ");
		CellPhone p3 = new ComplexPhone(p2);
		p3.receiveCall();
	}
}
